package org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public interface RequestHandler {

    void handle(Request request);
}
