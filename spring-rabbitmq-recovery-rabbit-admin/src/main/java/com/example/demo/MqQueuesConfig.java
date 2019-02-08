package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqQueuesConfig implements InitializingBean {

    static final String queueName = "demo.queue";

    @Autowired
    private RabbitAdmin rabbitAdmin;

    @Override
    public void afterPropertiesSet() throws Exception {

        if (rabbitAdmin.getQueueProperties(queueName) == null)
            rabbitAdmin.declareQueue(new Queue(queueName, false, false, true));

    }

}
