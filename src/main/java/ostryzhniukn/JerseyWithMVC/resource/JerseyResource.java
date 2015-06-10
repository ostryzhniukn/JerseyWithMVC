package ostryzhniukn.JerseyWithMVC.resource;

import ostryzhniukn.JerseyWithMVC.domain.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/") //the same as Spring's @Controller annotation
public class JerseyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String jerseyIndex() {
        return "Jersey resource";
    }

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response jerseyHello(@QueryParam("userName") String userName) {
        User user = new User(userName);
        return Response.status(Response.Status.ACCEPTED).entity(user).build();
    }
}