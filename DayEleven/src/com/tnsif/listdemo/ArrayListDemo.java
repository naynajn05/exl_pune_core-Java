package com.tnsif.listdemo;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// list of heterogeneous objects
		List list = new ArrayList(); // loosely Coupled

		list.add(10);
		list.add(20);
		list.add("MAdhuri");
		list.add(12.7f);
		list.add(455.88d);
		list.add(true);
		list.add('A');
		list.add("MAdhuri");
		list.add(null);
		System.out.println(list.size());
		System.out.println(list);
		// Collections.sort(list); //RTE-class cast exception

		System.out.println(list.add(45));

		System.out.println(list);

		System.out.println(list.contains("Nayna"));

		list.remove(true);
		System.out.println("Updated list  " + list);

		list.remove(3);
		System.out.println("New list  " + list);

		System.out.println(list.get(5));
		System.out.println(list.indexOf("MAdhuri"));

		System.out.println(list.lastIndexOf("MAdhuri"));

		list.clear();
		System.out.println(list);
		System.out.println(list.size());

		// generic list
		List<String> list1 = new ArrayList<>();

		list1.add("Ritesh");
		list1.add("Saurabh");
		list1.add("Mrudula");
		list1.add("Shreyas");
		list1.add("Pavan");

		// list1.add(10);
		// list1.add('a');
		System.out.println(list1);

		Collections.sort(list1);
		System.out.println("After sorting the list");
		System.out.println(list1);

		Collections.reverse(list1);
		System.out.println("Reverse list");
		System.out.println(list1);

		// traverse through the list

		Iterator<String> i = list1.iterator();
		while (i.hasNext()) {
			String name = i.next();
			System.out.println(name);

		}
		
		ListIterator<String> revreseNames=list1.listIterator(list1.size());
		
		while(revreseNames.hasPrevious())
		{
			String rnames=revreseNames.previous();
			System.out.println("Reverse Names  "+rnames);

		}
		

	}

}
