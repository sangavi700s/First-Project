package Test;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String strstr[][]=new String[3][2];
        strstr[0][0]="admin";
        strstr[0][1]="kavi";
        strstr[1][0]="java";
        strstr[1][1]="phyton";
        strstr[2][0]="selenium";
        strstr[2][1]="abstraction";
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(strstr[i][j]+"    ");
        
        	}
        	System.out.println();
        }
	}

}
