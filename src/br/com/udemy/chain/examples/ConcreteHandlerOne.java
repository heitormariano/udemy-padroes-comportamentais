package br.com.udemy.chain.examples;

public class ConcreteHandlerOne extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getType().equalsIgnoreCase("type1")) {
			System.out.println("ConcreteHandlerOne handled the request!");
		} else {
			super.handleRequest(request);
		}
	}
}
