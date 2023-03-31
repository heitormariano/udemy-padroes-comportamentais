package br.com.udemy.state.examples.letras;

public class Texto {

	private Estado estado;

	public Texto() {
		// Começa o estado com as letras maiúsculas
		this.estado = new EstadoMaiusculas();
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void escrever(String mensagem) {
		// Delega a ação para o estado atual
		estado.escrever(mensagem);
	}

}
