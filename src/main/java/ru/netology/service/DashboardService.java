package ru.netology.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DashboardService {
	private AvatarsService avatarsService;

	public DashboardService(AvatarsService avatarsService) {
		this.avatarsService = avatarsService;
	}
}
