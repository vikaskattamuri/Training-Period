
public class StaticMethodUsage {
	
	static int a=20;
	static int b =40;
	
	public StaticMethodUsage()
	{
		System.out.println("Constructor called");
	}
	
	static void add()
	{
		int sum=a+b;
		System.out.println("Addition using Static method add() :" + sum);
		
	}
	public void sub() {
		
		System.out.println("Normal method called");
	}
	public static void main(String args[])
	{
		StaticMethodUsage s=new StaticMethodUsage();
		s.sub();
		StaticMethodUsage.add();
		
	}

}
