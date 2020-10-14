package br.com.ucb.armazen.core;

import br.com.ucb.models.Storage;

public class Main {
	
	public static void main(String[] args) {
		
		Storage storage = new Storage();
		storage.getCounter().start();
		storage.getPrinter().start();
		
	}

}
