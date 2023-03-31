package br.com.udemy.command.dispositivos.alexa.command;

import br.com.udemy.command.dispositivos.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command {

	private GenericLight light;

	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}

}
