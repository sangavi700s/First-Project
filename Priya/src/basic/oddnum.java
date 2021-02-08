package basic;

public class oddnum 
{
	public static void main(String[] args)
	{
		for(int i=50;i>=1;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}	
		
		System.out.println("--------------------");
		
		for(int i=50;i>=1;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}	
	}

}
