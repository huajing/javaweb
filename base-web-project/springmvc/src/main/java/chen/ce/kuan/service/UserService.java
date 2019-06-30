package chen.ce.kuan.service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public String sayHello(String name) {
        return "sayHello " + name;
    }
}
