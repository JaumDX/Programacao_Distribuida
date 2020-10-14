package br.com.ucb.models;

import java.util.ArrayList;

public class Storage {
	
	private ArrayList<Integer> integers;
	private Counter counter;
	private Printer printer;
	
	public Storage() {
		this.setCounter(new Counter(this));
		this.setPrinter(new Printer(this));
		this.integers = new ArrayList<>();
	}
	
	
	
	public ArrayList<Integer> getIntegers() {
		return integers;
	}
	public void setIntegers(ArrayList<Integer> integers) {
		this.integers = integers;
	}



	public Counter getCounter() {
		return counter;
	}



	public void setCounter(Counter counter) {
		this.counter = counter;
	}



	public Printer getPrinter() {
		return printer;
	}



	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	
	
	

}
