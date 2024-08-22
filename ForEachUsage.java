import java.util.Scanner;

public class ForEachUsage {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		for (int i : array) {
			
			
			System.out.println(array[i]);
			
		}
	}

}
