package ru.netology.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ClientService {
	private AvatarsService avatarsService;

	public ClientService(AvatarsService avatarsService) {
		this.avatarsService = avatarsService;
	}

	public String getClient(){
		return "Client name " + avatarsService.getAvatar();
	}
}
