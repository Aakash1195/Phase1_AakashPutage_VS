package AccessModifier.programs;

public class M
{
	public int a = 12;
	long l= 1263542L;
	protected float f= 50.00F;
	
	
	public void publicMethod()
	{
		methodPrivate();
	}
	void defaultMethod()
	{
		methodPrivate();
	}
	protected void methodProtected()
	{
		methodPrivate();
	}
	private void methodPrivate()
	{     
		System.out.println("Class M: methodProtected");	
		System.out.println("Value of private value a"+ a);
		System.out.println("Value of long"+ l);
		System.out.println();
		
    }
}
