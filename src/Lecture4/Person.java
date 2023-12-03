package Lecture4;

public class Person
{
	public String name;
	private int age;

	public Person(String name, int age){
		this.name = name;
		setAge(age);
//		this.age = age;
	}

	public void myName(){
		System.out.println("My name is " + name + ". I'm " + age + " y.o.");
//		return null;
	}

	public void setAge(int age){ // set - установить значение
		if (age < 0 || age > 150) return;
		this.age = age;
	}

	public int getAge() { // get - передать установленное значение
		return age;
	}

	public void happyBirthday(){
		age++;
		System.out.println("С днём рождения!");
	}

	public boolean IsTooYoung(){
		return age < 18;
	}
}
