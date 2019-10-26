package com.example.anonymousinnerclasses;

@FunctionalInterface
public interface StringAnalyzer {

	public boolean analyze(String sourceStr, String searchStr);
}
