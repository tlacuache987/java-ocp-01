package com.example.anonymousinnerclasses;

public class Z07Analyzer {

	public static void main(String[] args) {

		String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		// Lambda expressions can be treated like variables
		StringAnalyzer contains = (String t, String s) -> { return t.contains(s); };
		StringAnalyzer startsWith = (String t, String s) -> t.startsWith(s);
		StringAnalyzer endsWith = (t, s) -> t.endsWith(s);
		
		arrayIterator(strList, searchStr, contains);

		System.out.println();

		System.out.println("Starts With for: " + searchStr);

		// Use short form Lambda
		arrayIterator(strList, searchStr, startsWith);

		System.out.println();

		System.out.println("Ends With for: " + searchStr);

		// Use short form Lambda
		arrayIterator(strList, searchStr, endsWith);
	}

	public static void arrayIterator(String[] strList, String searchStr, StringAnalyzer analyzTool) {
		for (String current : strList) {
			if (analyzTool.analyze(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}
	}
}
