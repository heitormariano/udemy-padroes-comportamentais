package br.com.udemy.strategy.examples.vendas.client;

import br.com.udemy.strategy.examples.vendas.context.Produto;
import br.com.udemy.strategy.examples.vendas.strategy.DescontoAlto;
import br.com.udemy.strategy.examples.vendas.strategy.DescontoBaixo;
import br.com.udemy.strategy.examples.vendas.strategy.DescontoMedio;

public class Venda {

	public static void main(String[] args) {
		Produto celular = new Produto("Celular Motorola", 960, new DescontoMedio());
		Produto mouse = new Produto("Mouse Logitech", 75, new DescontoBaixo());
		Produto tablet = new Produto("Tablet Samsung", 2500, new DescontoAlto());

		imprimirDadosProdutos(celular);
		imprimirDadosProdutos(mouse);
		imprimirDadosProdutos(tablet);
	}

	private static void imprimirDadosProdutos(Produto produto) {
		System.out.println("Nome produto: " + produto.getNome());
		System.out.println("Valor Original: " + produto.getValor());
		System.out.println("Valor com desconto: " + produto.obterValorComDesconto());
		System.out.println("-------------------------------------------------");
	}
}
