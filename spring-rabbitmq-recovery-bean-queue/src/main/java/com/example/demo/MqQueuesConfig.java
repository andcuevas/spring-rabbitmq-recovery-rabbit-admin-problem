package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqQueuesConfig {

    static final String queueName = "demo.queue";

    @Bean
    public Queue demoQueue() {
        return new Queue(queueName, false, false, true);
    }

}
