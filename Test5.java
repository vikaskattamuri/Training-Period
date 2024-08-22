import java.util.Scanner;
class Test5
{
public static void main(String args[]) throws Exception
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the hours,minutes,seconds");
int h =sc.nextInt();
int m =sc.nextInt();
int s =sc.nextInt();
System.out.println("CLOCK");
System.out.println("========");
System.out.println("hh:mm:ss");
System.out.println(h+":"+m+":"+s);
}
}