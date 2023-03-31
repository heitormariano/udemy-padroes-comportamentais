package br.com.udemy.observer.party.subject;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.observer.party.observers.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void add(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers(boolean status) {
		observers.forEach(elem -> elem.updateArrival(status));
	}
}
