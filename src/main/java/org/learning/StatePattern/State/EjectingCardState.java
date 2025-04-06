package org.learning.StatePattern.State;

import org.learning.StatePattern.Enums.ATMState;
import org.learning.StatePattern.models.ATM;
import org.learning.StatePattern.models.Card;

public class EjectingCardState implements State{

    private ATM atm;

    public EjectingCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot initiate transaction while ejecting card");
    }

    @Override
    public boolean readCadDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("cannot read card Details while ejecting card");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("cannot read cash withdraw Details while ejecting card");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("cannot dispense cash  while ejecting card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected, Please take it");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        return false;
    }

    @Override
    public ATMState getState() {
        return ATMState.EJECTING_CARD;
    }
}
