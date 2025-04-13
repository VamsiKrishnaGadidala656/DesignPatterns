package org.learning.RouteHandler_ChainOfResponsbilityPattern.Factory;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers.AuthenticationHandler;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers.AuthorizationHandler;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers.FinishingHandler;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers.RequestHandler;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers.ValidateBodyHandler;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Handlers.ValidateParamsHandler;
import org.learning.RouteHandler_ChainOfResponsbilityPattern.Services.TokenServiceImpl;

public class RequestHandlerFactor {

    public static RequestHandler getRequestHandlerForCreateTodo() {

        return new ValidateParamsHandler(
                new ValidateBodyHandler(
                        new AuthenticationHandler(
                                new AuthorizationHandler(new FinishingHandler()),new TokenServiceImpl()
                        )
                )
        );
    }

    public static RequestHandler getRequestHandlerForUpdateTodo() {

        return new ValidateParamsHandler(
                new ValidateBodyHandler(
                        new AuthenticationHandler(
                                new AuthorizationHandler(new FinishingHandler()),new TokenServiceImpl()
                        )
                )
        );
    }
}
