package Inheritance;



public class Child extends Single 
{
	public void m1()
	{
		System.out.println(" selenium");
	}
	
	public void m5()
	{
		System.out.println(" method5");
	}
    
	
	public void m2()
	{
		System.out.println(" java");
	}

	
	public static void m3()
	{
		System.out.println(" method6");
		
	}
	
	public void Test()
	{
	
		//super.m1(); 
		//this.m1();
		super.m2();
	}
	
	public static void Test1()
	{
		Child h =new Child();
		h.m3();
	}

	public static void main(String[] args) 
	{
		Child  c=new Child();
		//c.Test();
         //c.m5();
         //c.m2();
		//c.m6();
		//c.m3();
		//m4();
		 //m3();
		c.Test1();
	}

}
