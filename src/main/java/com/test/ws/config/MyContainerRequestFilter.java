package com.test.ws.config;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider // @PreMatching
public class MyContainerRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		System.out.println("MyContainerRequestFilter - [IN]");

		String methodOverride = requestContext.getHeaderString("X-Http-Method-Override");
		if (methodOverride != null){
			requestContext.setMethod(methodOverride);
		}
		requestContext.getHeaders().add("header", "value");
		requestContext.getHeaders().add("REQUEST--3", "value1-ooooo");
		requestContext.getHeaders().add("REQUEST--4", "value2-zzzzz");

		System.out.println("MyContainerRequestFilter - [OUT-1]" + requestContext.getHeaderString("REQUEST--3"));
		System.out.println("MyContainerRequestFilter - [OUT-2]" + requestContext.getHeaderString("X-Http-Method-Override"));
		
	}
}

/**
 * https://stackoverflow.com/questions/34851218/how-do-i-get-inject-the-current-sslsession-in-jersey-server
 * 
 * @Priority(Priorities.AUTHENTICATION) public class AuthenticationFilter
 *                                      implements ContainerRequestFilter {
 * 
 * @Override public void filter(ContainerRequestContext requestContext) throws
 *           IOException { X509Certificate[] certificates = (X509Certificate[])
 *           requestContext.getProperty("javax.servlet.request.X509Certificate");
 *           Principal principal = certificates[0].getSubjectX500Principal(); }
 * 
 *           }
 * 
 * 
 * 
 */