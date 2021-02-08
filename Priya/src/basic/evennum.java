package basic;

public class evennum {

	public static void main(String[] args)
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("--------------------");
		
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
	
}
