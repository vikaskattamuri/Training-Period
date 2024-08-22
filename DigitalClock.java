import java.util.Scanner;

public class DigitalClock {
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hours,minutes,seconds: ");
		int h,m,s;
		h=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		for (h=h;h<24;h++)
		{
			for(m=m;m<60;m++)
			{
				for (s=s;s<60;s++)
				{
					System.out.println(h+" : "+m+" : " + s+"\r");
					Thread.sleep(1000);
				}h=0;
			}m=0;
		}s=0;
		
	}

}
