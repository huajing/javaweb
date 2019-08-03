package c.c.k;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

public class MyRandomRule extends RandomRule {
    public MyRandomRule(){
        System.out.println("x--------");
    }
    @Override
    public Server choose(Object key) {
        System.out.println("===============");
        return super.choose(key);
    }

    @Override
    public Server choose(ILoadBalancer lb, Object key) {
        System.out.println("==========================");
        return super.choose(lb, key);
    }
}
