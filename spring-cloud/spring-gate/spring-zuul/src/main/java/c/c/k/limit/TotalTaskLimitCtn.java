package c.c.k.limit;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 限制正在执行的任务数
 * 不限制请求速率，可以接收瞬时多个请求
 */
@RestController
public class TotalTaskLimitCtn {
    private AtomicInteger atomicInteger = new AtomicInteger();

    @GetMapping("/testTotal")
    public String testTotal(HttpServletResponse response){
        int andIncrement = atomicInteger.getAndIncrement();
        if(andIncrement>10){
            response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }else {
            try {
                //执行业务逻辑
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        atomicInteger.decrementAndGet();
        return "test";
    }
}
