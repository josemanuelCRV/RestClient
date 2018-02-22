package com.test.ws.config;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Priority(1000)
@Provider
public class CheckRequestFilter implements ClientRequestFilter {
	 
    @Override
    public void filter(ClientRequestContext requestContext)
                        throws IOException {
        if (requestContext.getHeaders(
                        ).get("Client-Name") == null) {
            requestContext.abortWith(
                        Response.status(Response.Status.BAD_REQUEST)
                .entity("Client-Name header must be defined.")
                        .build());
            System.out.println("CheckRequestFilter -- BLOCKED -- [OUT]");
         }else{
        	 System.out.println("CheckRequestFilter -- OK -- [OUT]");
         }
        
        
       
    }
}
