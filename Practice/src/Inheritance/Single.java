package Inheritance;



public class Single 
{
	
	
	public void m1()
	{
		System.out.println("method1");
		this.m2();	
		}
	
	public void m2()
	{
		System.out.println(" method2");
		m3();
	}
	
	public static void m3()
	{
		System.out.println(" method3");
	}
	
	public static void m4()
	{
		System.out.println(" method4");
		m3();
	}

	public static void main(String[] args) 
	{
		

	}

}
