package ostryzhniukn.JerseyWithMVC.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServletInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebMvcConfig.class); // registering WebMvcConfigurerAdapter
		return context;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" }; //Mapping for dispatcher servlet
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
	}

}
