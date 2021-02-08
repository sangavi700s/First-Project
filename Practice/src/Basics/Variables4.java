package Basics;

public class Variables4 {

	//Global variable
	
		int a=30,b=40,c;
		
		public void add()
		{
	    //local variable
		int	a=5,b=10,z;
		c=a+b;
		System.out.println("the value of c is:"+c);
		z=this.a+b;
		System.out.println("the value of c is:"+z);

		
		
		}

		public  void sub()
		{
		c=a-b;
		System.out.println("the value of c is:"+c);
		}

		public static void mul()
		{
			int a=5,b=2,z;
			z=a*b;
			System.out.println("the value of c is:"+z);
			Variables4 v1=new Variables4();
			z=a*v1.a;
			System.out.println("the value of c is:"+z);

			

			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Variables4 v1=new Variables4();
			v1.add();
			v1.sub();
			mul();
					
			

		}

	}
