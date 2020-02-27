package com.cts.oopp.model;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
	}

	public Rectangle(double x) {
		super(x);
	}

	public Rectangle(double x, double y) {
		super(x, y);
	}

	@Override
	public double area() {
		return x*y;
	}

	@Override
	public double perimeter() {
		return 2*(x+y);
	}


}
