package org.learning.StatePattern.State;

import org.learning.StatePattern.Enums.ATMState;
import org.learning.StatePattern.Services.CardManagerService;
import org.learning.StatePattern.factories.CardManagerFactory;
import org.learning.StatePattern.models.ATM;
import org.learning.StatePattern.models.Card;

public class ReadingCashWithdrawDetailsState implements State{

    private ATM atm;

    public ReadingCashWithdrawDetailsState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot initiate transaction while reading cash withdraw details");
    }

    @Override
    public boolean readCadDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("cannot read card details pin while reading cash withdraw details");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {

        CardManagerService cardManagerService = CardManagerFactory.getCardManager(card.getCardType());
        boolean isWithdrawValid = cardManagerService.validateWithdrawl(card,transactionId,amount);

        if (isWithdrawValid) {

            atm.changeState(new DispensingCashState(atm));
        }else {
            atm.changeState(new EjectingCardState(atm));
        }

        return isWithdrawValid;


    }

    @Override
    public int dispenseCash(Card card,int amount,int transactionId) {
        throw new IllegalStateException("cannot dispense cash while reading cash withdraw details");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("cannot eject card while reading cash withdraw details");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        atm.changeState(new ReadyForTransactionState(atm));
        return true;
    }

    @Override
    public ATMState getState() {
        return null;
    }
}
