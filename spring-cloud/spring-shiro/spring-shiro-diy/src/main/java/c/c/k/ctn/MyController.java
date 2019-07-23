package c.c.k.ctn;

import c.c.k.annotation.MyPermission;
import c.c.k.annotation.MyRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title c.c.k.ctn
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/23 chenck
 */
@RestController
public class MyController {
    @GetMapping("/test1")
    @MyRole(value = "ro1e1")
    public String test1(){
        return "test1";
    }

    @GetMapping("/permission")
    @MyPermission(value = "permission")
    public String permission(){
        return "test1";
    }
}
