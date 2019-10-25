package com.example.accessmodifiers.demo;

import com.example.accessmodifiers.test.Foo3;

public class Bar3 extends Foo3 {

	private int sum = 10;

	public void reportSum() {

		sum += getResult();
		System.out.println(sum);
	}

	public static void main(String[] args) {

		Bar3 bar = new Bar3();
		bar.reportSum();
	}

	/*@Override
	public int getResult() {
		return 1;
	}*/

}