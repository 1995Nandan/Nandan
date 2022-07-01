package com.xworkz.core_java.oops.overloading;

class Overloading {
	public static  void m() {
		System.out.println("no arguments");
		
	}
	 
public static void m(int n) {
	System.out.println("int arguments types" +" "+ n);
}
	public static void m(double m) {
		System.out.println("double aruguments types" +" "+ m);
		
	}


public static void main(String[] args) {
	//Overloading m=new Overloading();
	
	Overloading.m();
	Overloading.m(5);
	Overloading.m(5.25);
	}


}



