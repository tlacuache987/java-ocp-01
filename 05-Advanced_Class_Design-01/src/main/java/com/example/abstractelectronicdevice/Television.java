package com.example.abstractelectronicdevice;

public class Television extends ElectronicDevice {

	public void turnOn() {
		changeChannel(1);
		initializeScreen();
		
		System.out.println("Turning on Television");
	}

	public void turnOff() {
	}

	public void changeChannel(int channel) {
	}

	public void initializeScreen() {
	}
}