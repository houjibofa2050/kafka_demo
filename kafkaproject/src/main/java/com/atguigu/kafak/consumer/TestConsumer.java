package com.atguigu.kafak.consumer;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: fuguowen
 * @date: 2020-01-06 17:12
 * @email: fuguowen@fantaike.ai
 */

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka消费者测试
 */
@Component
public class TestConsumer {

    @KafkaListener(topics = "test_topic")
    public void listen(ConsumerRecord<?, ?> record) throws Exception {
        //控制台打印send进来的信息
        System.out.printf(" 消费者消费消息  topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }
}

