package com.zmr.kafka.receive;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MsgReceive {

    @KafkaListener(topics = {"zmr"})
    public void handleMessage(ConsumerRecord record) {
         log.info("====="+ record.value());
    }
}
