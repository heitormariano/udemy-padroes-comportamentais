package br.com.udemy.observer.party.observers;

public class Friend implements Observer {

	@Override
	public void updateArrival(boolean status) {
		if (status) {
			sendGift();
		} else {
			System.out.println("Sleep...");
		}
	}

	public void sendGift() {
		System.out.println("Look, I bought your favorite game!");
	}

}
