package ostryzhniukn.JerseyWithMVC.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import ostryzhniukn.JerseyWithMVC.resource.JerseyResource;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest/*")
public class JerseyConfig extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public JerseyConfig() {
        register(RequestContextFilter.class);
        register(JerseyResource.class);
    }
}