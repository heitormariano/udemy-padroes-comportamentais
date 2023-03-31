package br.com.udemy.chain.examples;

public abstract class Handler {

	private Handler nextHandler;

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void handleRequest(Request request) {
		if (nextHandler != null) {
			nextHandler.handleRequest(request);
		} else {
			System.out.println("No handlers for the " + request.getType() + " request at the moment!");
		}
	}
}
