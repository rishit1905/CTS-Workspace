package com.cts.oopp.model;

public class Circle extends Shape {

	public Circle() {
		super();
	}

	public Circle(double x) {
		super(x);
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(x, 2);
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*x;
	}

}
