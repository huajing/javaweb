package c.c.k.ctn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.stream.IntStream;

@Controller
public class RestfulController {
    @RequestMapping(value = "/jsp")
    public String jsp(HttpServletRequest request, HttpServletResponse response){
        return "login";
    }
}
