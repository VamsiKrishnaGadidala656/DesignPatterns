package org.learning.StatePattern.Services;

import org.learning.StatePattern.models.Card;

public class DebitCardManagerService implements CardManagerService{


    @Override
    public boolean validateCard(Card card, String pin) {
        //ideally we should make these also connect to backend API
        return true;
    }

    @Override
    public boolean validateWithdrawl(Card card, int transactionId, double amount) {
        return true;
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        return true;
    }


}
