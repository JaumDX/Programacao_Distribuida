package br.com.vaulthack.models;

public class Survivor extends Thread{
	
	protected Bunker bunker;
	private int firstTry = 0;

	
	public Survivor(Bunker bunker, int firstTry) {
		setFirstTry(firstTry);
		this.bunker = bunker;
		setName(this.getClass().getSimpleName());
		setPriority(MAX_PRIORITY);
	}


	public int getFirstTry() {
		return firstTry;
	}


	public void setFirstTry(int firstTry) {
		this.firstTry = firstTry;
	}
	
	private void guessPassword() {
		
		for (int i = getFirstTry(); i < Bunker.MAX_PASSWORD; i++) {
			
			if (bunker.isPasswordCorrect(i)) {
				System.out.println(this.getName() + " choosed the right password!" + i);
				System.out.println("Survivors are saved!");
				System.exit(0);
			}
		}
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println(this.getClass().getSimpleName() + " started!");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		guessPassword();
	}
	
	
	
	
}
