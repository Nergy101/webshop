package restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tests")
public class test {
	
	@GET
	@Produces("text/html")
	public String testing() {
    String s = "t werkte joepie";
    return s;
	}

	
}