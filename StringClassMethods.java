
public class StringClassMethods {
	
	public static void main(String args[])
	{
		String name="Varun ";
		
		String upper=name.toUpperCase();
		System.out.println("Uppercase method: "+upper);
		
		String lower=name.toLowerCase();
		System.out.println("Lowercase method: "+lower);
		
		System.out.println("Character at index 2(VARUN)"+upper.charAt(2));
		
		String name2="P S";
		System.out.println("Concat: "+name.concat(name2));
		
		
		
	}

}
