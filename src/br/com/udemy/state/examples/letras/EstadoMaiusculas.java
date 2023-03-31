package br.com.udemy.state.examples.letras;

public class EstadoMaiusculas implements Estado {

	@Override
	public void escrever(String mensagem) {
		System.out.println(mensagem.toUpperCase());
	}

}
