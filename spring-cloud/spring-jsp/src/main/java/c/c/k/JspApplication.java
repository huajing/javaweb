package c.c.k;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JspApplication {
    public static void main(String[] args) {
        SpringApplication.run(JspApplication.class, args);
    }

    @GetMapping("/login")
    public String login(){
        System.out.println("login page.......");
        return "login";
    }
}
