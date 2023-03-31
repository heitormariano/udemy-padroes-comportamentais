package br.com.udemy.chain.examples;

public class ConcreteHandlerTwo extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getType().equalsIgnoreCase("type2")) {
			System.out.println("ConcreteHandlerTwo handled the request!");
		} else {
			super.handleRequest(request);
		}
	}
}
