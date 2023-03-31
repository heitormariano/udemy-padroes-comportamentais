package br.com.udemy.strategy.examples.vendas.strategy;

public class DescontoBaixo implements IDesconto {
	private double percentualDesconto = 0.05;

	@Override
	public double calcularDesconto(double valor) {
		if (valor < 200) {
			return valor * percentualDesconto;
		}
		return 0;
	}

}
