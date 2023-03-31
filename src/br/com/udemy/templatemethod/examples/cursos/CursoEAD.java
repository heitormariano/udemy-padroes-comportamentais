package br.com.udemy.templatemethod.examples.cursos;

public class CursoEAD extends Curso {

	@Override
	protected void escolherDisciplinas() {
		System.out.println("Escolhendo disciplinas para curso EAD...");
	}

	@Override
	protected void definirCargaHoraria() {
		System.out.println("Definindo carga horária para curso EAD...");
	}

	@Override
	protected void adicionarAtividadesExtras() {
		System.out.println("Adicionando atividades extras para curso EAD...");
	}

}
