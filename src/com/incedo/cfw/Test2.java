package com.incedo.cfw;

import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		//create the set object
		Set<Student> s = new HashSet<>();
		
		/*
		 * for(int i=1;i<=10;i++) { s.add(i); } s.add(78); s.add(8); s.add(89);
		 * s.add(56); s.add(null);
		 * 
		 * System.out.println(s);
		 */
		
		Student s1 = new Student(100,"rk");
		Student s2 = new Student(89,"aman");
		Student s3 = new Student(8,"diksha");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		System.out.println(s);
	}
	
	
}
