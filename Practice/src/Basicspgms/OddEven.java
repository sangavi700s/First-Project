package Basicspgms;

public class OddEven {
	
	public static void oddeven()
	{
		System.out.println("************");
		System.out.println("Even Numbers");
		System.out.println("************");

		for(int i=0;i<=50;i++)
		{

			if(i%2==0)
			{
				System.out.println(i);
			}
		}	
		System.out.println("\n");
		System.out.println("************");
		System.out.println("Odd Numbers");
		System.out.println("************");


		for(int j=0;j<=50;j++)
		{
			if(j%2!=0)
			{
			System.out.println(j);

			}
			
		}						
		
	}
	
	public static void oddeven1()
	{
		for(int i=0;i<=50;i++)
		{
			for(int j=0;j<=50;j++)
			{
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			else 

			{
				if(j%2!=0)
				
				System.out.println(j);
					
			}
			
			}	
		  	
			
		}	

	}

	public static void main(String[] args) {
      oddeven();
      //oddeven1();
	}

}
