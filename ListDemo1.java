import java.util.*;
class ListDemo1
{
public static void main(String args[])
{
Stack s = new Stack();
s.push(22);
s.push(25);
s.push(24);
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
}
}