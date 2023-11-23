package ru.netology.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import ru.netology.service.*;

@Service
@ComponentScan("ru.netology")
public class AppConfiguration {
//	@Bean
//	public AccountService accountService(){
//		return new AccountService();
//	}
//
//	@Bean
//	public AvatarsService avatarsService(){
//		return new AvatarsService();
//	}
//
//	@Bean
//	public ClientService clientService(AvatarsService avatarsService){
//		return new ClientService(avatarsService);
//	}
//
//	@Bean
//	public DashboardService dashboardService(AvatarsService avatarsService){
//		return new DashboardService(avatarsService);
//	}
//
//	@Bean
//	public OperationsService operationsService(ClientService clientService, AccountService accountService){
//		return new OperationsService(clientService, accountService);
//	}
}
