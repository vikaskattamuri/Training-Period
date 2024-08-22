
public abstract class AbstractMethodUsage {
	
	int add(int a,int b) {
		System.out.println("Concrete method called");
		return a+b;
		
	}
	abstract void subtract();

}
class B extends AbstractMethodUsage{

	@Override
	void subtract() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method called");
		
	}
	public static void main(String[] args) {
		
		B b=new B()	;
		b.add(20, 20);
		b.subtract();
	
	}
	
}


