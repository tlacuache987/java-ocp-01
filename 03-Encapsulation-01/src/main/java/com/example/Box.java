package com.example;

public class Box {

	private double length, width, height;

	public Box() {
		this.length = 1;
		this.height = 1;
		this.width = 1;
		System.out.println("new Box()");
	}

	public Box(double length) {
		this.width = this.length = this.height = length;
		System.out.println("new Box(length)");
	}

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("new Box(length, width, height)");
	}

	double volume() {

		return width * height * length;
	}

	public static void main(String args[]) {

		double vol;

		Box mybox1 = new Box();

		Box mybox2 = new Box(3);

		Box mybox3 = new Box(1,2,3);

		vol = mybox1.volume();
		System.out.println(" volume of mybox1 " + vol);

		vol = mybox2.volume();
		System.out.println(" volume of mybox2 " + vol);

		vol = mybox3.volume();
		System.out.println(" volume of mybox3 " + vol);
	}

}
