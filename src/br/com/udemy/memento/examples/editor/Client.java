package br.com.udemy.memento.examples.editor;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Editor editor = new Editor("initial content");
		List<Memento> savedStates = new ArrayList<>();

		// saving first state
		savedStates.add(editor.save());

		// adding a new content
		editor.setContent("new content");
		savedStates.add(editor.save());

		// adding another content
		editor.setContent("content again");
		savedStates.add(editor.save());

		// Restoring second saved state
		editor.restore(savedStates.get(1));
		System.out.println(editor.getContent());

		// Restoring first saved state
		editor.restore(savedStates.get(0));
		System.out.println(editor.getContent());
	}
}
