package org.learning.StatePattern.Services;

import org.learning.StatePattern.DTO.GetAmountRequestDTO;
import org.learning.StatePattern.apis.BackendAPI;
import org.learning.StatePattern.apis.NodeBackendAPI;
import org.learning.StatePattern.models.ATM;

public class CashDispenserServiceImpl implements CashDispenserService{

    private BackendAPI backendAPI;

    public CashDispenserServiceImpl() {
        this.backendAPI = new NodeBackendAPI();
    }



    @Override
    public void dispenseCash(ATM atm, int amount) {
        int atmAmount = backendAPI.getATMAmount(new GetAmountRequestDTO(atm.getAtmId()));

        if (atmAmount < amount) {
            throw new RuntimeException("atm doesn't have enough amount");
        }

        System.out.println("Dispensing cash :: " + amount);

    }
}
