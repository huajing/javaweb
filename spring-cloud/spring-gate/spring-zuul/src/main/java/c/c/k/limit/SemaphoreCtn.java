package c.c.k.limit;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 */
@RestController
public class SemaphoreCtn {
    Semaphore semaphore = new Semaphore(5);

    @GetMapping("/testSemaphore")
    public String testSemaphore(HttpServletResponse response){
        if(semaphore.tryAcquire()){
            System.out.println(Thread.currentThread().getId() + "" );
            try {
                //执行业务逻辑
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }else {
            response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        return "test";
    }
}
