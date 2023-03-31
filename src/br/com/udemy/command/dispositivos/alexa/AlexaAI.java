package br.com.udemy.command.dispositivos.alexa;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {
	private Map<String, String[]> associations;

	public AlexaAI() {
		associations = new HashMap<String, String[]>();
	}

	public void addAssociation(String key, String[] association) {
		associations.put(key, association);
	}

	public String getFindAssociations(String request) {

		for (String[] association : associations.values()) {
			/*
			 * if (Stream.of(association).allMatch(elem -> request.contains(elem))) { 
			 * return getKeyFromAssociations(association); }
			 */
			if (Stream.of(association).allMatch(request::contains)) {
				return getKeyFromAssociations(association);
			}
		}
		return null;
	}

	private String getKeyFromAssociations(String... keywords) {
		String key = associations.entrySet().stream().filter(entry -> keywords.equals(entry.getValue()))
				.map(Map.Entry::getKey).findFirst().get();

		return key;
	}
}
