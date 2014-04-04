package dhbw.vs.jaxws;

import javax.jws.WebService;

import dhbw.vs.jaxws.generated.DemoService;

@WebService(endpointInterface = "dhbw.vs.jaxws.generated.DemoService")
public class DemoServiceServerImpl implements DemoService {

	public String demoMethod(String parameters) {
		System.out.println("Demo method invoked.");
		return "Hallo Welt " + System.currentTimeMillis();
	}

}
