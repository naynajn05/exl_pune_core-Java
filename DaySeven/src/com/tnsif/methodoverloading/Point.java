package com.tnsif.methodoverloading;

public class Point {
	
	private float x;
	private float y;
	
	
	//constructor overloading
	public Point() {
		this.x=5f;
		this.y=2f;
	}

	public Point(float x) {
		
		this.x = x;
		this.y = x;
	}

	public Point(float x, float y) {
		
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
