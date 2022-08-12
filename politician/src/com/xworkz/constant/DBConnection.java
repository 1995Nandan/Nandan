package com.xworkz.constant;

public enum DBConnection {

	URL("jdbc:mysql://localhost:3306/politician_info"), USERNAME("root"), SECRET("nandansonu225");

	private String value;

	private DBConnection(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;

	}
}
