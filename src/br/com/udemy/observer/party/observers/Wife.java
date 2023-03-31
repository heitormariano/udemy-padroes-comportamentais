package br.com.udemy.observer.party.observers;

public class Wife implements Observer {

	@Override
	public void updateArrival(boolean status) {
		if (status) {
			startParty();
		} else {
			System.out.println("Hold on! Let's wait a little bit.");
		}
	}

	public void startParty() {
		System.out.println("Let´s Party! Uhuuu! :D");
	}

}
