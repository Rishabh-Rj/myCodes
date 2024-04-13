package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

//		List<String> fruits = new LinkedList();
//		
//		//method to add the element in the list
//		fruits.add("Apple");
//		fruits.add("Orange");
//		fruits.add("Hi");
//
//		String temp[] = new String[fruits.size()];
//
//		fruits.toArray(temp);
//
//		for (String e : temp) {
//			System.out.println(e);
//		}
		
		
		//Array List - without generics/no data type define for list, can be problem in big project 
		ArrayList fruits= new ArrayList();
		fruits.add("Apple");
     	fruits.add(23);
     	System.out.println(fruits);
     	
     	
     	//withGenerics
     	ArrayList<String> fruits2=new ArrayList();
     	fruits2.add("Apple");
//     	fruits2.add(23);   
     	
     	
     	//since arraylist , linked list etc all implement common , that is List, we can do as below 
     	List<String>fruits3= new ArrayList();
     	List<String>veg= new LinkedList();
     	
     	fruits3.add("orange");
     	veg.add("potato");
     	
     	fruits3.addAll(veg);
     	System.out.println(fruits3);
	 	
     	//ready made method of array list, add, contains etc
     	System.out.println(fruits3.contains("chips"));
		
     	
     	
     	ArrayList<Integer> rj=new ArrayList<>();
     	rj.add(25);
     	rj.add(22);
     	rj.add(3);
     	System.out.println("original List: "+rj);
     	Collections.sort(rj);
     	System.out.println("Sorted List Asc order: "+rj);
     	
     	Collections.sort(rj,Collections.reverseOrder());
     	System.out.println("Sorted List Desc order: "+rj);
     	System.out.println(1%10);
	}
}