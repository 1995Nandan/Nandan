package com.xworkz.core_java.oops.polymorphism_demo;

class StaticPolyDemo{
	int height;
	
	
	StaticPolyDemo(){
		System.out.println("briks");
		height=0;
		
	}
	
	StaticPolyDemo(int i){
		System.out.println("building new house that is " + i + " feet all");
	
	}	
	
	
	void info() {
		System.out.println("house is " + height + " feet tall");
	}
	
	void info(String s) {
		System.out.println(s + " house is " + height + " feet tall");
	
	}
}

public class StaticPoly{
	
	public static void main(String[] args) {
		StaticPolyDemo t = new StaticPolyDemo(0);
		t.info();
		t.info("overloaded method");
		
		//overloaded cunstructor;
		new StaticPolyDemo();
	}
}
