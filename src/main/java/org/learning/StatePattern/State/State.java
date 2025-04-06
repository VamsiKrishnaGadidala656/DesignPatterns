package org.learning.StatePattern.State;

import org.learning.StatePattern.Enums.ATMState;
import org.learning.StatePattern.models.Card;

public interface State {

    public int initTransaction();

    public boolean readCadDetailsAndPin(Card card , String pin);

    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount);

    public int dispenseCash(Card card,int amount,int transactionId);

    public void ejectCard();

    public boolean cancelTransaction(int transactionId);

    public ATMState getState();

}
