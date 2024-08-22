import java.util.Scanner;
class Vc
{
public static void main(String args[])
{
System.out.println("enter the letter");
Scanner sc=new Scanner(System.in);
char ab=sc.nextChar();
if(ab=="a","e","i","o","u")
{
System.out.println("the letter is vowel");
}
else
{
System.out.println("the letter is consonant");
}
}
}