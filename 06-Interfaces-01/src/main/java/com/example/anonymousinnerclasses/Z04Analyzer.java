package com.example.anonymousinnerclasses;

public class Z04Analyzer {

	public static void main(String[] args) {

		String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		// Implement anonymous inner class

		System.out.println("==Contains==");
		arrayIterator(strList, searchStr, new StringAnalyzer() {

			@Override
			public boolean analyze(String sourceStr, String searchStr) {
				return sourceStr.contains(searchStr);
			}
		});

	}

	public static void arrayIterator(String[] strList, String searchStr, StringAnalyzer analyzTool) {
		for (String current : strList) {
			if (analyzTool.analyze(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}
	}
}
