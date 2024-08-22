import java.util.Scanner;

public class TernaryEX {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your age: ");
		int a =sc.nextInt();
		String b=a>=18?"-----Eligible for voting----- ":"-----Not Eligible for voting-----";
		System.out.println(b);
	}
	}
}
