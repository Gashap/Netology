package ru.netology;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.configuration.AppConfiguration;
import ru.netology.service.OperationsService;

public class ClientOperationMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		OperationsService operationsService = context.getBean(OperationsService.class);
		operationsService.print();
	}
}