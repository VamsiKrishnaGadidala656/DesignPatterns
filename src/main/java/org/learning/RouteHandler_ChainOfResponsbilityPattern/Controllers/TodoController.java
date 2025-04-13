package org.learning.RouteHandler_ChainOfResponsbilityPattern.Controllers;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Factory.RequestHandlerFactor;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.schema.Todo;

import java.util.List;

public class TodoController {

    Req

    private Todo createTodo(Request request) {

        RequestHandlerFactor.getRequestHandlerForCreateTodo().handle(request);


        return new Todo();
    }
}
