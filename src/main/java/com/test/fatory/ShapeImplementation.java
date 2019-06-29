package com.test.fatory;

public class ShapeImplementation {

		
		Shape shape;
		
		Shape getShape(String  shapType){
			
			if(  shapType.equals("circle") ) {
				
				shape = new Circle();
				return shape;
			}
			else {

				shape = new Rectancge();
				return shape;
			}
			
			
		}
	}

