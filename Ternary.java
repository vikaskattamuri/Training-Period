import java.util.Scanner;
class Ternary
{
public static void main(String args[])
{
System.out.println("enter the age");
Scanner sc= new Scanner(System.in);
int age=sc.nextInt();
String eligable= (age>=18)?"eligible to vote":"not eligible to vote";
System.out.println(eligable);
}
}