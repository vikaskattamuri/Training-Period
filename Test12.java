//m,ethod overriding
class Test10
{
void show()
{
System.out.println("parent class is called");
}
}
class Test11 extends Test10
{
void show()
{
super.show(); //for super class method to be called
System.out.println("child class method is called");
}
}
class Test12
{
public static void main(String args[])
{
Test11 t=new Test11();
t.show();
}
}