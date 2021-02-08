package MultiLevel;


public class Child extends Parent{

	public void m1()
	{
		System.out.println("Method");
	}
	
	public void m2()
	{
		this.m1();	
		System.out.println("Method1");
		super.m1();
		//super.m2();
		//super.m3();
		//super.m4();

	}
	public static void m5()
	{
		System.out.println("Method2");

	}
	public static void test()
	{
		//Child c=new Child();
		Parent p=new Parent();
		p.m2();
		Parent.m3();
		Parent.m4();
		//c.m2();
		m5();				
		
	}



	public static void main(String[] args) {
      Child s= new Child();
      s.m2();
      test();
	}


}
