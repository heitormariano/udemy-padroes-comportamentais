package br.com.udemy.iterator.examples.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<String> {
	private List<String> musicas;

	public Playlist() {
		musicas = new ArrayList<>();
	}

	public void adicionarMusica(String musica) {
		musicas.add(musica);
	}

	public void removerMusica(String musica) {
		musicas.remove(musica);
	}

	@Override
	public Iterator<String> iterator() {
		return new PlaylistIterator();
	}

	private class PlaylistIterator implements Iterator<String> {
		private int indiceAtual = 0;

		@Override
		public boolean hasNext() {
			return indiceAtual < musicas.size();
		}

		@Override
		public String next() {
			if (hasNext()) {
				String musica = musicas.get(indiceAtual);
				indiceAtual++;
				return musica;
			}
			return null;
		}

	}

}
