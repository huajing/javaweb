package c.c.k;

import c.c.k.biz.UserDao;
import c.c.k.biz.UserServiceImpl;
import org.junit.Before;

import static org.mockito.Mockito.mock;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/15 9:06
 * @Version 1.0
 * 1、通过方法创建
 **/

public class CreateMock1 {
    private UserDao mockUserDao;

    private UserServiceImpl userService;
    @Before
    public void setup() {

        mockUserDao = mock(UserDao.class);
        userService = new UserServiceImpl();
        userService.setUserDao(mockUserDao);
    }


}
