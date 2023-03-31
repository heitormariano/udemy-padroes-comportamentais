package br.com.udemy.mediator.examples.chat;

public class Main {

	public static void main(String[] args) {
		SalaChat salaChat = new SalaChat();

		Usuario joao = new UsuarioImpl("João", salaChat);
		Usuario pedro = new UsuarioImpl("Pedro", salaChat);
		Usuario tiago = new UsuarioImpl("Tiago", salaChat);

		salaChat.adicionarUsuario(joao);
		salaChat.adicionarUsuario(pedro);
		salaChat.adicionarUsuario(tiago);

		joao.enviarMensagem("Fala Galera!");
		pedro.enviarMensagem("Bom dia para todos!");
		tiago.enviarMensagem("Olá! Ótimo dia, pessoal!");
	}
}
