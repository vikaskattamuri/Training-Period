//extending makes us to use the id of the previous interface
interface I1
{
int id=23;
}
interface I2 extends I1
{
}
class Test15 implements I1
{
public static void main(String args[])
{
System.out.println("id value is :"+id);
}
}