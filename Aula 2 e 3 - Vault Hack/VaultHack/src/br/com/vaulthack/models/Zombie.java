package br.com.vaulthack.models;
 
public class Zombie extends Thread{
	
	public Zombie() {
		this.setName(this.getClass().getSimpleName());
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
		
		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Seconds left: " + i);
		}
		
		System.out.println("GAME OVER! ZOMBIES WON!");
		System.exit(0);
	}
}
