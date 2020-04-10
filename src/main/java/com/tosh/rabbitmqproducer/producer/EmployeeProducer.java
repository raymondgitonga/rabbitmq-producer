package com.tosh.rabbitmqproducer.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tosh.rabbitmqproducer.entity.Employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();
    public void sendMessage(Employee emp){
        try {
            var json = objectMapper.writeValueAsString(emp);
            rabbitTemplate.convertAndSend("employee", json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
