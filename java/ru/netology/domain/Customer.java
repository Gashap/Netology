package ru.netology.domain;

public class Customer {
	Operation[] operations = new Operation[5]; // данные по операциям
	Customer[] customers = new Customer[5]; // данные по клиентам
	int[][] statement = new int[5][5];
}
