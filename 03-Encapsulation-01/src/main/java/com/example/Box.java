package com.example;

public class Box {

	private double length, width, height;

	public Box() {
		this.length = 1;
		this.height = 1;
		this.width = 1;

	}

	double volume() {

		return width * height * length;
	}

	public static void main(String args[]) {

		double vol;

		Box mybox1 = new Box();

		Box mybox2 = null;

		Box mybox3 = null;

		vol = mybox1.volume();
		System.out.println(" volume of mybox1 " + vol);

		vol = mybox2.volume();
		System.out.println(" volume of mybox2 " + vol);

		vol = mybox3.volume();
		System.out.println(" volume of mybox3 " + vol);
	}

}
