package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListC {

	public static void main(String[] args) {
		
     LinkedList ll =new LinkedList();
		
		ll.add(10);
		ll.add(null);
		ll.add(5.5f);
		ll.add("Java");
		ll.add(200.0);
		ll.add(10);
		ll.add('G');
		ll.add(true);
		ll.add(10);
		ll.add(null);
		ll.add("selenium");
		System.out.println(ll); 
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i)); //for loop
		}
	
		for(Object aa :ll )
		{
			System.out.println(aa);          //for each
		}
		  Iterator<Object> it =  ll.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		
		ListIterator<Object> ii = ll.listIterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
		System.out.println("---------------------");
		while(ii.hasPrevious())
		{
			System.out.println(ii.previous());
		}
		
		
		
	}

}
