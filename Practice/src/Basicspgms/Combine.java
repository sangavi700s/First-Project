package Basicspgms;


public class Combine 
{
	
	int empid;
	
	String empname;
	
	static String compname="TCS";
	
	                            
	public Combine(int empid, String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	
	public void getDetails()
	{
		System.out.println("Emp id = "+ empid);
		
		System.out.println("Emp name ="+ empname);
		
		System.out.println("Emp company name ="+ compname);
	}
	
	
	public static void main(String[] args)
	{
		Combine e1=new Combine(1,"jack");
		
		e1.getDetails();
		
		Combine e2=new Combine(2,"ravi");
		
		e2.getDetails();
		
		Combine e3=new Combine(3,"kumar");
		
		e3.getDetails();
	}

}
