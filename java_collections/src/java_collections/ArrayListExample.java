package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

// to demostarte the arraylist using generics
public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		
		System.out.println(list);
		
		// Travesing list through iterator
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {   // check if iterator has a element
			System.out.println(itr.next());//priting the elemet and move next
		}
		
	}
}


package com.tnsif.collections;

import java.util.LinkedList;

// to demostarte linked list
public class ListExample {
public static void main(String[] args) {
	LinkedList<Integer> s1=new LinkedList<Integer>(); 
	s1.add(2);
	s1.add(3);
	s1.add(8);
	s1.add(8);
	
	System.out.println(s1);
	LinkedList<Integer> s2=new LinkedList<Integer>(); 
	
	s2.add(12);
	s2.add(56);
	s1.addAll(s2);
	System.out.println(s1); // it is printing all objects
	s2.addFirst(78);
	s2.addLast(80);
	System.out.println(s2);
	s2.remove(2);
	System.out.println(s2);
	
}
}


package com.tnsif.collections;
import java.util.Stack;
// to demostarte stack class
public class Stackdemo {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	
	s.push(1);   // push() used to insert elemets
	s.push(5);
	s.push(3);
	s.push(8);
	s.push(9);
	
	System.out.println(s);
	
	s.pop();  // to remove element
	System.out.println(s);
	s.pop();
	System.out.println(s);
	// to search element
	if(s.isEmpty()) {
		System.out.println("stack is empty");
	}
	else {
		System.out.println("not empty");
	}
	System.out.println(s.search(1));
}
}
