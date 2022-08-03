package com.xworkz.job.constant;

public enum Designation {

	SYSTEM_ADMIN("sytem admin"), 
	HUMAN_RESOURCES("human resources"),
	SYSTEM_ENGINEER("system engineer"),
	TECHNICAL_SUPPORT("technical support"),
	SOFTWARE_DEVELOPER("software developer"),
	TESTING_ENGINEER("testing engineer"),
	DEFAULT("NA");
	
	private String tittle;
	
	private Designation(String tittle) {
		this.tittle=tittle;
	
	
	}
	public String getTittle() {
		return tittle;
	}
	
	public static  Designation getByValue(String Value) {
		
	Designation[ ] designation	= Designation.values();
	for(Designation designation2:designation) {
		System.out.println(designation2.tittle+"comparing");
		if(designation2.equals(Value)) {
			return designation2;
		}
	}
		return null;
		
	}
}
