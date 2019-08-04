package c.c.k;

@RestController
@RequestMapping("/sample")
@RefreshScope
class SampleController {

    @Value("${user.name}")
    String userName;

    @RequestMapping("/acm")
    public String simple() {
        return "Hello Spring Cloud ACM!" + "Hello " + userName + "!";
    }
}