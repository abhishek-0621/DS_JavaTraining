package ExceptionHandlingJDBC;

public class StudentAlreadyExists extends RuntimeException{
	public StudentAlreadyExists (String message) {
		super(message);
		}
}
