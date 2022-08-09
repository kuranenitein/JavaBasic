package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
	
	//how to remove duplicates from an array list
	//1. LinkedHashSet   (you can apply on string /integer/or any kind of data

	public static void main(String[] args) {
		
		//1. LinkedHashSet   (you can apply on string /integer/or any kind of data
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,4,2,5,4,1,6,2,8,4,3,7,8,7,9,5));
		
		LinkedHashSet <Integer> linkedHashSetList=new LinkedHashSet<Integer>(arr);
		
		ArrayList<Integer> newListWithotDuplicates=new ArrayList<Integer>(linkedHashSetList);
		
		System.out.println(newListWithotDuplicates);
		
		//2. JDK 8 and above  we can use stream method to remove duplicates
		
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1,4,2,5,4,1,6,2,8,4,3,7,8,7,9,5));
		
		List<Integer> uniqueMarks=marks.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueMarks);

		
		

	}

}
