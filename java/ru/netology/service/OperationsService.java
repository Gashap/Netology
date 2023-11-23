package ru.netology.service;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class OperationsService {
	public ClientService clientService;
	public AccountService accountService;

	public OperationsService(ClientService clientService, AccountService accountService) {
		this.clientService = clientService;
		this.accountService = accountService;
	}

	public void print(){
		System.out.println("Client " + clientService.getClient());
		System.out.println("Account " + accountService.getAccount());
	}
}
