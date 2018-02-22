package com.test.ws.config;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

/**
 * 
 * https://jersey.github.io/documentation/latest/filters-and-interceptors.html
 * 
 */

@Provider
public class MyClientRequestFilter implements ClientRequestFilter {

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {

		System.out.println("MyClientRequestFilter - [IN]");

		String method = requestContext.getMethod();

		URI uri = requestContext.getUri();
		MultivaluedMap<String, Object> headers = requestContext.getHeaders();
		System.out.printf("Sending %s to: %s\n", method, uri);
		System.out.printf("Headers:\n");
		for (String key : headers.keySet()) {
			System.out.printf(" %s: %s\n", key, headers.getFirst(key));

//			String methodOverride = requestContext.getHeaderString("User-Agent");
//			if (methodOverride != null)
//				requestContext.setMethod(methodOverride);

			requestContext.getHeaders().putSingle("header1", "value1");
			requestContext.getHeaders().putSingle("header2", "value2");
			requestContext.getHeaders().putSingle("header3", "value3");
			requestContext.getHeaders().putSingle("header4", "value4");

			requestContext.getHeaders().add("REQUEST--5", "value5-ppppp");
			requestContext.getHeaders().add("REQUEST--6", "value6-zzzzz");

			System.out.println("MyClientRequestFilter - [OUT]" + requestContext.getHeaderString("REQUEST--5"));
			System.out.println("MyClientRequestFilter - [OUT]" + requestContext.getHeaderString("header2"));

		}

	}
}
