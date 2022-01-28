package AccessModifier.programs;

 class N extends M
{
    int aa = 10;
	float dd = 87.098f;
	double bb=11.8989899;
	
	 void privateMethod1()
	{
		System.out.println("in a Private method of class n");
	}
	void defaultMethod1()
	{
		System.out.println("in a Default method of class n");
	}
	protected void protectedMethod1()
	{
		System.out.println("in a Protected method of class n");
	}
	public void publicMethod1()
	{
		System.out.println("in a Public method of class n");	
	}
	
}
