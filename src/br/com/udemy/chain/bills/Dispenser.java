package br.com.udemy.chain.bills;

public class Dispenser {

	private Bill chain;

	public Dispenser() {
		this(new Bill(200), new Bill(100), new Bill(50), new Bill(20), new Bill(10), new Bill(2));
	}

	public Dispenser(Bill... bills) {
		for (int index = 0; index < bills.length - 1; index++) {
			Bill currentBill = bills[index];
			currentBill.setNext(bills[index + 1]);
		}
		chain = bills[0];
	}

	public void withDraw(Integer amount) {
		chain.execute(amount);
	}

}
