package br.com.udemy.memento.examples.editor;

public class Memento {
	private final String content;

	public Memento(String contentToSave) {
		content = contentToSave;
	}

	public String getContent() {
		return content;
	}

}
