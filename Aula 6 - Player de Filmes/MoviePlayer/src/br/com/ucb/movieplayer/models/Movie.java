package br.com.ucb.movieplayer.models;

import java.util.Random;

public class Movie extends Thread {
	
	private int maxDuration;
	
	public Movie(int maxDuration) {
		setMaxDuration(maxDuration);
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println(this.getName() + " started");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int randomPause = new Random().nextInt(maxDuration);
		super.run();
		for (int i = 0; i < maxDuration; i++) {
			try {
				if (i == randomPause) {
					System.out.println("Movie paused.");
					Thread.sleep(3000);
					System.out.println("Movie unpaused.");
				} else {
					System.out.println("Movie time: " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Movie finished");
		System.out.println("--------------------------------------------");
	}

	public int getMaxDuration() {
		return maxDuration;
	}

	public void setMaxDuration(int maxDuration) {
		this.maxDuration = maxDuration;
	}

}
