import java.awt.*;
class Demo1
{
public static void main(String args[])
{
Frame f=new Frame("Notepad");
f.setVisible(true);
TextArea t= new TextArea();
f.setSize(500,500);
MenuBar m= new MenuBar();
f.setMenuBar(m);
f.add(t);
//creating menus
Menu m1=new Menu("file");
Menu m2=new Menu("edit");
Menu m3=new Menu("view");
Menu m4=new Menu("search");
Menu m5=new Menu("help");

//adding menuitems to filemenu
m1.add(m1);
m1.addSeperator();
m1.add(m2);
m1.add(m3);
m1.addSeperator();
m1.add(m4);
m1.add(m5);
}
}