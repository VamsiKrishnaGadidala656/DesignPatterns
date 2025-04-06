package org.learning.StatePattern.apis;

import org.learning.StatePattern.DTO.CreateTransactionRequestDTO;
import org.learning.StatePattern.DTO.GetAmountRequestDTO;
import org.learning.StatePattern.DTO.UpdateATMStateRequestDTO;

public interface BackendAPI {

    int createTransaction(CreateTransactionRequestDTO createTransactionDTO);

    boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO);
    public int getATMAmount(GetAmountRequestDTO getAmountRequestDTO);
}
