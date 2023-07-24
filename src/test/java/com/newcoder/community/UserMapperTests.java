package com.newcoder.community;


import com.newcoder.community.dao.UserMapper;
import com.newcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testselect() {
        User user = userMapper.selectById(11);
        System.out.println(user);

        User system = userMapper.selectByUsername("wowowo");
        System.out.println(system);

        User email = userMapper.selectByEmail("nowcoder1@sina.com");
        System.out.println(email);
    }

    @Test
    public void testinsert() {
        User user = new User();
        user.setUsername("wowowo");
        int i = userMapper.insertUser(user);
        System.out.println(i);
    }

    @Test
    public void testupdate() {
        userMapper.updatePassword(150,"1111111");
        userMapper.updateHeader(150,"https://www.baidu.com");
        userMapper.updateStatus(150,1);
    }
}
