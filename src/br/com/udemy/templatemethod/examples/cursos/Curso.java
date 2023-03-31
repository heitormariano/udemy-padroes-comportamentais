package br.com.udemy.templatemethod.examples.cursos;

public abstract class Curso {

	public final void montarEmenta() {
		escolherDisciplinas();
		definirCargaHoraria();
		adicionarAtividadesExtras();
	}

	protected abstract void escolherDisciplinas();

	protected abstract void definirCargaHoraria();

	protected void adicionarAtividadesExtras() {
		System.out.println("Adicionando atividades extras...");
	}
}
