package org.learning.StatePattern.DTO;

public class CreateTransactionRequestDTO {

    private String atmId;

    public CreateTransactionRequestDTO(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
