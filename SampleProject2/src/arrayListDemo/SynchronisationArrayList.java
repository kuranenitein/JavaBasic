package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisationArrayList {
	
	//how to synchronize arraylist in java
	//1.Collections.synchronizedList method returns the synchronized list
	//2. CopyOnWriteArrayList class Thread safe variant ArrayList

	public static void main(String[] args) {	
	
		
		List<String> syncNameList=Collections.synchronizedList(new ArrayList<String>());
		
		syncNameList.add("sudhir");
		syncNameList.add("mangu");
		
		// for add/remove we do not need explicit synchronization
		//to fetch / traverse we need explicit synchronization
		synchronized (syncNameList) {
			
			Iterator<String> it = syncNameList.iterator();
			
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
			
		}
		
		
		CopyOnWriteArrayList<String> empNames=new CopyOnWriteArrayList<String>();
		
		empNames.add("Sachin");
		empNames.add("Saurabh");
		empNames.add("Sita");
		
		//for any operations with CoyOnWriteArrayList class ArrayList we do need explicit synchronization
		
		Iterator<String> it1 = empNames.iterator();
		
		while(it1.hasNext()) {
			
			System.out.println(it1.next());
			
		}
		

	}

}
