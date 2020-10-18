package br.com.ucb.intro.core;

import br.com.ucb.intro.models.NewThead;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Thread inicial: " + Thread.currentThread().getName());
		
		NewThead thread = new NewThead();
		thread.start();
		
		System.out.println("Continuou executando.");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Main acordou");
	}

}
