package resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;


@Path("/")
public class SampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String showText(){
        return "Hello dropwizard!";
    }
}
