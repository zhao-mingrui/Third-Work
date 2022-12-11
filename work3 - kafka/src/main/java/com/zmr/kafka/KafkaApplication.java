package com.zmr.kafka;

import com.zmr.kafka.maker.MsgMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication implements ApplicationRunner {

    @Autowired
    private  MsgMaker maker;

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        maker.sendMessage("zmr", "你好");
    }
}
