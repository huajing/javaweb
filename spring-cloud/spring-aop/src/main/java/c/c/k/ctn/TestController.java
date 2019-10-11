package c.c.k.ctn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request, HttpServletResponse response){
        System.out.println("deal request");
        if(new Random(System.currentTimeMillis()).nextBoolean()){
            response.setStatus(500);
        }
        IntStream.range(1, 1<<30).sum();
        return "abc";
    }
}
