
public class OverloadingEx {
	
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum of 2 nos. : "+sum);
	}
	
	int add(int a)
	{
		return a+77;
	}
	
	public void add (int a,int b,int c)
	{
		System.out.println("Sum of 3 nos.: "+(a+b+c));
	}
	
	public static void main(String[] args) {
		OverloadingEx e=new OverloadingEx();
		e.add(10);
		e.add(10,20);
		e.add(10,20, 30);
	}

}
