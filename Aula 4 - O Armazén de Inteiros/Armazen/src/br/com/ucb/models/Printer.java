package br.com.ucb.models;

public class Printer extends Thread {

	private Storage storage;
	
	public Printer(Storage storage) {
		this.setStorage(storage);
		this.setPriority(MAX_PRIORITY);
	}
	
	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println(storage.getIntegers().toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
