package com.atguigu.kafak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: fuguowen
 * @date: 2020-01-06 16:51
 * @email: fuguowen@fantaike.ai
 */
/**
 * 测试kafka生产者
 */
@RestController
@RequestMapping("kafka")
public class TestKafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("send")
    public String send(String msg) {
        kafkaTemplate.send("test_topic", msg);
        return "success add ";
    }

}
