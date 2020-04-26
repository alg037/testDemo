package com.example.dingdingmessage;

import cn.chendahai.dingding.service.DingdingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.example.dingdingmessage.config"})
public class DingdingmessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DingdingmessageApplication.class, args);
    }

    /**
     * webhook https://oapi.dingtalk.com/robot/send?access_token=04251ad2fefbfb8425810f09e28f60b85c2d1dae0099dbaf17f1f1ee117ae8b5
     *
     * @return
     */

}
