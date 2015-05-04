package ostryzhniukn.JerseyWithMVC.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class JerseyResource {

    @GET
    @Path("jersey-hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Jersey resource";
    }
}