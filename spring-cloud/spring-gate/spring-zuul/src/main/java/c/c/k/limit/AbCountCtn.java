package c.c.k.limit;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.LongAdder;

/**
 *
 */
@RestController
public class AbCountCtn {
    LongAdder longAdder = new LongAdder();
    @GetMapping("/testAbCount")
    public String testSemaphore(HttpServletResponse response){
        longAdder.increment();
        System.out.println("add 1");
        return "test idx :" + longAdder.intValue();
    }
}
