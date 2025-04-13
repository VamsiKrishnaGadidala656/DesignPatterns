package org.learning.RouteHandler_ChainOfResponsbilityPattern.Services;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public interface TokenService {

    public boolean validateToken(Request request);
}
