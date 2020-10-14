package br.com.ucb.movieplayer.core;

import br.com.ucb.movieplayer.models.Movie;

public class Main {
	
	public static void main(String[] args) {
		
		
		Thread firstMovie = new Movie(10);
		firstMovie.setName("First movie");
		Thread secondMovie = new Movie(10);
		secondMovie.setName("Second movie");
		
		firstMovie.start();
		try {
			firstMovie.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		secondMovie.start();
		
	}

}
