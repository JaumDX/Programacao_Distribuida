package br.com.ucb.intro.models;

public class NewThead extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		this.setName("New thread!!");
		this.setPriority(MAX_PRIORITY);
		
		System.out.println("Thread sendo executadas: " + Thread.currentThread());
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("New thread acordou!");
	}

}
