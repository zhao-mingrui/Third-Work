package com.zmr.kafka.maker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
@Slf4j
public class MsgMaker {
    @Resource
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String topic, String content) {
        kafkaTemplate.send(topic, content);
        log.info("======发送消息：" + content);
    }


}
