package com.tosh.rabbitmqproducer;

import com.tosh.rabbitmqproducer.entity.Employee;
import com.tosh.rabbitmqproducer.producer.EmployeeProducer;
import com.tosh.rabbitmqproducer.producer.HelloRabbitProducer;
import com.tosh.rabbitmqproducer.producer.HumanResourceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@SpringBootApplication
//@EnableScheduling
public class RabbitmqProducerApplication  implements CommandLineRunner {

//	@Autowired
////	private HelloRabbitProducer helloRabbitProducer;

	@Autowired
	private HumanResourceProducer employeeProducer;



	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		helloRabbitProducer.sendHello("Tosh " + Math.random());
		for (int i = 0; i< 5; i++){
			var e = new Employee("emp "+ i, "Employee " + i, LocalDate.now());

			employeeProducer.sendMessage(e);
		}

	}
}
