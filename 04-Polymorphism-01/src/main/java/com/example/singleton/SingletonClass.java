package com.example.singleton;

public class SingletonClass {

	private static final SingletonClass instance = new SingletonClass();

	private int nextId;

	private SingletonClass() {
		nextId = 0;
	}

	public static SingletonClass getInstance() {
		return instance;
	}
	
	public int getNextId() {
		return ++nextId;
	}

	@Override
	public String toString() {
		return "SingletonClass [nextInt=" + nextId + "]";
	}

}