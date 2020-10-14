package br.com.ucb.models;

public class Counter extends Thread{
	
	private int value;
	private Storage storage;
	
	public Counter(Storage storage) {
		this.setValue(0);
		this.setStorage(storage);
		this.setPriority(MAX_PRIORITY);
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
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
				storage.getIntegers().add(value);
				value++;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
