package wrongPinException;

public class WrongPinException  extends Exception{

	private static final String MESSAGE = "WRONG PIN";

	public WrongPinException() {
		super(MESSAGE);
		// TODO Auto-generated constructor stub
	}

	public WrongPinException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}
