package ru.netology.domain;

public class Client {
	int id;
	String name;

	public Client(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", name=" + name +
				'}';
	}
}
