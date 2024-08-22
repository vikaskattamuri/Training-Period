import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String args[]) {
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		for (int j=num;j>1;j--)
		{
		for(i=1;i<=10;i++)
		{
			System.out.println(num +" * "+ i+" = "+ (num*i)  );
		}
		num--;
		System.out.println("");
		}
	}

}
