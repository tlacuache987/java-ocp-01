package com.example.nestedclasses;

public class NestedClassesMain {

	public static void main(String[] args) {

		OuterClass co = new OuterClass();
		co.method1();
		co.method2();

		new Thread(co.r).start();
		
		System.out.println(co.o);

		OuterClass.InnerClass i = co.new InnerClass();
		i.innerPrint();

		OuterClass.StaticNestedClass sn = new OuterClass.StaticNestedClass();
		sn.staticNestedPrint();

		OuterClass.A.B nested = co.new A().new B();
		nested.someMethod();
	}
}