package com.tnsif.listdemo;


import java.util.List;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		//list of heterogeneous objects
		List list=new ArrayList();  //loosely Coupled
		
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
		
		System.out.println(list.add(45));

		System.out.println(list);
		
		System.out.println(list.contains("Nayna"));
		
		list.remove(true);
		System.out.println("Updated list  "+list);
		
		list.remove(3);
		System.out.println("New list  "+list);
		
		System.out.println(list.get(5));
		System.out.println(list.indexOf("MAdhuri"));
		
		System.out.println(list.lastIndexOf("MAdhuri"));
		
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		//generic list
		List<String> list1=new ArrayList<>();
		
		list1.add("Ritesh");
		list1.add("Saurabh");
		//list1.add(10);
		//list1.add('a');
		System.out.println(list1);
	}

}
