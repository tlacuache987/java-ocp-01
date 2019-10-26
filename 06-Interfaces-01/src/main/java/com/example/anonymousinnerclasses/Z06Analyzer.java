package com.example.anonymousinnerclasses;

public class Z06Analyzer {

	public static void main(String[] args) {

		String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		// Use short form Lambda
		arrayIterator(strList, searchStr, (String t, String s) -> {
			return t.contains(s);
		});

		System.out.println();

		System.out.println("Starts With for: " + searchStr);

		// Use short form Lambda
		arrayIterator(strList, searchStr, (String t, String s) -> t.startsWith(s));
		
		System.out.println();

		System.out.println("Ends With for: " + searchStr);

		// Use short form Lambda
		arrayIterator(strList, searchStr, (String t, String s) -> t.endsWith(s));
	}

	public static void arrayIterator(String[] strList, String searchStr, StringAnalyzer analyzTool) {
		for (String current : strList) {
			if (analyzTool.analyze(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}
	}
}
