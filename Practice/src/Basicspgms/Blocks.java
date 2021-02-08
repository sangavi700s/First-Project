package Basicspgms;


public class Blocks {
	
	//instance block and static block
	
	public Blocks()
	{
		System.out.println("This is constructor"
				+ "");
		
	}
	
	//instance block
	{
		System.out.println("This is instance block");
	}
	
	//static block
	static
	{
		System.out.println("This is static block");
	}

	public static void main(String[] args) 
	{
		Blocks b=new Blocks();
	}

}
