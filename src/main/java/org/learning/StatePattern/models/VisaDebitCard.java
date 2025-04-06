package org.learning.StatePattern.models;

import org.learning.StatePattern.Enums.CardType;

public class VisaDebitCard extends Card implements Visa,Debit{


    public VisaDebitCard(long number, int pin, String name, CardType cardType, String bankName) {
        super(number, pin, name, cardType, bankName);
    }

    @Override
    public void makePinPayment() {
        this.connectToVisa();
        System.out.println("Making payment with pin");
    }

    @Override
    public void connectToVisa() {
        System.out.println("Connecting to visa");
    }
}
