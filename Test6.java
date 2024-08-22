import java.lang.*;
import java.util.Scanner;
class Test6
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
for(h=h;h<24;h++)
{
for(m=m;m<60;m++)
{
for(s=s;s<60;s++)
{
//System.out.println(h+":"+m+":"+s+"\r");
System.out.printf("%2d:%2d:%2d\r",h,m,s);
Thread.sleep(1000);
}s=0;
}m=0;
}h=0;
System.out.println(h+":"+m+":"+s);
}
}