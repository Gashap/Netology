package Lecture4;

public class MainClass {
//	public static void main(String[] args) {
//		Person person = new Person("Vasia", 9);
////		person.age = 19;
//
//		person.setAge(-8);
//		person.setAge(-25);
//		person.myName();
//		person.happyBirthday();
//		System.out.println();
//
//		Singer singer = new Singer("Anton", 24, 2);
//		singer.myName();
//		singer.sing("Adios");
//		singer.happyBirthday();
//	}

//	public static void main(String[] args) throws Exception{
//		Instrument[] instruments = {
//				new Guitar(),
//				new Piano(),
//				new Flute(),
//				new Guitar()
//		};
//
//		boolean[][] shouldPlay = {
//				{false, true, true, true, true, false},
//				{true, false, true, false, true, false},
//				{false, false, true, true, false, false},
//				{false, true, true, true, true, false},
//		};
//
//		Song = new Song(instruments, shouldPlay);
//		song.play();
//	}

//	public static void main(String[] args) {
//		Car car = new Car();
//		car.transfer("Андрей", "МГН", "ЕКБ");
//		fromTO("Андрей", car);
//
//		Ship ship = new Ship();
//		ship.transfer("Ирина", "Краснодар", "Севастополь");
//		fromTO("Ирина", ship);
//		ship.pay(2000);
//
//		Velo velo = new Velo();
//		fromTO("Игорь", velo);
//	}
//
//	public static void fromTO(String name, Transfer transport){
//		transport.transfer(name, "Пункт отправления", "Пункт назначения");
//	}

	public static void main(String[] args) {
		String s = "Ирина, ёп твою мать!";
		try {
			char c = get10th(s);
			System.out.println("Полученный символ: " + c);
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("Что за пылесос?");
		}

		String text = "Elon";
		System.out.println(sameLength(text));
	}

	public static char get10th(String s){
		System.out.println("Начинаем взлом жопы");
		char c = s.charAt(10);
		System.out.println("Вынули десятый символ: " + c);
		return c;
	}

	public static boolean sameLength(String text) {
		String[] parts = text.split(" ");

		if (parts.length != 2)
			throw new NameInputMisamtchException(text);

		String name = parts[1];
		String lastName = parts[0];

		return name.length() == lastName.length();
	}
}
