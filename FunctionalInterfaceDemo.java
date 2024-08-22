@FunctionalInterface
interface Inter1{
void show(String msg);
//void disp();
}
public class FunctionalInterfaceDemo implements Inter1{
public void show(String msg){
System.out.println(msg);
}
public static void main(String args[]){
FunctionalInterfaceDemo fd= new FunctionalInterfaceDemo();
fd.show("HEllo hi hola");
}
}