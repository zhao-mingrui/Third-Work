package com.zmr.rabbitmq.maker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
@Slf4j
public class MsgMaker {
    @Resource
    private RabbitTemplate rabbitTemplate;

    public void send(String exchangeName, String routingKey, String msg) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, msg);
        log.info("======发送消息：" + msg);
    }
}
