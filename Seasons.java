import java.util.Scanner;
class Seasons
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
switch(num){
case 6:case 7:case 8:case 9:
{
System.out.println("RAiny");
break;
}
case 10:case 11:case 12:case 1:
{
System.out.println("Winter");
break;
}
case 2:case 3:case 4:case 5:
{
System.out.println("Summer");
break;
}
default:
System.out.println("no season");
}
}
}