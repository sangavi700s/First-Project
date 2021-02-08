package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTask {

	public static void main(String[] args) {

		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("Java");
		ls.add("Phyton");
		ls.add("Php");
		ls.add("Agile");
		ls.add(null);
		
		System.out.println(ls);
		
		
		for(int i=0;i<ls.size();i++)

		{
			System.out.println(ls.get(i));
		}
		
		for(String ss:ls )
		{
			System.out.println(ss);

		}
		Iterator<String> it =  ls.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		
		  ListIterator<String> ii = ls.listIterator();
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
