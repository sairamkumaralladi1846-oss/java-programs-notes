package com;

class Rectangle{
	int width;
	int height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getWidth() {
		return this.width;
	}
	
	void calArea() {
		System.out.println(this.width * this.height);
	}
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	
	
	
}