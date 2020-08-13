package com.altimetrik.bus.reservation.utils;

public enum SortByEnum {

	OPERATORNAME("OPERATORNAME"), DEPTIME("DEPTIME"), ARRTIME("ARRTIME"), DURATION("DURATION"), PRICE("PRICE");

	private String type;

	SortByEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
