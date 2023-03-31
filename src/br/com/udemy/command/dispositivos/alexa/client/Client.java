package br.com.udemy.command.dispositivos.alexa.client;

import br.com.udemy.command.dispositivos.alexa.Alexa;
import br.com.udemy.command.dispositivos.alexa.command.TurnLightOffCommand;
import br.com.udemy.command.dispositivos.alexa.command.TurnLightOnCommand;
import br.com.udemy.command.dispositivos.alexa.lights.PhillipsHueLight;
import br.com.udemy.command.dispositivos.alexa.lights.XiaomiLight;

public class Client {

	public static void configurarAlexa(Alexa alexa) {
		PhillipsHueLight livingRoomLight = new PhillipsHueLight();
		XiaomiLight kitchenLight = new XiaomiLight();

		alexa.addIntegration("Turn on the Living room light", new TurnLightOnCommand(livingRoomLight), "on",
				"Living room", "light");

		alexa.addIntegration("Turn off the Living room light", new TurnLightOffCommand(livingRoomLight), "off",
				"Living room", "light");

		alexa.addIntegration("Turn on the Kitchen light", new TurnLightOnCommand(kitchenLight), "on", "Kitchen",
				"light");

		alexa.addIntegration("Turn off the Kitchen light", new TurnLightOffCommand(kitchenLight), "off", "Kitchen",
				"light");
	}

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configurarAlexa(alexa);

		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");

		alexa.sendRequest("Please, could you Turn off the Living room light?");
	}
}
