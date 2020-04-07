package com.tosh.rabbitmqproducer;

import com.tosh.rabbitmqproducer.producer.HelloRabbitProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling
public class RabbitmqProducerApplication  implements CommandLineRunner {

//	@Autowired
////	private HelloRabbitProducer helloRabbitProducer;



	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		helloRabbitProducer.sendHello("Tosh " + Math.random());
	}
}
