package com.incedo.cfw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
	
	public static void main(String[] args) {
		//creating list collection object
		
		List<Integer> al = new LinkedList<>();
		al.add(100);
		al.add(8);
		al.add(90);
		al.add(89);
		al.add(5);
		
		
		
		
		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 */
		
		
		/*
		 * for(Integer o:al) {
		 * 
		 * if(o%2==0) { System.out.println(o); } }
		 */
		
		
		//Iterator<Integer> itr = al.iterator();
		
		/*
		 * while(itr.hasNext()) { if(itr.next()%2==0) { itr.remove(); } }
		 */
		
		ListIterator<Integer> ltr = al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("======================");
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

}
