package com.semurr.BO;

import org.springframework.stereotype.Component;

@Component
public class MyClass {
	
	private String value = "my value";

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
