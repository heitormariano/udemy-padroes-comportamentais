package br.com.udemy.state.examples.letras;

public class EstadoMinusculas implements Estado {

	@Override
	public void escrever(String mensagem) {
		System.out.println(mensagem.toLowerCase());
	}

}
