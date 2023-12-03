package Lecture4;

public class NameInputMisamtchException extends RuntimeException {
	public NameInputMisamtchException(String msg){
		super("Не хватает информации " + msg);
	}
}
