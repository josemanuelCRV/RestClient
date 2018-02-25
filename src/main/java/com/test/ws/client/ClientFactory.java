package com.test.ws.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.jackson.JacksonFeature;

import com.test.ws.config.CheckRequestFilter;
import com.test.ws.config.MyClientRequestFilter;
import com.test.ws.config.MyContainerRequestFilter;
import com.test.ws.config.PoweredByResponseFilter;

public final class ClientFactory {

	public static Client create() {
	
		
		ClientConfig clientConfig = new ClientConfig();
	
		// values are in milliseconds
		clientConfig.property(ClientProperties.READ_TIMEOUT, 2000);
		clientConfig.property(ClientProperties.CONNECT_TIMEOUT, 500);
		clientConfig.property(ClientProperties.ASYNC_THREADPOOL_SIZE, 20);
		clientConfig.register(PoweredByResponseFilter.class);
		clientConfig.register(new MyContainerRequestFilter());
		clientConfig.register(new MyClientRequestFilter());
		clientConfig.register(new CheckRequestFilter());
		
//		PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager();
//		connectionManager.setMaxTotal(100);
//		connectionManager.setDefaultMaxPerRoute(20);
//		connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("localhost")), 40);
	
//		clientConfig.property(ApacheClientProperties.CONNECTION_MANAGER, connectionManager);
	
//		ApacheConnector connector = new ApacheConnector(clientConfig);
//		clientConfig.connector(connector);
	
		Client client = ClientBuilder.newClient(clientConfig);
		client.register(JacksonFeature.class);
		
		return client;
	}
	
	
	
	
	
	
}



//Resource recurso = new Resource.ResourceBuilder()
//.server(SERVER)
//.localpath(FILENAME)
//.remotepath(REMOTEPATH)
//.build();
//
//putFileToFTP(recurso);


