package Lecture4;

// абстрактный класс можно наследовать, но создать его объекты нельзя
public abstract class Transport implements Transfer, Billable{
	private int fuelStart;

	public Transport(int fuelStart){
		this.fuelStart = fuelStart;
	}

	public void sendFuel(int fuelOut){
		fuelStart -= fuelOut;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Уплачено " + amount + " рублей");
	}

	// абстрактный метод можно создать без реализации
//	public abstract void transfer(String name, String from, String to);
}
