package org.learning.StatePattern.Services;

import org.learning.StatePattern.models.Card;

public class CreditCardManagerService implements CardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        return true;
    }

    @Override
    public boolean validateWithdrawl(Card card,int transactionId, double amount) {
        return true;
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        return true;
    }
}
