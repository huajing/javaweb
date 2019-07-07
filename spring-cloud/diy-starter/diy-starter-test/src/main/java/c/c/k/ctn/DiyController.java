package c.c.k.ctn;

import c.c.k.DiyService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DiyController {

    @Resource
    private DiyService diyService;

    @RequestMapping("/diy")
    public String diyName(){
        return diyService.getName();
    }
}
