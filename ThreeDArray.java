
public class ThreeDArray {
	
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		a[0][0]=1;
		a[0][1]=1;
		a[1][0]=1;
		a[1][1]=1;
		a[0][2]=1;
		a[2][0]=1;
		a[2][2]=1;
		a[1][2]=1;
		a[2][1]=1;
		
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			
			{
				
					System.out.print(a[i][j]+"\t");
					
			}
			System.out.println("");
		}
		
		
	}

}
