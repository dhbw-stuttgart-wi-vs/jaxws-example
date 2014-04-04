package dhbw.vs.jaxws;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) throws Exception {

		// Run the server
		String address = "http://127.0.0.1:8888/testservice/";
		Endpoint.publish(address, new DemoServiceServerImpl());
		
	}
}
