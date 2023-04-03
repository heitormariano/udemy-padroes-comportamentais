package br.com.udemy.iterator.examples.playlist;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Playlist playlist = new Playlist();
		playlist.adicionarMusica("Come To Me - Jenn Johnson");
		playlist.adicionarMusica("Fly - Jason Upton");
		playlist.adicionarMusica("Your Love Never Fails - Jesus Culture");

		Iterator<String> iterator = playlist.iterator();
		while (iterator.hasNext()) {
			String musica = iterator.next();
			System.out.println(musica);
		}
	}
}
