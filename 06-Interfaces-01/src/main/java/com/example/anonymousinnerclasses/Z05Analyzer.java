package com.example.anonymousinnerclasses;

public class Z05Analyzer {

	public static void main(String[] args) {

		String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		// Lambda Expression replaces anonymous inner class
		arrayIterator(strList, searchStr, (String t, String s) -> {
			return t.contains(s);
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
