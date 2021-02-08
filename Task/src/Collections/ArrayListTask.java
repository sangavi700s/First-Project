package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTask {

	public static void main(String[] args) {

		ArrayList<Character> ch=new ArrayList<Character>();
		
		ch.add('A');
		ch.add('b');
		ch.add('c');
		ch.add('d');
		ch.add('e');
		ch.add(null);
		
		System.out.println(ch);
		System.out.println(ch.size());
		System.out.println(ch.get(2));
		
		for(int i=0;i<ch.size()-1;i++)
		{
			System.out.println(ch.get(i));
		}
		
		for(Character cc:ch)
		{
			System.out.println(cc);
		}
		
		  Iterator<Character> it =  ch.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		
		  ListIterator<Character> ii = ch.listIterator();
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
