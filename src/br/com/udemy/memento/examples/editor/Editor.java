package br.com.udemy.memento.examples.editor;

public class Editor {

	private String content;

	public Editor(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Memento save() {
		return new Memento(content);
	}

	public void restore(Memento memento) {
		content = memento.getContent();
	}

}
