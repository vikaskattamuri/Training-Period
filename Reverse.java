import java.util.Scanner;

public class Reverse {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		
		int remainder;
		int reverse=0;
		while(number!=0) {
			
		remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		}
		System.out.println("Reverse of "+number+"is "+reverse);
		 
		
	}

}
