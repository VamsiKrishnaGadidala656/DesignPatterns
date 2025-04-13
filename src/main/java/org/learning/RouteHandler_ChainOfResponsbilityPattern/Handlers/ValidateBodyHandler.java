package org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public class ValidateBodyHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public ValidateBodyHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("ValidateBodyHandler :: validating body of request");
        nextHandler.handle(request);
    }
}
