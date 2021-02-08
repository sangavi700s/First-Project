package Test;

public class Factorial {
	
	public void fact(int n)
	{
	System.out.println("Factorial");
	int fact=1;
//	int n=3;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
		System.out.println("The Factorial value is:"+fact);

	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fac=new Factorial();
		fac.fact(4);

	}

}
