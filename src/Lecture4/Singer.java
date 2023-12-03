package Lecture4;

public class Singer extends Person{ // Person - родитель; Singer - потомок (дочерний класс)
	public int rating;

	public Singer(String name, int age, int rating){
		super(name, age);
		this.rating = rating;
	}

	public void sing(String verse){
		System.out.println("Я пою " + verse);
	}

	@Override
	public void happyBirthday(){
		super.happyBirthday(); // supper - выполнить метод из родительского класса
		System.out.println("Эта песня для тебя!");
	}
}
