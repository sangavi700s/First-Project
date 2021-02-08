package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorC {

	public static void main(String[] args) {

    Vector<String> vc=new Vector<String>();
		
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
		
		for(int i=0;i<=vc.size()-1;i++)
		{
			System.out.println(vc.get(i)); //for loop
		}
	
		for(String aa :vc )
		{
			System.out.println(aa);          //for each
		}
		  Iterator<String> it =  vc.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		
		ListIterator<String> ii = vc.listIterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
		System.out.println("---------------------");
		while(ii.hasPrevious())
		{
			System.out.println(ii.previous());
		}
		
		

		
		Enumeration<String> ee = vc.elements();
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
	}

}
