package org.learning.StatePattern.models;

import org.learning.StatePattern.DTO.UpdateATMStateRequestDTO;
import org.learning.StatePattern.State.ReadyForTransactionState;
import org.learning.StatePattern.State.State;
import org.learning.StatePattern.apis.BackendAPI;
import org.learning.StatePattern.apis.NodeBackendAPI;

public class ATM {

    private String atmId;

    private State state;

    private BackendAPI backendAPI;

    public ATM(String atmId) {
        this.atmId = atmId;
        this.backendAPI = new NodeBackendAPI();
        this.state = new ReadyForTransactionState(this);
    }

    public String getAtmId() {
        return atmId;
    }

    public void changeState(State state) {
        this.state = state;
        //now call the server, to persist the state on the server also
        UpdateATMStateRequestDTO updateATMStateRequestDTO = new UpdateATMStateRequestDTO(atmId,state.getState());
        backendAPI.updateState(updateATMStateRequestDTO);


    }
}
