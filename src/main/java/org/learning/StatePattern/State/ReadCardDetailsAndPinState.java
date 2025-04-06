package org.learning.StatePattern.State;

import org.learning.StatePattern.Enums.ATMState;
import org.learning.StatePattern.Services.CardManagerService;
import org.learning.StatePattern.factories.CardManagerFactory;
import org.learning.StatePattern.models.ATM;
import org.learning.StatePattern.models.Card;

public class ReadCardDetailsAndPinState implements State{

    private ATM atm;

    public ReadCardDetailsAndPinState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot init transaction while reading card details and pin");
    }

    @Override
    public boolean readCadDetailsAndPin(Card card, String pin) {

        CardManagerService cardManagerService = CardManagerFactory.getCardManager(card.getCardType());
        boolean isCardValid = cardManagerService.validateCard(card,pin);
        if (isCardValid) {
            atm.changeState(new ReadingCashWithdrawDetailsState(atm));
        }else {
            atm.changeState(new EjectingCardState(atm));
        }
        return isCardValid;
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("cannot read cash withdraw details while reading card details and pin");
    }

    @Override
    public int dispenseCash(Card card,int amount,int transactionId) {

        throw new IllegalStateException("cannot dispense cash while reading card details and pin");

    }

    @Override
    public void ejectCard() {

        throw new IllegalStateException("we can't eject card while reading card details");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {

        try {
            atm.changeState(new ReadyForTransactionState(atm));

        }catch (Exception e) {
            throw new IllegalStateException("cannot cancel transaction");
        }
        return true;
    }

    @Override
    public ATMState getState() {
        return ATMState.READ_CARD_DETAILS_AND_PIN;
    }
}
