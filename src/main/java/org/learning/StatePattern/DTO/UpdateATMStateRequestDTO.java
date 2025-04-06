package org.learning.StatePattern.DTO;

import org.learning.StatePattern.Enums.ATMState;

public class UpdateATMStateRequestDTO {

    private String atmId;
    private ATMState atmState;

    public UpdateATMStateRequestDTO(String atmId, ATMState atmState) {
        this.atmId = atmId;
        this.atmState = atmState;
    }
}
