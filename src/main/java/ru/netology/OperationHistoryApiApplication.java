package ru.netology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OperationHistoryApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(OperationHistoryApiApplication.class, args);
//
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//
//		OperationsService operationsService = context.getBean(OperationsService.class);
//		operationsService.print();
	}
}