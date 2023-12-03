package Lecture4;

public class Ship extends Transport implements Billable{

	public Ship() {
		super(200 );
	}

	@Override
	public void transfer(String name, String from, String to) {
		System.out.println(name + " поплыл из " + from + " в " + to);
		sendFuel(36);
	}

	@Override
	public void pay(int amount) {
		super.pay(amount);
	}
}
