package br.com.ucb.beta.jobs;

import br.com.ucb.beta.core.InviteQueue;
import br.com.ucb.beta.models.Invitation;

public class LandingPageJob extends Thread {
	
	private InviteQueue inviteQueue;
	
	public LandingPageJob(InviteQueue inviteQueue, String threadName) {
		setInviteQueue(inviteQueue);
		this.setName(threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(Thread.currentThread().getName() + "está se preparando para enviar o convite.");
		
		inviteQueue.sendInvite(new Invitation("Você esta convidado."));
	}

	
	//getters and setters
	
	public InviteQueue getInviteQueue() {
		return inviteQueue;
	}

	public void setInviteQueue(InviteQueue inviteQueue) {
		this.inviteQueue = inviteQueue;
	}

}
