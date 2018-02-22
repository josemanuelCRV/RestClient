package com.test.ws.config;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class PoweredByResponseFilter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("PoweredByResponseFilter - [IN]");
		
		requestContext.getHeaders().add("REQUEST--1", "value1-PoweredByResponseFilter");
		requestContext.getHeaders().add("REQUEST--2", "value2-PoweredByResponseFilter");
		
		System.out.println("PoweredByResponseFilter - [OUT]" + requestContext.getHeaderString("REQUEST--1"));

	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {

		responseContext.getHeaders().add("ZZZZ-RESPONSE-1", "Response1");
		responseContext.getHeaders().add("ZZZZ-RESPONSE-2", "Response2");

		// System.out.println("--request headers-----");
		// MultivaluedMap<String, String> headers = requestContext.getHeaders();
		// headers.entrySet().forEach(System.out::println);

	}

}
