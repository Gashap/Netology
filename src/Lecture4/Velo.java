package Lecture4;

public class Velo implements Transfer{
	@Override
	public void transfer(String name, String from, String to) {
		System.out.println(name + " прокатился из " + from + " в " + to);
	}
}
