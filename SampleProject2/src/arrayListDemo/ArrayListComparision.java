package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparision {
	
	
public static void main(String[] args) {
	
	//1.sort and then equals:
	
	ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	
	ArrayList<String> l2=new ArrayList<String>(Arrays.asList( "A","B","C","D","E"));
	

	
	Collections.sort(l1);
	Collections.sort(l2);
	
System.out.println(l1.equals(l2));

ArrayList<String> l3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));

System.out.println(l1.equals(l3));

Collections.sort(l3);

System.out.println(l1.equals(l3));//after sorting it compares without caring about sequence

//2.find out additional element present

ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

ArrayList<String> l5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

//l4.removeAll(l5); //this method will remove all the elements of l4 which are same as l5
//
//System.out.println(l4);


//3.find out the missing element

l5.removeAll(l4);

System.out.println(l5);

//4.extract common element from two arrays

ArrayList<String> lang1= new ArrayList<String>(Arrays.asList("Java", "Ruby", "Python","c#","JS"));

ArrayList<String> lang2= new ArrayList<String>(Arrays.asList("Java", "Ruby", "Python","c#","PHP"));

lang1.retainAll(lang2);

System.out.println(lang1);




	
}
}
