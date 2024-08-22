
public class Overriding {
	
	public void works()

	{
		System.out.println("I work");
		
	}
	int performance()
	
	{
		return 100;

	}
	

}

class Overriding2 extends Overriding
{
	public static void main(String[] args)
	{
		
		Overriding2 o=new Overriding2();
		o.works();
		o.performance();
		
		}
	public void works()
	{
		System.out.println("Work I do");
	}	
	int performance()

	{
		return 0;
		
		
	}
}
