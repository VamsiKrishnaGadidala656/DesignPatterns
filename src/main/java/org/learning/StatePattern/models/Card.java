package org.learning.StatePattern.models;

import org.learning.StatePattern.Enums.CardType;


public class Card {

    private long number;
    private int pin;
    private String name;
    private CardType cardType;
    private String bankName;

    public Card(long number, int pin, String name, CardType cardType, String bankName) {
        this.number = number;
        this.pin = pin;
        this.name = name;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", pin=" + pin +
                ", name='" + name + '\'' +
                ", cardType=" + cardType +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
