package cn.toroot;

import cn.toroot.dao.UserMapper;
import cn.toroot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootTestDemo {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("zoo");
        user.setPassword("123123");
        userMapper.insert(user);
    }
}
