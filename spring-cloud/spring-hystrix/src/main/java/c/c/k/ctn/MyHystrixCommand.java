package c.c.k.ctn;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class MyHystrixCommand extends HystrixCommand<String> {
    static volatile int idx;
    public MyHystrixCommand(){
        super(HystrixCommandGroupKey.Factory.asKey("name1"));
    }
    @Override
    protected String run() throws Exception {
        idx++;
        if(idx>10)
            throw new RuntimeException();
        return "succ";
    }

    @Override
    protected String getFallback() {
        return "tail";
    }
}
