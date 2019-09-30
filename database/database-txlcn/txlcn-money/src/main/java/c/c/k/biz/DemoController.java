package c.c.k.biz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;


@RestController
public class DemoController {
    @Resource
    private MoneyMapper moneyMapper;


    @RequestMapping("/txlcn")
    public String execute(
            @RequestParam("value") String value,
            @RequestParam(value = "ex", required = false) String exFlag) {
        return "";
//        return demoService.execute(value, exFlag);
    }

    @GetMapping("/money")
    public String money(){
        Money money = new Money(123123);
        money.setId(Math.abs(new Random(System.currentTimeMillis()).nextInt()));
        System.out.println(money.getId());
        moneyMapper.insert(money);
        return "ok";
    }
}
