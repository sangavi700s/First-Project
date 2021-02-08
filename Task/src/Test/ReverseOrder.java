package Test;

public class ReverseOrder {

	public static void main(String[] args) {


//		String str[]=new String[5];
//		
//		str[0]="Java";
//		str[1]="Phyton";
//		str[2]="Selenium";
//		str[3]="Abstraction";
//		str[4]="Maven";
//		for(int i=4;i<=str.length;i--)
//		{
//			System.out.println(str[i]);
//		}
		
	/*	String str= "Java";
		String s="Phyton";
		String st="C++";
		
		StringBuffer sb=new StringBuffer();
		System.out.println(st.charAt(0));*/
		
		String str[]= {"Java","Phyton","Selenium","Array"};
		
		//for(int i=0;i<=str.length;i++);
		for(int i=str.length;i>=0;i--)
		{
			System.out.println(str[i]);
			
		}
		
	}

}
