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
	
	public static Qualification getByCombination(String combination) {
		Qualification[] qualifications=Qualification.values();
		for(Qualification qualification:qualifications) {
			if(qualification.combination.equals(combination)) {
				return qualification;
			}
		
		

			}
			return null;
		
}
}
