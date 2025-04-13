package org.learning.RouteHandler_ChainOfResponsbilityPattern.Services;

import org.learning.RouteHandler_ChainOfResponsbilityPattern.DTO.Request;

public class TokenServiceImpl implements TokenService{


    @Override
    public boolean validateToken(Request request) {
        System.out.println("TokenServiceImpl :: validateToken");

        //fetches token from header
        //validates token using key
        //it token is invalid then return not authenticated
        return false;
    }
}
