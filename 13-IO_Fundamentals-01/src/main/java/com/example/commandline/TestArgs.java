package com.example.commandline;

public class TestArgs {

	public static void main(String[] args) {
		
		// java ClassName perro gato polecia

		// Iterate args ??
		for(int i = 0; i<args.length; i++) {
			System.out.println("args["+i+"] = " + args[i]);
		}

	}
}