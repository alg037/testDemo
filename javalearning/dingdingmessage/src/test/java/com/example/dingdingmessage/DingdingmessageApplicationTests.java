package com.example.dingdingmessage;


import com.example.dingdingmessage.config.NoticeComponents;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DingdingmessageApplicationTests {

    @Autowired
    private NoticeComponents noticeComponents;

    @Test
    public void contextLoads() {
        noticeComponents.someMethod("这是个参数");
    }


}
