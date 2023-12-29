package com.folautech.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SenderController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/topic1")
    public ResponseEntity<String> sendToTopic1(){
        log.info("sendToTopic1");

        kafkaTemplate.send("topic1","test");

        return new ResponseEntity<>("good", HttpStatus.OK);
    }
}
