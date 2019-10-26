package com.example.anonymousinnerclasses;

public class Z01Analyzer {

	public static void main(String[] args) {

		String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		// Create regular class
		AnalyzerTool analyzTool = new AnalyzerTool();
		
		System.out.println("==Contains==");
		for(String current : strList) {
			if(analyzTool.arrContains(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}

	}
}
