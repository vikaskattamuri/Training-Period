import java.lang.*;
class Array3
{
public static void main(String args[])
{
int a[][]=new int[3][3];
a[0][0]=12;
a[1][1]=123;
a[2][2]=1234;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}