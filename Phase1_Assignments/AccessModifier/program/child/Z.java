package AccessModifier.program.child;

import AccessModifier.programs.P;

public class Z extends P
{
	 
	public static void main(String [] args)
	{
		
		Z pk = new Z();
		pk.methodProtected(); // from M class
		pk.publicMethod();    // from M class
		pk.deft("AAkkash");   // from p class
		pk.publicMethod1();   // from N class
		
		}

	
	
	}
	

