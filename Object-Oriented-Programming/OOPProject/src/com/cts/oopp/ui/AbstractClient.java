package com.cts.oopp.ui;

import com.cts.oopp.model.Circle;
import com.cts.oopp.model.Rectangle;
import com.cts.oopp.model.Shape;

public class AbstractClient {

	public static void main(String[] args) {

		Shape shape;
		shape=new Rectangle(10,2);
		System.out.println(shape);
		shape=new Circle(4);
		System.out.println(shape);
 	}

}
