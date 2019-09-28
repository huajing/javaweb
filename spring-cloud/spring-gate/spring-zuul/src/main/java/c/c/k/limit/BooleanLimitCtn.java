package c.c.k.limit;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 限制同一时刻只有一个线程在执行
 *
 * 只能单线程执行的业务场景
 */
@RestController
public class BooleanLimitCtn {
    AtomicBoolean atomicBoolean = new AtomicBoolean(false);

    @GetMapping("/testBool")
    public String testBool(HttpServletResponse response){

        if(!atomicBoolean.compareAndSet(false, true)){
            response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }else {
            try {
                //执行业务逻辑
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicBoolean.compareAndSet(true, false);
        }
        return "test";
    }
}
