package c.c.k.limit;

import com.google.common.util.concurrent.RateLimiter;
import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 限制速率
 */
@RestController
public class RateLimiterCtn {
    /**
     * 如create(10)表示，每秒钟只产生10个令牌，每秒请求大于10将废弃
     * ab -c100 -n100  http://localhost:8081/testRate 10秒钟执行完1000次，失败为9900次，只有100成功
     * 保证正在执行的任务最多有create个在执行
     *
     */
    private RateLimiter rateLimiter = RateLimiter.create(1);
    @GetMapping("/testRate")
    public String test(HttpServletResponse response){
        if(rateLimiter.tryAcquire()){
            try {
                //执行业务逻辑
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            response.setStatus(HttpStatus.SC_BAD_REQUEST);
        }

        return "test";
    }
}
