package com.example.abstractelectronicdevice;

public class Caller {

	public static void main(String[] args) {
		ElectronicDevice t = new Television();

		t.turnOn();
	}
}