package com.example.properties;

import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {

		// Read System properties
		Properties props = System.getProperties();
		
		props.list(System.out);

	}
}