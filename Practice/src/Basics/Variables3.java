package Basics;

public class Variables3 {int a=50,b=100,c;
public void add()
{
	int a=10,b=40;
	c=this.a+b;
	System.out.println("The value of c is:"+c);
	c=a+b;
	System.out.println("The value of c is:"+c);

}

public static void sub()
{
	int a=40,b=50,z;
	Variables3 m3=new Variables3();
	z=a+m3.b;
	System.out.println("The value of z is:"+z);

}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Variables3 m1=new Variables3();
	m1.add();
	sub();

}

}
