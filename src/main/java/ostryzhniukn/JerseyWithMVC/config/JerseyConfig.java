package ostryzhniukn.JerseyWithMVC.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import ostryzhniukn.JerseyWithMVC.resource.JerseyResource;
import javax.ws.rs.ApplicationPath;

//This annotation goes instead of web.xml
@ApplicationPath("/rest/*") //All "jersey" mappings will be starting with "/rest/"
public class JerseyConfig extends ResourceConfig {
    /**
     * Register JAX-RS application components.
     */
    public JerseyConfig() {
        //Spring filter to provide a bridge between
        // JAX-RS and Spring request attributes.
        register(RequestContextFilter.class);

        register(JerseyResource.class); //our jersey controller
    }
}