package c.c.k.dubbo;

import chen.ce.kuan.api.IGoodsService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class GoodsService implements IGoodsService {
    @Override
    public String getName(int goodsId) {
        return "iphone";
    }
}
