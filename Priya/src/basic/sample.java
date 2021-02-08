package basic;

public class sample {

	int a=100;
	static int b=200;
	int a1;
	public void med1()
	{
		int c=300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a1=c;
	}
	public void med2()
	{
		int a=10;
		int b=20;
		System.out.println(a);
	    System.out.println(b);
	    System.out.println(this.a);
	    System.out.println(sample.b);
	}
	public static void med3()
	{
		sample s1=new sample();
		System.out.println(s1.a);
		System.out.println(b);
	}
	public static void med4()
	{
		int a=30;
		int b=40;
		System.out.println(a);
		System.out.println(b);
		sample s2=new sample();
		System.out.println(s2.a);
		System.out.println(sample.b);
	}
	
	public static void main(String[] args)
	{
		sample s=new sample();
		s.med1();
		s.med2();
		med3();
		med4();
		System.out.println("------------------");
		System.out.println(s.a1);
	}
}
