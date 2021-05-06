package spring5_autowired.exception;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException {
	
	public DuplicateMemberException(String message) {
		super(message);
	}
}
