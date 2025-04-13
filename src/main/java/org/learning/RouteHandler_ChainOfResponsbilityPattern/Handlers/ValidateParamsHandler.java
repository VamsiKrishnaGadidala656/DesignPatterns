package org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public class ValidateParamsHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public ValidateParamsHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("ValidateParamsHandler :: validating params of request" );

        nextHandler.handle(request);
    }
}
