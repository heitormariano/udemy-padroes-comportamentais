package br.com.udemy.templatemethod.examples.cursos;

public class Main {

	public static void main(String[] args) {

		Curso cursoPresencial = new CursoPresencial();
		cursoPresencial.montarEmenta();

		System.out.println("--------------------------------------------");

		Curso cursoEAD = new CursoEAD();
		cursoEAD.montarEmenta();
	}
}
