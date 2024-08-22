import java.util.*;
class Demo3
{
public static void  main(String args[])
{
int a[]={23,244,215,127};
System.out.println("Accepted elements in an array");
for(int i:a)
{
System.out.println(i);
}
Arrays.parallelSort(a);
System.out.println("Sorted elements of an array");
for(int i:a)
{
System.out.println(i);
}
}
}