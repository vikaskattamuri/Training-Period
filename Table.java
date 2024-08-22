import java.util.Scanner;
class Table
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int j=n;j>=1;j--)
{
for(int i=1;i<=12;i++)
{
System.out.println(j+"*"+i+"="+j*i);
}
}
}
}
