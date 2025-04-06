package org.learning.StatePattern.apis;

import org.learning.StatePattern.DTO.CreateTransactionRequestDTO;
import org.learning.StatePattern.DTO.GetAmountRequestDTO;
import org.learning.StatePattern.DTO.UpdateATMStateRequestDTO;

public class NodeBackendAPI implements BackendAPI{

    //responsible for connecting to the backend and returning the reponse

    @Override
    public int createTransaction(CreateTransactionRequestDTO createTransactionDTO) {

        //1.validation
        if (createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty()) {
            throw new IllegalArgumentException("atmId is null or empty");
        }

        //2.Connect to the Backend
        //To mimic the backend call, let's return a new transactionId
        int txnId = (int) (Math.random()*1000);

        return txnId;
    }

    @Override
    public boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO) {
        //assume that there is implementation that calls the backend to update the atm state


        return true;
    }

    @Override
    public int getATMAmount(GetAmountRequestDTO getAmountRequestDTO) {
        return 10000;
    }

}
