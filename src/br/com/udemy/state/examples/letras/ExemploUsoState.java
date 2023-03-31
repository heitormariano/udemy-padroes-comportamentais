package br.com.udemy.state.examples.letras;

public class ExemploUsoState {

	public static void main(String[] args) {
		Texto texto = new Texto();

		texto.escrever("Escrevendo um texto de teste.");
		// Sa�da: ESCREVENDO UM TEXTO DE TESTE.

		// Alterando o estado
		texto.setEstado(new EstadoMinusculas());

		texto.escrever("Escrevendo um NOVO texto.");
		// Sa�da: escrevendo um novo texto.

	}
}
