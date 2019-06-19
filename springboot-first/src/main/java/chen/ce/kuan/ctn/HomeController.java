package chen.ce.kuan.ctn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value(value = "${test.profile.where}")
    private String appname;

    @RequestMapping(path = "/home")
    public void home(){
        System.out.println("abc" + appname);
        System.out.println("====home==");
    }
}
