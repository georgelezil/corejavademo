package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//Collection is an interface
		//List is also an interface
		//List extends collection interface
		//Collection - List,Set,Queue
		//List - ArrayList, LinkedList, Vector , Stack
		//List - Can contain duplicates and elements are ordered.
		//will store duplicates
		
		//ArrayList size is 10 by default
		//When it reaches 10 it will increase to 1 and a half of the current size ie 15 and that will be copied to a new array
		//Read is fast
		//Can read in index as it is an array implementation
		//Insertion and Deletion will be slow unless it is at the end of the list
		//If we insert in between or delete. Need to realign all the other elements
		
		ArrayList<String> arrayLstObj = new ArrayList<String>();
		arrayLstObj.add("B");
		arrayLstObj.add("A");
		arrayLstObj.add("C");
		arrayLstObj.add("E");
		arrayLstObj.add("D");
		System.out.println(arrayLstObj);
		
		ArrayList<String> arrayLstObj1 = new ArrayList<String>();
		arrayLstObj1.add("B");
		arrayLstObj1.add("A");
		arrayLstObj1.add("C");
		arrayLstObj1.add("E");
		arrayLstObj1.add("D");
		System.out.println(arrayLstObj1);
		
		arrayLstObj1.add(2, "AA");
		
		arrayLstObj.addAll(arrayLstObj1);
		System.out.println(arrayLstObj);
		arrayLstObj1.remove(1);
		System.out.println(arrayLstObj1);
		
		//This is called run time polymorphism
		//If we want we can change ArrayList to linked list
		//After the introduction of Generics in Java 1.5, it is possible to restrict the type of
		//object that can be stored 
		//in the List. The type-safe List can be defined in the following way
		List<String> arrayLstObj3 = new ArrayList<String>();
		arrayLstObj3.add("B");
		arrayLstObj3.add("A");
		arrayLstObj3.add("C");
		arrayLstObj3.add("E");
		arrayLstObj3.add("D");
		System.out.println(arrayLstObj3);
		//sublist
		//indexoff
		//add
		//remove
		
		
		
		//address part and data part
		//not stored in contiguous memory location
		//read will be slow
		//read and write will be fast
		//preffered over arrays
		//disadvantages - we cannot access it directly
		//need to traverse from top to bottom
		LinkedList<String> object = new LinkedList<String>();
		
		// Adding elements to the linked list 
        object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println("Linked list : " + object); 
  
        // Removing elements from the linked list 
        object.remove("B"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  
        // Finding elements in the linked list 
        boolean status = object.contains("E"); 
  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
		
		
		
		
		
	}

}
