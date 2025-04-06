package org.learning.StatePattern.factories;

import org.learning.StatePattern.Enums.CardType;
import org.learning.StatePattern.Services.CardManagerService;
import org.learning.StatePattern.Services.CreditCardManagerService;
import org.learning.StatePattern.Services.DebitCardManagerService;

public class CardManagerFactory {

    public static CardManagerService getCardManager(CardType cardType) {
        CardManagerService cardManagerService = null;

        if (cardType.equals(CardType.DEBIT)) {
            cardManagerService = new DebitCardManagerService();
        } else if (cardType.equals(CardType.CREDIT)) {
            cardManagerService = new CreditCardManagerService();

        }else {
            throw new IllegalArgumentException("Invalid card type");
        }

        return cardManagerService;

    }
}
