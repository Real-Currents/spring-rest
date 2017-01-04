package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jhall on 12/21/2016.
 */
@RestController
public class Controller {
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/")
    public Resource respond (@RequestParam(value="name", defaultValue="World") String name) {
        return new Resource((int) counter.incrementAndGet(), "Hello, "+ name);
    }
}
