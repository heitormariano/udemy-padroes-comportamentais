package br.com.udemy.templatemethod.examples.cursos;

public class CursoPresencial extends Curso {

	@Override
	protected void escolherDisciplinas() {
		System.out.println("Escolhendo disciplinas para curso presencial...");
	}

	@Override
	protected void definirCargaHoraria() {
		System.out.println("Definindo carga horária para curso presencial...");
	}

}
