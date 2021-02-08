package basic;

public class sample2 
{
	int a=40;
	static int b=40;
	
	public void add(int a,int b)
	{
		int c=a+b;
	    System.out.println(c);
		int d= this.a+sample2.b;
		System.out.println(d);
	}
	public void sub(float a,float b)
	{
		float c=a-b;
	    System.out.println(c);
		float d= this.a-sample2.b;
		System.out.println(d);
	}
	public static void mul(double a,int b)
	{
		double c=a*b;
	    System.out.println(c);
	    sample2 s1=new sample2();
		double d= s1.a*sample2.b;
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		sample2 s=new sample2();
		s.add(20,30);
		s.sub(51.2f,21.3f);
		s.mul(23.0, 15);
	}
	
}	
		
		
