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
