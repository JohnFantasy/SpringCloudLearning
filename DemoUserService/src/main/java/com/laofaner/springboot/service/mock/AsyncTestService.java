package com.laofaner.springboot.service.mock;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTestService {

    @Async
    public void test(){
        System.out.println(Thread.currentThread().getName()+"=======hello world");
    }
}
