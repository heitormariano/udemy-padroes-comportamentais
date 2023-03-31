package br.com.udemy.strategy.examples.vendas.strategy;

public class DescontoMedio implements IDesconto {
	private double percentualDesconto = 0.1;

	@Override
	public double calcularDesconto(double valor) {
		if (valor >= 200 && valor < 1000) {
			return valor * percentualDesconto;
		}
		return 0;
	}

}
