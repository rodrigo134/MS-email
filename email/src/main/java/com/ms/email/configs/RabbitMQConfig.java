package com.ms.email.configs;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {


    @Value("${broker.queue.email}")
    private String queueName; //nome fila,pego do properties

    @Bean
    public Queue emailQueue() {
        return new Queue(queueName, true);
    }



}
