package Test;

public class ConstructorTask {
	
	//static
	{
		System.out.println("Default Constructor");
		//ConstructorTask d=new ConstructorTask();
	}
	
	public ConstructorTask()
	{
		System.out.println("This  is a Constructor");
		
		//new ConstructorTask(10,20);
	}
	public ConstructorTask(int a,int b)
	{
	//new ConstructorTask(10,60);	
		//a=10;
		//b=4;
	    int	c=a+b;
	    System.out.println("**********  ");
	    System.out.println("The value of Constructor is: "+c); 
	    System.out.println("**********  ");

	  
		
	}

	
	public void m1(int a,int b)
	{
		
      this.m1(10, 30.6f);
	  int c;
	  c=a+b;
	  System.out.println("The value of Instance Addition  is: "+c); 
	 

	}
	public void m1(int a,float b)
	{
	 
	    float  c=a*b;
	    System.out.println("The value of Instance Multiplication  is: "+c); 

	}
	public static void m1(int a,double b)
	{
	 
	    double  c=a-b;
	    System.out.println("The value of Static Subtraction   is: "+c); 

	}

	public static void m1(int a,long b)
	{
	 
	    long  c=a/b;
	    System.out.println("The value of static Division  is: "+c); 

	}


	public static void main(String[] args) {
		
		ConstructorTask  s=new ConstructorTask(10,30);
		//ConstructorTask  f=new ConstructorTask(10,5);
		//new ConstructorTask(10,4);
		s.m1(20,30);
		//s.m1(20, 7);
		m1(40,60.0);
		m1(90,80l);
		


	}

}
