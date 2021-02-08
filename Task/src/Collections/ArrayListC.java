package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(null);
		al.add(20);
		al.add(70);
		al.add(null);
		al.add(60);
		al.add(10);
		al.add(null);
		
		//Collections.sort(al);
		//System.out.println(al);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(1));
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i)); //for loop
		}
		
		for(Integer aa :al )
		{
			System.out.println(aa);          //for each
		}
		
		  Iterator<Integer> it =  al.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		
		ListIterator<Integer> ii = al.listIterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
		System.out.println("---------------------");
		while(ii.hasPrevious())
		{
			System.out.println(ii.previous());
		}
		
		/*LinkedList ll =new LinkedList();
		
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
		System.out.println(ll); */
		
		/*Vector<String> vc=new Vector<String>();
		
		vc.add("Java");
		vc.add("selenium");
		vc.add("Java");
		vc.add("maven");
		vc.add("Java");
		vc.add(null);
		vc.add("python");
		vc.add(null);
		vc.add("Qc");
		
		System.out.println(vc);
		
		Enumeration<String> ee = vc.elements();
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}*/
		
	}

}
