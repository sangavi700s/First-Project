package Test;

public class Swapping {

	public static void swap(int a,int b)
	{
		System.out.println("Swapping Without Variable");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of a is:"+b);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(30,40);

	}

}
