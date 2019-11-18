package com.example.pathoperations;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperationsTest {

	public static void main(String[] args) {

		// Normalize
		System.out.println("Normalize");

		Path p1 = Paths.get("/home/student/./bob/file");
		System.out.println("Path p1: " + p1);
		Path pN1 = p1.normalize();
		System.out.println("Normalized p1: " + pN1);
		
		Path p2 = Paths.get("/home/student/bob/../sally/file");
		System.out.println("Path p2: " + p2);
		Path pN2 = p2.normalize();
		System.out.println("Normalized p2: " + pN2);

		System.out.println();

		// Subpath
		System.out.println("Subpath");

		Path p3 = Paths.get("/temp/foo/bar"); // D:\\Temp\\foo\\bar
		Path p4 = p3.subpath(0, 2);
		System.out.println("Path: " + p3);
		System.out.println("Name count: " + p3.getNameCount());
		System.out.println("Name at 0 : " + p3.getName(0));
		System.out.println("Name at 1 : " + p3.getName(1));
		System.out.println("Name at 2 : " + p3.getName(2));
		System.out.println("Subpath from 0 to 2: " + p4);
		
		System.out.println();

		// Resolve
		System.out.println("Resolve");

		Path p5 = Paths.get("/home/clarence/foo");
		System.out.println("Path: " + p5);
		Path p6 = p5.resolve("bar");
		System.out.println("Path \"" + p5 +"\" with resolve \"bar\": " + p6);
		
		Path p7 = Paths.get("foo").resolve("/home/clarence");
		System.out.println("Path \"foo\" with resolve \"/home/clarence\": " + p7);

		System.out.println();
		
	}
}