package com.example.demo;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener {

    @RabbitListener(queues = MqQueuesConfig.queueName)
    public void handle(Message in) {
    }

}
