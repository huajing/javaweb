package chen.ce.kuan.service.dubbo;

import chen.ce.kuan.api.*;
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
