
public class que4 {
    public static void main(String args[])
   {

	    System.out.println("----Method executions-------");
	    que4 b=new que4();
	    
	    
	    int ans= b.multipynumbers(10,3);
	    System.out.println("Multipilcation is :"+ans);
	    
	    
	    System.out.println("\n-----Method calling by value----");
	    
    	callMethod d = new callMethod();
 	    System.out.println("Before operation value of data is "+d.val);
 	    d.operation(100);
 	    System.out.println("After operation value of data is "+d.val);
 	    
 	    
    	
	    System.out.println("\n-----Method Overloading----");
        
	    
	    methodoverloading ob=new methodoverloading();
        ob.area(10,12);
        ob.area(5);  
   }
	
	int multipynumbers(int a,int b) {
	    int Result=a*b;
	    return Result;
	}
}
	
 
	class callMethod {

	int val=220;

	int operation(int val) {
	    val =val*10/100;
	    return(val);
	}
}


 class methodoverloading {
	    
      void area(int b,int h)
	  {
	       System.out.println("Area of Triangle : "+(0.5*b*h));
	   }
      
	   void area(int r) 
	    {
	         System.out.println("Area of Circle : "+(3.14*r*r));
	    }
	 

 
	   
}

