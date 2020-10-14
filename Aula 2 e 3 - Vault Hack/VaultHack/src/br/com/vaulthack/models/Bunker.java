package br.com.vaulthack.models;

public class Bunker {
	
	public static final int MAX_PASSWORD = 9999;
	
	private int password;
	
	public Bunker(int password) {
		this.password = password;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean isPasswordCorrect(int password) {
		
		try {
			Thread.sleep(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return getPassword() == password;
	}
	
	

}
