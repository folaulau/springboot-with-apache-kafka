package com.folautech.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationConsumer {

    @KafkaListener(topics = "topic1", groupId = "folautech1")
    public void listen(String message){
        log.info("listen, message={}", message);
    }
}
