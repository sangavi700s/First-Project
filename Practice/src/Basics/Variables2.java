package Basics;

public class Variables2 {	/* Global Variable (Instance and Static variable declared)*/
	
	int a=30;
	static int b=50;
	int c;
	
	/* @ instance Method*/
	public void add()
	{
		c=a+b;
		System.out.println("The value of add is :"+c);
	}
	public  void sub()
	{
		c=b-a;
		System.out.println("The value of sub is :"+c);

	}
	/*2 Static Method*/
	public static void mul()
	{
		
		Variables2 v2=new Variables2();
		v2.c=v2.a*b;
		System.out.println("The value of mul is :"+v2.c);

	}
	
	public static void div()
	{
		/* local variable*/
	 int a=10,b=20;
	 Variables2 v3=new Variables2();
	 v3.c=b/a;
	 System.out.println("The value of div is :"+v3.c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables2 v1=new Variables2();
		v1.add();
		v1.sub();
		mul();
		div();
		

	}

}
