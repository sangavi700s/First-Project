package Test;

public class SwappingVariable {
	
	static int a=10,b=20;
	
	public static void  swap()
	{
		int t;
		t=a;
		a=b;
		b=t;
		
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);

		
	}

	public static void main(String[] args) {
    swap();
	}

}
