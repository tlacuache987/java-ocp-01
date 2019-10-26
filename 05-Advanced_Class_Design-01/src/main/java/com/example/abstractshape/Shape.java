package com.example.abstractshape;

public abstract class Shape {
	double height;
	double width;

	Shape(double a, double b) {
		height = a;
		width = b;
	}

	abstract double calculateArea();

}

class Rectangle extends Shape {
	Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	double calculateArea() {
		System.out.println("Area for rectangle.");
		return height * width;
	}

}

class Triangle extends Shape {
	Triangle(double a, double b) {
		super(a, b);
	}

	@Override
	double calculateArea() {
		System.out.println("Area for triangle.");
		return height * width / 2;
	}

}