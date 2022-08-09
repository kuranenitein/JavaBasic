package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[]args)
{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	
	arr.add(100);
	arr.add(41);
	System.out.println(arr.get(0));
	arr.remove(0);
	System.out.println(arr.size());
	
	ArrayList<String> arr1=new ArrayList<String>();
	arr1.add("java");
	arr1.add("c#");
	arr1.add("c++");
	arr1.add("ruby");
	arr1.add("python");
	
	ArrayList<String> arr2=new ArrayList<String>();
	arr2.add("javascript");
	arr2.add("scala");
	arr2.add("javascript");
	
	arr1.addAll(arr2); //adds elements of arr2 to arr1
	
	System.err.println(arr1);
	
	arr1.addAll(3,arr2);//from index 3 of arr1 all elements of arr2 will be added and then remaining elements of arr1 will be shifted
	
	System.out.println(arr1);//array list is printed here
	
	System.out.println(arr1.contains("ruby"));//true or false
	
	System.out.println(arr1.indexOf("java")>=0);//true or false
	
	
	ArrayList<String> clonelist= (ArrayList<String>)arr1.clone();//syntax of making clone
	System.out.println(clonelist);
	
	int i=arr2.lastIndexOf("javascript");
	
	System.out.println(i);
	
	ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	
	numbers.removeIf(num -> num%2 != 0);
	System.out.println(numbers);
	
	ArrayList<String> names=new ArrayList<String>(Arrays.asList("shree","ganesh","mahesh","dinesh","shree"));
	
//	names.retainAll(Collections.singleton("shree"));//this method does retain the agumented element in the object
//	System.out.println(names);
//	
	ArrayList<Integer> sublist= new ArrayList<Integer>(numbers.subList(2, 4));
	
	System.out.println(sublist);
	
	ArrayList<String> subListNames=new ArrayList<String>(names.subList(1, 3));
	
	System.out.println(subListNames);
	
	
	
}

}
