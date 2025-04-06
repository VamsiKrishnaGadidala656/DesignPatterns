package org.learning.StatePattern.State;

import org.learning.StatePattern.DTO.CreateTransactionRequestDTO;
import org.learning.StatePattern.Enums.ATMState;
import org.learning.StatePattern.apis.BackendAPI;
import org.learning.StatePattern.apis.NodeBackendAPI;
import org.learning.StatePattern.models.ATM;
import org.learning.StatePattern.models.Card;

public class ReadyForTransactionState implements State{

    private ATM atm;
    private BackendAPI atmBackendAPI;

    public ReadyForTransactionState(ATM atm) {
        this.atm = atm;
        this.atmBackendAPI = new NodeBackendAPI();
    }

    @Override
    public int initTransaction() {
        CreateTransactionRequestDTO createTransactionDTO = new CreateTransactionRequestDTO(atm.getAtmId());
        int transactionId = atmBackendAPI.createTransaction(createTransactionDTO);

        if (transactionId == 0) {
            throw new RuntimeException("transaction cannot be created");
        }
        // now we have transaction id from backend,we should the ATM to next state

        atm.changeState(new ReadCardDetailsAndPinState(atm));
        return transactionId;
    }

    @Override
    public boolean readCadDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin without inserting card");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details without reading card details and pin");
    }

    @Override
    public int dispenseCash(Card card,int amount,int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without reading card details and pin");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("cannot cancel transaction");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}
