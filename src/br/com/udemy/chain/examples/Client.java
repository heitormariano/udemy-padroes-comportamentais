package br.com.udemy.chain.examples;

public class Client {

	public static void main(String[] args) {
		Handler handlerOne = new ConcreteHandlerOne();
		Handler handlerTwo = new ConcreteHandlerTwo();
		handlerOne.setNextHandler(handlerTwo);

		Request request1 = new Request("type1");
		Request request2 = new Request("type2");
		Request request3 = new Request("type3");

		handlerOne.handleRequest(request1);
		handlerOne.handleRequest(request2);
		handlerOne.handleRequest(request3);

	}
}
