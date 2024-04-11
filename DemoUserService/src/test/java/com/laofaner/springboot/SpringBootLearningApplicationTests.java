package com.laofaner.springboot;

import com.laofaner.springboot.service.mock.AsyncTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLearningApplicationTests {

    @Autowired
    AsyncTestService asyncTestService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            asyncTestService.test();
            Thread.sleep(100L);
        }
    }

}
