package br.com.ucb.beta.core;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import br.com.ucb.beta.models.Invitation;

public class InviteQueue {
	
	private final Lock queueLock = new ReentrantLock();
	
	public void sendInvite(Invitation invitation) {
		
		queueLock.lock();
		
		try {
			Long duration = (long) Math.random() * 10000;
			
			System.out.println("Convidando uma pessoa em " + duration / 10000);
			
			Thread.sleep(duration);
		} catch (Exception e) {
			e.printStackTrace();
			queueLock.unlock();
		} finally {
			System.out.println(Thread.currentThread().getName() + " Convite enviado!");
			System.out.println("Mensagem do convite: " + invitation.getMessage());
			
			queueLock.unlock();
		}
		
		
		
	}

}
