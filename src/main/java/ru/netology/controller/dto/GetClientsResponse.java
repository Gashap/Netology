package ru.netology.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetClientsResponse {
	public final List<CustomerDTO> clientsList;
}
