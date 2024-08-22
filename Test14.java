//ambiguos error because of same variable for the ids from different interfaces
interface I1
{
int id=23;
}
interface I2
{
int id=35;
}
class Test14 implements I1,I2
{
public static void main(String args[])
{
System.out.println("id value is :"+id); // if we use interface name.variable name then we can access the individual interface values
}
}