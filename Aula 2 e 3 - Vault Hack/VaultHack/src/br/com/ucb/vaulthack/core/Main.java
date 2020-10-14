package br.com.ucb.vaulthack.core;

import java.util.ArrayList;
import java.util.Random;

import br.com.vaulthack.models.Bunker;
import br.com.vaulthack.models.Survivor;
import br.com.vaulthack.models.Zombie;

public class Main {

	public static void main(String[] args) {
		
		Random password = new Random();
		Bunker bunker = new Bunker(password.nextInt(Bunker.MAX_PASSWORD));
		
		ArrayList<Thread> threads =  new ArrayList<Thread>();
		
		threads.add(new Survivor(bunker, password.nextInt(Bunker.MAX_PASSWORD)));
		threads.add(new Survivor(bunker, password.nextInt(Bunker.MAX_PASSWORD)));
		threads.add(new Survivor(bunker, password.nextInt(Bunker.MAX_PASSWORD)));
		
		threads.add(new Zombie());
		
		for (Thread thread : threads) {
			thread.start();
		}
		
	}
}
