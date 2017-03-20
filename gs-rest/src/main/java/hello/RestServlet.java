package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * Created by jhall on 12/21/2016.
 */
@SpringBootApplication
public class RestServlet extends SpringBootServletInitializer {
    
    public static void main (String[] args) {
        SpringApplication.run(RestServlet.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
        return application.sources(RestServlet.class);
    }
}
