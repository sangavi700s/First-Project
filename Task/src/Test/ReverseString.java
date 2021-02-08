package Test;

public class ReverseString {

	public static void main(String[] args) {

		String str="SELENIUM";
		//char[] ch=new char[str.length()];
		//char[] ch=str.toCharArray();

		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
	}

}
