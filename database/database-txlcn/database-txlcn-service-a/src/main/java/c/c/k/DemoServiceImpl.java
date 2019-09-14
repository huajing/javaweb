package c.c.k;

import com.codingapi.txlcn.common.util.Transactions;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.core.DTXLocalContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DemoServiceImpl implements DemoService {
    private final DemoMapper demoMapper;

    private final ServiceBClient serviceBClient;

    private final ServiceCClient serviceCClient;

    @Autowired
    public DemoServiceImpl(
            ClientDemoMapper demoMapper,
            ServiceBClient serviceBClient,
            ServiceCClient serviceCClient) {
        this.demoMapper = demoMapper;
        this.serviceBClient = serviceBClient;
        this.serviceCClient = serviceCClient;
    }

    @Override
    @LcnTransaction
    public String execute(String value) {

        // ServiceB
        String dResp = serviceBClient.rpc(value);

        // ServiceC
        String eResp = serviceCClient.rpc(value);

        // Local transaction
        Demo demo = new Demo();
        demo.setGroupId(DTXLocalContext.getOrNew().getGroupId());
        demo.setDemoField(value);
        demo.setAppName(Transactions.APPLICATION_ID_WHEN_RUNNING);
        demo.setCreateTime(new Date());
        demoMapper.save(demo);

        // 置异常标志，DTX 回滚
        if (Objects.nonNull(exFlag)) {
            throw new IllegalStateException("by exFlag");
        }
        return dResp + " > " + eResp + " > " + "ok-service-a";
    }
}
