
public class que12 extends Thread{
	public void run(){		
	try {
		System.out.println("Thread :"+Thread.currentThread().getId() +" is Running");
	}
		
	
	catch (Exception e){
		System.out.println("Exception Caught here ");
	}
 }

	
	public static void main (String [] args){
		int n =13;
		for (int i=0; i < n;i++)
		{
			
			que12 object = new que12() ;
			object.start();
			
		}
	}
}
