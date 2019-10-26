package com.example.abstractelectronicdevice;

public class Television extends ElectronicDevice {

	@Override
	public void turnOn() {
		changeChannel(1);
		initializeScreen();

		System.out.println("Turning on Television");
	}

	@Override
	public void turnOff() {
	}

	private void initializeScreen() {
	}

	private void changeChannel(int i) {
	}

}