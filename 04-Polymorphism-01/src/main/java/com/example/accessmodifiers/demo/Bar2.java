package com.example.accessmodifiers.demo;

import com.example.accessmodifiers.test.Foo2;

public class Bar2 extends Foo2 {

	private int sum = 10;

	private int result = 30;

	public void reportSum() {
		sum += result;
		//sum += super.result;

		System.out.println(sum);
	}

	public static void main(String[] args) {

		Bar2 bar = new Bar2();
		bar.reportSum();
	}
}