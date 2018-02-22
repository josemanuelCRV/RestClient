package com.test.ws.client;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedMap;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BkClient {

	private Client client;
	private ObjectMapper mapper = new ObjectMapper();
	private WebTarget webTarget;

	public BkClient(){
	
	//	ClientProperties properties = new ClientConfig(client.property(ClientProperties.CONNECT_TIMEOUT, 100));
		
		
		
	}

}

// Client client = ClientBuilder.newClient();

// public BkClient(){
//
// this.client = client.property(ClientProperties.CONNECT_TIMEOUT, 1000);
// }

// public Client getBkClient(){
//
// return null;
// }

// public void filter(ClientRequestContext clientRequestContext) throws
// IOException {
// String method = clientRequestContext.getMethod();
// URI uri = clientRequestContext.getUri();
// MultivaluedMap<String, Object> headers = clientRequestContext.getHeaders();
// System.out.printf("Sending %s to: %s\n", method, uri);
// System.out.printf("Headers:\n");
// for(String key : headers.keySet()) {
// System.out.printf(" %s: %s\n", key, headers.getFirst(key));
// }
// if(clientRequestContext.hasEntity()) {
// final BkClient stream = new BkClient();
// clientRequestContext.setEntity(stream);
// clientRequestContext.setProperty("client.LoggingStream", stream);
// }
// }
