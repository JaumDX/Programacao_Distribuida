package br.com.ucb.beta.models;

public class Invitation{
	
	private String message;
	
	public Invitation(String messsage) {
		setMessage(messsage);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
