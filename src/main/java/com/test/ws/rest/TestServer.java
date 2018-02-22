package com.test.ws.rest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.ws.client.ClientFactory;
import com.test.ws.view.RequestObj;
import com.test.ws.view.ResponseObj;

/**
 * 
 * Server tests
 * 
 * http://localhost:8080/TestJersey2/rest/test
 * 
 * @author josem
 * 
 */
@Path("/test")
public class TestServer {

	// @HeaderParam("token")
	// private String token;

	/**
	 * This method return a hello World
	 * 
	 * http://localhost:8080/TestJersey2/rest/test
	 * 
	 * @return
	 */
	@GET
	public String inicio() {
		return "Hello World!";
	}

	/**
	 * This method return a hello World
	 * 
	 * http://localhost:8080/TestJersey2/rest/get
	 * 
	 * @return
	 */
	@GET
	@Path("/get")
	public String hello() {
		return "Hello World !! - Jersey 2";
	}

	/**
	 * 
	 * This method produces a JSON
	 * 
	 * @return
	 */
	@GET
	@Path("/get") // @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RequestObj getTrackInJSON() {
		RequestObj requestObj = new RequestObj();
		requestObj.setTitle("Enter Sandman");
		requestObj.setSinger("Metallica");
		return requestObj;
	}

//	@Context
//	UriInfo uriInfo;

//	@PostConstruct
//	public void myfunc() {
//		if (uriInfo == null) { // breakpoint on this line, so I can see what
//								// uriInfo is
//
//		}
//	}

	@GET
	@Path("/filter") // @HeaderParam("content-type") String contentType
	@Produces(MediaType.APPLICATION_JSON)
	public String getWadlInJSON() {

		Client myClient = ClientFactory.create();
		String responseMsg = null;
		try {
			responseMsg = myClient
					.target("http://localhost:8080/TestJersey2/rest")
					.path("application.wadl")
					.request()
					.header("Client-Name", "jose-3")
					.get(String.class);
			System.out.println("*Path:  /filter ** responseMsg:\n" + responseMsg);

		} catch (ProcessingException pe) {
			pe.printStackTrace();
		}

		// TestTimeOutClient tout = new TestTimeOutClient();
		// tout.main(null);
		// RequestObj requestObj = new RequestObj();
		// requestObj.setTitle("Enter Sandman");
		// requestObj.setSinger("Metallica");

		return responseMsg;
	}

	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// public Response getAllEmployees() {
	//
	// Client myClient = ClientFactory.create();
	//
	// String responseMsg = null;
	//
	// try {
	// responseMsg = myClient
	// .target("http://localhost:8080/TestJersey2/rest")
	// .path("application.wadl")
	// .request()
	// .header("header1", "headerValue-1")
	// .get(String.class);
	//
	// System.out.println("responseMsg: " + responseMsg + "Headers: " );
	// } catch (ProcessingException pe) {
	// pe.printStackTrace();
	// }
	//
	// Employees list = new Employees();
	// list.setEmployeeList(new ArrayList<Employee>());
	// list.getEmployeeList().add(new Employee(1, "Lokesh Gupta"));
	// list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
	// list.getEmployeeList().add(new Employee(3, "David Kameron"));
	//
	// Response response = Response.status(200).entity(list).cookie(new
	// NewCookie("name", "Hello, world!"))
	// .header("Header1", "H1_Value").header("Header2", "H2_Value").build();
	//
	// return response;
	// }

	@GET /* Tipo de llamada */
	@Path("/head")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON) // @Context HttpHeaders httpHeaders
	public Response getHeaders() {

		Client myClient = ClientFactory.create();
		String responseMsg = null;
		try {
			responseMsg = myClient
					.target("http://localhost:8080/TestJersey2/rest")
					.path("application.wadl")
					.request()
					.header("Client-Name", "jose-3")
					.get(String.class);

			System.out.println("***** /head ***** responseMsg: " + responseMsg + "Headers: ");
		} catch (ProcessingException pe) {
			pe.printStackTrace();
		}
		/* Mostrará por pantalla el parámetro que le hemos pasado a la URL */
		String output = "My Jersey application says : " + responseMsg;
		return Response.status(200).entity(output).build();
	}

	/**
	 * Test for the POST
	 * 
	 * This method uses the final url part as parameter
	 * 
	 * http://localhost:8080/TestJersey2/rest/test/post-id/33
	 * 
	 * @param id
	 * @param requestObj
	 * @return
	 */
	@POST
	@Path("/post-id/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseObj getID(@PathParam("id") int id, RequestObj requestObj) {
		ResponseObj rt = new ResponseObj();
		rt.setResult("OK");
		rt.setRetorno(Response.Status.OK.getStatusCode() + " OK ->" + id);
		return rt;
	}

	/**
	 * 
	 * Test for the PUT
	 * 
	 * @param obj
	 * 
	 * @return Response status and entity response obj
	 * 
	 *         <p>
	 *         http://localhost:8080/TestJersey2/rest/test/put
	 *         </p>
	 *
	 *         {@code Invoke <br>
	 *         <b><code>{"title": "Enter title", "singer": "Some singer"}</code>
	 * 
	 */
	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public Response objectToLine(String obj) {
		return Response.status(201).entity("response" + obj).build();
	}

	/**
	 * 
	 * Validated Test
	 * 
	 * @param requestObj
	 * @return
	 */
	@POST
	@Path("/validate")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validateField(@Valid RequestObj requestObj) {
		ResponseObj rt = new ResponseObj();
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(rt);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.status(Response.Status.ACCEPTED).entity(json).build();
	}
}