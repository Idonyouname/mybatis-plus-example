package com.amdox.liugui.mybatisplusexamplehello;

import com.amdox.liugui.mybatisplusexamplehello.mapper.UserMapper;
import com.amdox.liugui.mybatisplusexamplehello.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisPlusExampleHelloApplicationTests {


    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAdd(){
        System.out.println("add User");
        User user = new User();
        user.setId(10000000);
        user.setAge(23);
        user.setName("liugui");
        user.setEmail("13539206534@163.com");
        int i = userMapper.insert(user);

        System.out.println("添加操作：" + i);

        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);

    }

}
