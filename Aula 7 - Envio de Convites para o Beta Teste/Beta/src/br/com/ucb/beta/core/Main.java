package br.com.ucb.beta.core;

import java.util.ArrayList;

import br.com.ucb.beta.jobs.LandingPageJob;

public class Main {
	
	public final static int INVITATION_QUANTITY = 10;

	public static void main(String[] args) {
		
		InviteQueue inviteQueue = new InviteQueue();
		
		ArrayList<LandingPageJob> landingPageJobs = new ArrayList<LandingPageJob>();
		
		for (int i = 0; i < INVITATION_QUANTITY; i++) {
			LandingPageJob lpJob = new LandingPageJob(inviteQueue, "Thread do convite " + i);
			landingPageJobs.add(lpJob);
		}
		
		for (LandingPageJob landingPageJob : landingPageJobs) {
			landingPageJob.start();
		}
	}
}
