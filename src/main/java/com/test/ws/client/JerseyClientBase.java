package com.test.ws.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.ws.Employee;

/**
 * - Crear cliente
 * 
 * - Confiigurar cliente
 * 
 * - Incluir cabeceras
 * 
 * 
 * @author josem
 *
 */
public class JerseyClientBase {

	// 1- Creating an Instance of a Client
	Client client = ClientBuilder.newClient();

	// 2- Creating a WebTarget.
	// Create a WebTarget using the URI of the targeted web resource:
	WebTarget webTarget = client.target("http://localhost:8080/TestJersey2/rest");

	// 3- Building an HTTP Request Invocation.
	// Using WebTarget, we can define a path to a specific resource:
	// WebTarget employeeWebTarget = webTarget.path("/test");
	WebTarget employeeWebTarget = webTarget.path("application.wadl");

	// 4- Invoking HTTP Requests
	// An invocation builder instance is created one of the WebTarget.request()
	// methods:
	Invocation.Builder invocationBuilder = employeeWebTarget.request(MediaType.APPLICATION_JSON);

	// 5- Sample REST Client
	// Invoking HTTP GET:
	// Response response = invocationBuilder.get(Employee.class);

	// Invoking HTTP POST:
	Employee employee;
	Response response = invocationBuilder.post(Entity.entity(employee, MediaType.APPLICATION_JSON));

	
	
	
	
	
}

// Client client;
// private int connect_timeout;
// private int read_tiemout;

// private int getConnect_tiemout() {
// return connect_timeout;
// }
//
// private int getRead_tiemout() {
// return read_tiemout;
// }
//
// public void setClient(Client client) {
// this.client = client;
// }
//
// public void setConnect_tiemout(int connect_tiemout) {
// this.connect_timeout = connect_tiemout;
// }
//
// public void setRead_tiemout(int read_tiemout) {
// this.read_tiemout = read_tiemout;
// }
//

// public JerseyClientBase() {
//
// this.client = getRestClientBase();
//
// }
//
// private static Client getRestClientBase() {
// Client client = ClientBuilder.newClient();
// client.property(ClientProperties.CONNECT_TIMEOUT, 1000);
// client.property(ClientProperties.READ_TIMEOUT, 1000);
// return client;
// }

// public Client getClientBase() {
// Client client = ClientBuilder.newClient();
// client.property(ClientProperties.CONNECT_TIMEOUT, 1000);
// client.property(ClientProperties.READ_TIMEOUT, 1000);
// // client.target("http://localhost:8080/TestJersey2/rest");
// return client;
// }

// Client client =
// ClientBuilder.newBuilder().register(JacksonFeature.class).build();

// WebTarget target = client.target("http://1.2.3.4:8080");
// WebTarget target = client.target("http://localhost:8080/TestJersey2/rest");
//
// try {
// String responseMsg =
// target.path("application.wadl").request().header("header1",
// "headerValue-1").get(String.class);
// System.out.println("responseMsg: " + responseMsg);
// } catch (ProcessingException pe) {
// pe.printStackTrace();
// }
