package com.xworkz.core_java.oops.has_a_relationship;

public class hasArelatisionshipdemo {
	
	public static void main(String[] args) {
		
		library library=new library();
		library.student =new student();
		library.student.id = "A01";
		library.student.name = "nandankumara";
		library.student.branch = "CS";
		library.name  = "Manoj";
		library.location = "Mandya";
		
		System.out.println("Library name :"+ library.name);
		System.out.println("Library location :"+ library.location);
		System.out.println("Library id :"+ library.student.id);
		System.out.println("Library name :"+ library.student.name);
		System.out.println("Library branch :"+ library.student.branch);
		
		
		
	}

}
