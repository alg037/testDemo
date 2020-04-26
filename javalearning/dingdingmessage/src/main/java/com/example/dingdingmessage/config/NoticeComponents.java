package com.example.dingdingmessage.config;

import com.kuding.anno.ExceptionListener;
import org.springframework.stereotype.Component;

    @Component
    @ExceptionListener //异常通知的监控来自这个注解
    public class NoticeComponents {

        public void someMethod(String name) {
            System.out.println("这是一个参数：" + name);
            throw new NullPointerException("第一个异常");
        }

        public void anotherMethod(String name, int age) {
            System.out.println("这又是一个参数" + age);
            throw new IllegalArgumentException(name + ":" + age);
        }
    }
