package org.learning.StatePattern.Services;

import org.learning.StatePattern.models.ATM;

public interface CashDispenserService {

    public void dispenseCash(ATM atm, int amount);
}
