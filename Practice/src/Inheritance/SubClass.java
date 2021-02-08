package Inheritance;

public class SubClass extends Child1 {
	
	public void m1()
	{
		System.out.println("Hello");
	}
	
	public void sample()
	{
		this.m1();
		super.m1();
		super.m2();
	}
	public static void testing()
	{
		SubClass s= new SubClass();
		s.sample();
		//SubClass.test();
		SubClass.m5();
		//Child1.test();
	 
		
	}

	public static void main(String[] args) {
       
		testing();
		//Parent p= new Parent();
		//p.m1();
		//p.m2();
		Parent.m3();
		Parent.m4();
	}

}
