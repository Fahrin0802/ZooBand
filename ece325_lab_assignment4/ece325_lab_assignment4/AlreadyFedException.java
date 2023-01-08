package ece325_lab_assignment4;

public class AlreadyFedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;
	
	public AlreadyFedException(String message) {
		this.message = message;
	}
}
