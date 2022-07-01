package com.xworkz.core_java.oops.overloading;

public class Case1 {

	public void m(int i)
	{
	System.out.println("int types"+" "+i);
}

 public void m(float j)
 {
		System.out.println("float types"+" "+j);
}
 

public static void main(String[] args) {
	 
	Case1 case1=new Case1();
	
	case1.m(20);
	case1.m('a');
}
}
