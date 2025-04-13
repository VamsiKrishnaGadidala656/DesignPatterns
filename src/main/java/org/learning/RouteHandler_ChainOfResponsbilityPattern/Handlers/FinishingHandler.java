package org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public class FinishingHandler implements RequestHandler{

    @Override
    public void handle(Request request) {
        System.out.println("FinishingHandler :: finish request");
    }
}
