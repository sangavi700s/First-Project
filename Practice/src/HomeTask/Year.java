package HomeTask;

public class Year {
	
	 static int n=2020;
	 static int s=1989;
	
	public static void date()
	{
		
		System.out.println("Decending order");
		for( int i=1989;i<=n;i++) {
			System.out.println(i);
			
		}
		System.out.println("Ascending order");

		for( int i=2020;i>=s;i--) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date();

	}

}
