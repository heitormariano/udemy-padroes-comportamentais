package br.com.udemy.mediator.examples.chat;

public class UsuarioImpl implements Usuario {
	private String nome;
	private Mediator chatMediator;

	public UsuarioImpl(String nome, Mediator chatMediator) {
		this.nome = nome;
		this.chatMediator = chatMediator;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Mediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(Mediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	@Override
	public void enviarMensagem(String mensagem) {
		chatMediator.enviarMensagem(mensagem, this);

	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println(this.nome + " recebeu a mensagem: " + mensagem);
	}

}
