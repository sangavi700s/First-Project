package HomeTask;

public class ReverseString {
	
	public static void reverse(String name)
	{
		char[] n=name.toCharArray();
		for(int i=n.length-1;i>=0;i--)
		{
			System.out.println(n[i]);
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("Programming");

	}

}
