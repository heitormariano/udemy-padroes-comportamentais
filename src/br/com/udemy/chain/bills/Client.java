package br.com.udemy.chain.bills;

public class Client {

	public static void main(String[] args) {
		Dispenser dispenser = new Dispenser();

		System.out.println("Withdrawing $4500...");
		dispenser.withDraw(4500);

		System.out.println("Withdrawing $7133...");
		dispenser.withDraw(7133);
		
		System.out.println("Withdrawing $260...");
		dispenser.withDraw(260);

		System.out.println("Withdrawing $129...");
		dispenser.withDraw(129);

		System.out.println("Withdrawing $11...");
		dispenser.withDraw(11);

	}
}
