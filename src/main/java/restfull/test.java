package restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/tests")
public class test {
	ResponseBuilder rb = null;

//	@GET
//	@Path("{code}")
//	@Produces("application/json")
//	public Response getLeden(@PathParam("code") int code) {
//		BusinessRuleController BRC = new BusinessRuleController();
//		rb = BRC.addBusinessRulev2(code, rb);
//		return rb.build();
//	}
	
	@GET
	@Path("{code}")
	@Produces("application/json")
	public String addBusinessRule(@PathParam("code") int code) {
//	BusinessRuleController brc = new BusinessRuleController();
//	rb = brc.addBusinessRuleV3(code, rb);		
    System.out.println(rb.build().getStatus());
    String s = "t werkte joepie";
    return s;
	}

	
}