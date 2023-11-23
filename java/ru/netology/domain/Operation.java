package ru.netology.domain;

public class Operation {
	int id;
	int sum;
	String currency;
	String merchant;

	public Operation(int id, int sum, String currency, String merchant) {
		this.id = id;
		this.sum = sum;
		this.currency = currency;
		this.merchant = merchant;
	}

	@Override
	public String toString() {
		return "Operation{" +
				"id=" + id +
				", sum=" + sum +
				", currency='" + currency + '\'' +
				", merchant='" + merchant + '\'' +
				'}';
	}
}
