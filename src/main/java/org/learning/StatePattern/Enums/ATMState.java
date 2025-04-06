package org.learning.StatePattern.Enums;

public enum ATMState {
    READY_FOR_TRANSACTION,
    READ_CARD_DETAILS_AND_PIN,
    READING_CASH_WITHDRAW_DETAILS,
    DISPENSING_CASH,
    EJECTING_CARD
}
