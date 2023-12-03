package Lecture4;

public class Car extends Transport{
	public Car() {
		super(100);
	}

	@Override
	public void transfer(String name, String from, String to) {
		System.out.println(name + " ехал из " + from + " в " + to);
		sendFuel(12);
	}
}
