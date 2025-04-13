package org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public class AuthorizationHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public AuthorizationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("AuthorizationHandler ::  authorizing request");

        nextHandler.handle(request);
    }
}
