package ru.netology.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AccountService {
	@PostConstruct
	public void init(){
		System.out.println("init AccountService");
	}

	public String getAccount(){
		return "Account";
	}
}
