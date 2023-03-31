package br.com.udemy.command.dispositivos.alexa.command;

import br.com.udemy.command.dispositivos.alexa.lights.GenericLight;

public class TurnLightOffCommand implements Command {

	private GenericLight light;

	public TurnLightOffCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}

}
