package com.incedo.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {

		SortedSet<Student> ts = new TreeSet<>(new StudentNameComparator());

		/*
		 * ts.add(89); ts.add(9); ts.add(897); ts.add(7); ts.add(32); ts.add(45);
		 */
		/*
		 * ts.add("rk"); ts.add("asmi"); ts.add("diksha"); ts.add("harsh");
		 * ts.add("benarjee");
		 */

		ts.add(new Student(100,"amri"));
		ts.add(new Student(89,"saksh"));
		ts.add(new Student(65,"rk"));
		ts.add(new Student(33,"manav"));
		
	

		System.out.println(ts);
	}

}
