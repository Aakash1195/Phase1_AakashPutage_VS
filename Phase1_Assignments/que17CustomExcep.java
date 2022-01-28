import javax.imageio.IIOException;

//You are given a project to demonstrate a program implementing the concept of exception handling available in Java and the custom exception handlers.

class que17CustomExcep extends Exception {
	
	public que17CustomExcep(String s){
		
		super(s);
			
	}


public static class TestExcep1{
	
	static void validate (int age) throws IIOException {
		if (age<18)
		{
			throw new IIOException ("Age is not valid"); 
		}
		else
		{
			System.out.println("welcome to vote");   
		}
	}
	public static void main (String [] args){
		try
		{
			validate(90);
		}
		catch (Exception e)
		{
			System.out.println("Exception occured : Age is not Valid");  
		}
		finally{
			System.out.println("Rest Of the code");  
		}
	}
}
}
