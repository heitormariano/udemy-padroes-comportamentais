package br.com.udemy.mediator.examples.chat;

public interface Mediator {

	void enviarMensagem(String mensagem, Usuario remetente);
}
