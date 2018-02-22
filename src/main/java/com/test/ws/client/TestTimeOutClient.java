package com.test.ws.client;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.test.ws.view.RequestObj;
import com.test.ws.view.ResponseObj;

public class TestTimeOutClient {

	public static void main(String[] args) {

		RequestObj requestObj = new RequestObj();
		
		Client myClient = ClientFactory.create();
		
		try {
			
			
			WebTarget target4 = myClient.target("http://localhost:8080/TestJersey2/rest/").path("test/head");
			String responseObj = target4.request(MediaType.APPLICATION_JSON)
					.get(String.class);
			System.out.println(responseObj);

//			String responseMsg = myClient
//					.target("http://localhost:8080/TestJersey2/rest")
//					.path("application.wadl")
//					.request()
//					.header("header1", "headerValue-1")
//					.get(String.class);
//			System.out.println("responseMsg: " + responseMsg + "Headers: " );
			
			
		} catch (ProcessingException pe) {
			pe.printStackTrace();
		}
	}
	

}







// https://gist.github.com/theotherian/6205639

// https://stackoverflow.com/questions/32532959/jersey-2-x-how-to-add-headers-on-restful-client

// https://jersey.github.io/documentation/latest/filters-and-interceptors.html#d0e9365

// http://www.baeldung.com/httpclient-connection-management

// http://www.jasondl.ee/posts/2012/a-jersey-pojomapping-clientserver-example.html

//MultivaluedMap<String, Object> headers = requestContext.getHeaders();
		// headers.add(HttpHeaders.ACCEPT, "something");
		// headers.add("Client-ID", 1231321321);
		// headers.add(HttpHeaders.AUTHORIZATION, "OAuth more something");

		// Client client = new JerseyClientBase().client;
		// WebTarget target = new JerseyClientBase().employeeWebTarget;

		// client = ClientBuilder.newClient(new ClientConfig());
		// client.register(new OAuth2Authenticator( API_VERSION, clientId,
		// accessToken));

		// WebTarget target =
		// client.target("http://localhost:8080/TestJersey2/rest");

// WebTarget webTarget =
// myClient.target("http://localhost:8080/TestJersey2/rest");
//
// WebTarget employeeWebTarget = webTarget.path("application.wadl");

// String responseMsg = new
// JerseyClientBase().employeeWebTarget.request().header("header1",
// "headerValue-1")
// .get(String.class);

// String responseMsg =
// target.path("application.wadl").request().header("header1",
// "headerValue-1")
// .get(String.class);

// public void filter(ClientRequestContext clientRequestContext) throws
// IOException {
// String method = clientRequestContext.getMethod();
// URI uri = clientRequestContext.getUri();
// MultivaluedMap<String, Object> headers =
// clientRequestContext.getHeaders();
// System.out.printf("Sending %s to: %s\n", method, uri);
// System.out.printf("Headers:\n");
// for(String key : headers.keySet()) {
// System.out.printf(" %s: %s\n", key, headers.getFirst(key));
// }
// if(clientRequestContext.hasEntity()) {
// final OutputStream stream = new
// LoggingStream(clientRequestContext.getEntityStream());
// clientRequestContext.setEntityStream(stream);
// clientRequestContext.setProperty("client.LoggingStream", stream);
// }
// }

// private static Client getRestClientBase() {
// Client client = ClientBuilder.newClient();
// client.property(ClientProperties.CONNECT_TIMEOUT, 1000);
// client.property(ClientProperties.READ_TIMEOUT, 1000);
// return client;
// }
