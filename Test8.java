import java.lang.*;
class Test8
{
public static void main(String args[])
{
int a[][]=new int[2][2];
a[0][1]=5;
a[1][1]=7;
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}