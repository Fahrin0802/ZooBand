package ece325_lab_assignment4;

public class NotPlayingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;
	
	public NotPlayingException(String message) {
		this.message = message;
	}
}
