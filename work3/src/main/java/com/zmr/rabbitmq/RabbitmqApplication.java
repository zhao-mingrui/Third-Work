package com.zmr.rabbitmq;

import com.zmr.rabbitmq.maker.MsgMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqApplication implements ApplicationRunner {

    @Autowired
    private  MsgMaker maker;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        maker.send("send_rabbitmq", "", "hello zmr");
    }
}
