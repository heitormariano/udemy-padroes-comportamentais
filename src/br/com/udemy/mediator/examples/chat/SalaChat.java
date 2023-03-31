package br.com.udemy.mediator.examples.chat;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements Mediator {
	private List<Usuario> usuarios;

	public SalaChat() {
		this.usuarios = new ArrayList<>();
	}

	public void adicionarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	@Override
	public void enviarMensagem(String mensagem, Usuario remetente) {
		for (Usuario usuario : usuarios) {
			if (usuario != remetente) {
				usuario.receberMensagem(mensagem);
			}
		}

	}

}
