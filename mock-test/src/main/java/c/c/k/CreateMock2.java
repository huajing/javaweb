package c.c.k;

import c.c.k.biz.UserDao;
import c.c.k.biz.UserServiceImpl;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/15 9:14
 * @Version 1.0
 * 2\通过注解创建
 **/

public class CreateMock2 {
    @Mock
    UserDao userDao;

    @InjectMocks
    UserServiceImpl userService;

    @Before
    public void setUp(){
        ////初始化对象的注解
        MockitoAnnotations.initMocks(this);
    }


}
