package com.test.fatory;

public class TestFactory {

	public static void main(String[] args) {
		
		Shape shape;
		ShapeImplementation shapeFactory
		= new ShapeImplementation();
		
		 shape = shapeFactory.getShape("circle");
		 shape.draw();
	}

}
