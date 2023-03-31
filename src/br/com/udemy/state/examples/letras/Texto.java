package br.com.udemy.state.examples.letras;

public class Texto {

	private Estado estado;

	public Texto() {
		// Come�a o estado com as letras mai�sculas
		this.estado = new EstadoMaiusculas();
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void escrever(String mensagem) {
		// Delega a a��o para o estado atual
		estado.escrever(mensagem);
	}

}
