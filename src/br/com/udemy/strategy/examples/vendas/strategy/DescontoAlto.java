package br.com.udemy.strategy.examples.vendas.strategy;

public class DescontoAlto implements IDesconto {

	private double percentualDesconto = 0.15;

	@Override
	public double calcularDesconto(double valor) {
		if (valor > 1000) {
			return valor * percentualDesconto;
		}
		return 0;
	}

}
