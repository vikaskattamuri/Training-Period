import java.util.*;
class ListDemo
{
public static void main(String args[])
{
Vector v=new Vector(3);
int n1=v.capacity();
System.out.println("capacity of water"+n1);
v.add(211);
v.add(25);
v.add(532);
v.add(5324);
int n2=v.capacity();
System.out.println(v);
System.out.println("New capacity of water"+n2);
}
}