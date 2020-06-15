package com.consumer;


import application.ConsumerApplication;
import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.config.annotation.Reference;
import com.service.inf.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class ConsumerTest {

    @Reference
    UserService userService;

    @Test
    public void test() {

        try {
            System.out.println(JSON.json(userService.listUser()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
