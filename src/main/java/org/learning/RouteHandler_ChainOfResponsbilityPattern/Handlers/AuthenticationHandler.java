package org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Services.TokenService;

public class AuthenticationHandler implements RequestHandler {

    private RequestHandler nextHandler;
    private TokenService tokenService;

    public AuthenticationHandler(RequestHandler nextHandler,TokenService tokenService) {
        this.nextHandler = nextHandler;
        this.tokenService = tokenService;
    }

    @Override
    public void handle(Request request) {
        System.out.println("AuthenticationHandler ::  authenticating request");

        //above the next handler call, whatever written is executed before
        nextHandler.handle(request);

        //below the next handler call, whatever written is executed after
    }
}
