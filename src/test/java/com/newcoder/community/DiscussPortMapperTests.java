package com.newcoder.community;

import com.newcoder.community.dao.DiscussPortMapper;
import com.newcoder.community.entity.DiscussPort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CommunityApplication.class)
@SpringBootTest
public class DiscussPortMapperTests {

    @Autowired
    private DiscussPortMapper discussPortMapper;

    @Test
    public void testSelect(){
        List<DiscussPort> discussPorts = discussPortMapper.selectDiscussPort(0,0,10);
        for (DiscussPort pt : discussPorts){
            System.out.println(pt);
        }

        int i = discussPortMapper.selectCount(0);
        System.out.println(i);
    }


}
