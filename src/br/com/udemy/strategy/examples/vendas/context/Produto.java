package br.com.udemy.strategy.examples.vendas.context;

import br.com.udemy.strategy.examples.vendas.strategy.IDesconto;

public class Produto {

	private String nome;
	private double valor;
	private IDesconto desconto;

	public Produto(String nome, double valor, IDesconto desconto) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public IDesconto getDesconto() {
		return desconto;
	}

	public void setDesconto(IDesconto desconto) {
		this.desconto = desconto;
	}

	public double obterValorComDesconto() {
		return valor - desconto.calcularDesconto(valor);
	}

}
