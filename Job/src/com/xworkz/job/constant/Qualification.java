package com.xworkz.job.constant;

public enum Qualification {

BE("BE"),
BSC("BSC"),
BCA("BCA"),
BCOM("BCOM"),
DEFAULT("NA");
	
	private String combination;
	
	private Qualification(String combination) {
	this.combination=combination;
	
	}
	public String getCombination() {
		return combination;
	}
	
	public static  Qualification getByValue(String Value) {
		
		Qualification[] qualification 	= Qualification.values();

		for(Qualification qualification2:qualification) {
			System.out.println(qualification2.combination+"comparing");
			if(qualification2.equals(Value)) {
				return qualification2;
			}
		}
			return null;
		
}
}
