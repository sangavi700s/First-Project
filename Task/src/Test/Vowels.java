package Test;

public class Vowels {
	
	public static void alphabets(String name)
	{
		
		char[] n=name.toCharArray();
		for(int i=n.length-1;i>=0;i--)
//		for(int i=0; i>=n.length;i++)

		{
			if(n[i]=='a'||n[i]=='e'||n[i]=='i'||n[i]=='o'||n[i]=='u')
			{
				System.out.println(n[i]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     alphabets("Iam a automation Tester");
	}

}
