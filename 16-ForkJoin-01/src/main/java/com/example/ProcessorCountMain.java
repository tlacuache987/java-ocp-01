package com.example;

public class ProcessorCountMain {

	public static void main(String[] args) {

		int count = Runtime.getRuntime().availableProcessors(); // ?? Get Runtime Available processors.

		System.out.println("Processor Count:" + count);
	}
}