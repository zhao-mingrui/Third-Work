package com.zmr.rabbitmq.receive;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"queue"})
@Slf4j
public class MsgReceive {
    @RabbitHandler
    public void getMsg(byte[] msg) {
        log.info("======接收消息："+ new String(msg));
    }
}
