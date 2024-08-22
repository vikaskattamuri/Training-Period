abstract class Abs
{
 abstract void show();
 void display()
{
 System.out.println("Abstract class ");
}
}
class Demo extends Abs
{
 void show()
{
 System.out.println("extended class");
}
}
class Test13
{
public static void main(String args[])
{
Demo d=new Demo();
d.display();
d.show();
}
}