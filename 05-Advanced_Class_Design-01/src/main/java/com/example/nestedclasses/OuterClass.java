package com.example.nestedclasses;

public class OuterClass {

	public int x = 42;

	public int getOuterX() {
		return this.x;
	}

	// Annonymous member inner class
	public Runnable r = new Runnable() {

		@Override
		public void run() {
			System.out.println("In annonymous member inner class: " + x);
		}
	};

	// Annonymous member inner class
	public Object o = new Object() {

		@Override
		public String toString() {
			return "soy o";
		}
	};

	public void method1() {

		// local class (inner)
		class LocalClass {

			public void localPrint() {
				System.out.println("In local inner class: " + x);
			}
		}

		LocalClass lc = new LocalClass();
		lc.localPrint();

	}

	public void method2() {

		// Annonymous local class (inner)
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("In annonymous local inner class: " + x);
			}
		};

		new Thread(r).start();
		
		//new InnerClass().innerPrint();
	}

	// Inner Nested class
	public class InnerClass {

		public int x = 43;

		public static final int y = 44;

		public void innerPrint() {
			System.out.println("In inner nested class: " + x + ", " + getOuterX());
			//new StaticNestedClass().staticNestedPrint();
		}
	}

	// static Inner Nested class
	public static class StaticNestedClass {

		public int x = 43;

		public static final int y = 44;

		public void staticNestedPrint() {
			System.out.println("In static inner nested class: " + x);
		}
	}
	
	// Nested inner class
	public class A {
		public class B {
			
			public void someMethod() {
				System.out.println("In new A().new B().someMethod() " + x);
				
				// local inner class
				class C {
					
					public void hello() {
						System.out.println("hello");
					}
				}
				
				new C().hello();
			}
		}
	}

}