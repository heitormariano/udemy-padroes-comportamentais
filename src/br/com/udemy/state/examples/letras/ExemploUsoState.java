package br.com.udemy.state.examples.letras;

public class ExemploUsoState {

	public static void main(String[] args) {
		Texto texto = new Texto();

		texto.escrever("Escrevendo um texto de teste.");
		// Saída: ESCREVENDO UM TEXTO DE TESTE.

		// Alterando o estado
		texto.setEstado(new EstadoMinusculas());

		texto.escrever("Escrevendo um NOVO texto.");
		// Saída: escrevendo um novo texto.

	}
}
