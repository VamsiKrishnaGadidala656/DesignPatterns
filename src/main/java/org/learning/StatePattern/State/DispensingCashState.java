package org.learning.StatePattern.State;

import org.learning.StatePattern.Enums.ATMState;
import org.learning.StatePattern.Services.CardManagerService;
import org.learning.StatePattern.Services.CashDispenserService;
import org.learning.StatePattern.Services.CashDispenserServiceImpl;
import org.learning.StatePattern.factories.CardManagerFactory;
import org.learning.StatePattern.models.ATM;
import org.learning.StatePattern.models.Card;

public class DispensingCashState implements State{

    private ATM atm;
    private CashDispenserService cashDispenserService;

    public DispensingCashState(ATM atm) {
        this.atm = atm;
        this.cashDispenserService = new CashDispenserServiceImpl();
    }



    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot initiate transaction details while dispensing cash");
    }

    @Override
    public boolean readCadDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("cannot read card details while dispensing cash");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("cannot read cash withdraw details while dispensing cash");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {

        CardManagerService cardManagerService = CardManagerFactory.getCardManager(card.getCardType());
        boolean isTransactionSuccessful = cardManagerService.doTransaction(card,amount,transactionId);
        if (isTransactionSuccessful) {
            cashDispenserService.dispenseCash(atm,amount);
            
        }else {
            System.out.println("something went wrong");
        }
        atm.changeState(new EjectingCardState(atm));
        return amount;
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("cannot eject card while dispensing cash");

    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("cannot cancel while dispensing cash");
    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSING_CASH;
    }
}
