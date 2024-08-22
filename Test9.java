//Method overloading
class Test11
{
void shape(int i)
{
System.out.println("Triangle"+i);
}
void shape(float j)
{
System.out.println("Rectangle"+j);
}
void shape(long k)
{
System.out.println("circle"+k);
}
}
class Test9
{
public static void main(String args[])
{
Test11 sc= new Test11();
sc.shape(8);
sc.shape(12.3f);
}
}