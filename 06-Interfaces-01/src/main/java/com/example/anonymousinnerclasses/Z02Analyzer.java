package com.example.anonymousinnerclasses;

public class Z02Analyzer {

	public static void main(String[] args) {

		String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		// Call concrete class that implments StringAnalyzer
		StringAnalyzer analyzTool = new ContainsAnalyzer();

		System.out.println("==Contains==");
		for (String current : strList) {
			if (analyzTool.analyze(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}
	}
}
