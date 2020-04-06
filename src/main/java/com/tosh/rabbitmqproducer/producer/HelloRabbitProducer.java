package com.tosh.rabbitmqproducer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class HelloRabbitProducer {

    private RabbitTemplate rabbitTemplate;

    public void sendHello(String name){
        rabbitTemplate.convertAndSend("hello", "Hello: "+ name);
    }

    
}
