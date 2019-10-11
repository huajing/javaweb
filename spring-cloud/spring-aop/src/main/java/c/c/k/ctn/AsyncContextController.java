package c.c.k.ctn;

import org.apache.catalina.connector.Connector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.AsyncContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试异步
 */
@RestController
public class AsyncContextController {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    @RequestMapping(value = "/async_test")
    public void test(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().println("from sync writer start" + System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
        }

        AsyncContext asyncContext = request.startAsync();
        new Thread(()->{
            try {
                Thread.sleep(5000);
                asyncContext.getResponse().getWriter().println("from async writer start"+System.currentTimeMillis());
                asyncContext.complete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        try {
            response.getWriter().println("from sync writer end"+System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
