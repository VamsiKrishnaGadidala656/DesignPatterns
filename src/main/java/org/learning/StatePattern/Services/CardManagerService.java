package org.learning.StatePattern.Services;

import org.learning.StatePattern.models.Card;

public interface CardManagerService {

    public boolean validateCard(Card card, String pin);
    public boolean validateWithdrawl(Card card, int transaction, double amount);
    public boolean doTransaction(Card card, double amount, int transactionId);
}
