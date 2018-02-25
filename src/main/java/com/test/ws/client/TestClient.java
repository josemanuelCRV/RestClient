package com.test.ws.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import com.jmclabs.rest.client.ClientFactory;
import com.jmclabs.rest.client.Jersey2Client;
import com.jmclabs.rest.client.Jersey2ClientImpl;
import com.jmclabs.rest.client.Jersey2ClientImpl.Jersey2ClientBuilder;
import com.jmclabs.rest.client.MyClient;
import com.jmclabs.rest.client.RestClient;
import com.jmclabs.rest.suit.MyTest;
import com.test.ws.view.RequestObj;
import com.test.ws.view.ResponseObj;

/**
 * 
 * 
 * @author josem
 * 
 * @see <a href=
 *      "http://www.jcgonzalez.com/java-rest-jersey2-cliente-servidor-ejemplo">Fuente</a>
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		RequestObj requestObj = new RequestObj();
		requestObj.setSinger("Rammstein");
		requestObj.setTitle("Stripped");

		// Create a JerseyClient
		// Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
		
		 //Client client = new RestClient().create();
		
		
//		Jersey2ClientImpl clientImp = new Jersey2ClientImpl(500, 2000, 0, null);
//		Client client = clientImp.getClient();
		
		
		 // Client client = ClientFactory.create();	
		
		//ClientConfig clientConfig = new ClientConfig();
		//Client client = new Jersey2ClientImpl(500, 2000, 500, clientConfig).getClient();
		 
//		Jersey2ClientBuilder clientBuilder = new Jersey2ClientBuilder();
//		Client client =  clientBuilder.withClientName("MyClientX")
//				.withConnectionIdleTimeout(500)
//				.withConnectionTimeout(500)
//				.withMaxConnectionsPerHost(2)
//				.withMaxTotalConnections(100)
//				.withReadTimeout(2000)
//				.withUserAgent("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)")
//				.build()
//				.getClient();
		
		ClientConfig clientConfig = new ClientConfig();
		
		Client client = new MyClient(2000, 500, 0, clientConfig).getClient();
		
		
		WebTarget target1 = client.target("http://www.google.es");
		String res1 = target1.request().header("Client-Name", "jose-1").get().readEntity(String.class);
		System.out.println(res1);
		
		// WS text get
		WebTarget target = client.target("http://localhost:8080/TestJersey2/rest/").path("test/get");
		String res = target.request().header("Client-Name", "jose-1").get().readEntity(String.class);
		System.out.println(res);
	 
		
		// WS text get
		WebTarget target5 = client.target("http://localhost:8080/TestJersey2/rest/").path("test/filter");
		String res5 = target5.request().header("Client-Name", "jose-5").get().readEntity(String.class);
		System.out.println(res5);

		// WS JSON get
		WebTarget target2 = client.target("http://localhost:8080/TestJersey2/rest/").path("test/get");
		String res2 = target2.request(MediaType.APPLICATION_JSON).header("Client-Name", "jose-2").get()
				.readEntity(String.class);
		System.out.println(res2);

		// WS sending and receiving a String by post. (req is a valid json)
		String req = "{\"title\":\"Stripped\", \"singer\":\"Rammstein\"}";
		WebTarget target3 = client.target("http://localhost:8080/TestJersey2/rest/").path("test/validate");
		String res3 = target3.request().header("Client-Name", "jose-3")
				.post(Entity.entity(req, MediaType.APPLICATION_JSON), String.class);
		System.out.println(res3);

		// WS text getsending and receiving objects
		WebTarget target4 = client.target("http://localhost:8080/TestJersey2/rest/").path("test/validate");
		ResponseObj responseObj = target4.request(MediaType.APPLICATION_JSON).header("Client-Name", "jose-4")
				.post(Entity.entity(requestObj, MediaType.APPLICATION_JSON)).readEntity(ResponseObj.class);
		System.out.println(responseObj.getResult() + "--" + responseObj.getRetorno() + "--" + responseObj.getError());

		client.close();
		
	}
}

// Http-Client vs Jersey
// https://stackoverflow.com/questions/18570206/how-do-jersey-client-and-apache-http-client-compare

// JAX-RS, Multi values for a request header examples
// http://www.logicbig.com/how-to/jax-rs/jax-rs-multi-header-example/