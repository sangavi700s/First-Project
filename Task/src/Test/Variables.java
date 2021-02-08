package Test;

public class Variables {
	//Global Variable
	int a=1000;
	int b=2000;
	static int c=3000;
	static int d=4000;
	
	public void m1()
	{
		int a=100;
		float b=20.8f;
		float c;
		c=a+b;
		System.out.println("Local Variable Function");
		System.out.println(" ");

		System.out.println("the value of division c is:"+c);
		System.out.println(" ");

		System.out.println("Global Variable Value ");
		System.out.println(" ");


		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Variables.c);
		System.out.println(Variables.d);

		System.out.println("Global Variable Function");
		System.out.println(" ");

		int e=this.a+this.b;
		System.out.println("the value of addition e is:"+e);
		int f=Variables.c+Variables.d;
		System.out.println("the value of addition f is:"+f);


		
	}
	
	public void m2()
	{
		int a=5;
		float b=1000.5f;
		double c=20.0;
		double d;
		d=a+b+c;
		System.out.println("the value of addition d is:"+d);
	}

	public static void m3()
	{
		float a=10.5f;
		double b=200;
		double c;
		c=a*b;
		System.out.println("the value of Multiplication c is:"+c);
		System.out.println(Variables.c);
		System.out.println(Variables.d);
		Variables v=new Variables();
		System.out.println(v.a);
		System.out.println(v.b);

			

		
	
	}

	public static void m4()
	{
			System.out.println("Automation Testing");
	}


	public static void main(String[] args) {
		Variables v= new Variables();
		v.m1();
		v.m2();
		m3();
		m4();

	}

}
