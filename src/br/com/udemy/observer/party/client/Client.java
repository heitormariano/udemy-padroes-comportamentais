package br.com.udemy.observer.party.client;

import br.com.udemy.observer.party.observers.Friend;
import br.com.udemy.observer.party.observers.Wife;
import br.com.udemy.observer.party.subject.Doorman;

public class Client {
	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());

		doorman.notifyObservers(false);
		System.out.println("--------- ** --------- ** ---------");

		System.out.println("The husband is comming!");
		doorman.notifyObservers(true);
		System.out.println("--------- ** --------- ** ---------");

	}
}
