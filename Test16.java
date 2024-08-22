/*multiple inheritence using interface. We used static class and directly cfrested an object to call it in the main function.there is no use of extending or implementing again
because of the public keyword we can have the acces to the other main method to have the use of the method*/
interface I1
{
void show();
}
class Demo implements I1
{
public void show()
{
System.out.println("Show method called");
}
}
class Test16
{
public static void main(String args[])
{
Demo d=new Demo();
d.show();
}
}