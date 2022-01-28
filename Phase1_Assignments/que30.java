import java.util.LinkedList;
import java.util.Queue;

public class que30 {

	public static void main(String[] args) 
	
	{
		
	                Queue<String> locationsQueue = new LinkedList<>();
	                
	                locationsQueue.add("SHOLAPUR");
	                
	                locationsQueue.add("PUNE");
	                
	                locationsQueue.add("GOA");
	                
	                locationsQueue.add("BARODA");
	                
	                
	                locationsQueue.add("DAHISAR");
	                
	System.out.println("Queue is : " + locationsQueue);
	
	
	                System.out.println("Head of Queue : " + locationsQueue.peek());
	                locationsQueue.remove();
	                
	                
	                System.out.println("After removing Head of Queue : " + locationsQueue);
	                
	                System.out.println("Size of Queue : " + locationsQueue.size());
	        
	}
}
