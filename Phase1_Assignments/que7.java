import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class que7 {

	public static void main(String[] args) {
        
        HashMap<Integer,String> hm=new HashMap<Integer,String>();      
         hm.put(1,"Naren");    
         hm.put(2,"Adidas");    
         hm.put(3,"Bhuvanbum");   
          
         System.out.println("\nThe elements of Hashmap are ");  
         for(@SuppressWarnings("rawtypes") Map.Entry m:hm.entrySet()){    
          System.out.println(m.getKey()+" "+m.getValue());    
         }
             
         Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
         ht.put(4,"R15");  
         ht.put(5,"Bulet");  
         ht.put(6,"Splender");  
         ht.put(7,"Fzee");  

         System.out.println("\nThe elements of HashTable are ");  
         for(@SuppressWarnings("rawtypes") Map.Entry n:ht.entrySet()){    
          System.out.println(n.getKey()+" "+n.getValue());    
         }
         
         TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
         map.put(8,"Yamaha");    
         map.put(9,"Honda");    
         map.put(10,"RoyalEnifield");       
         
         System.out.println("\nThe elements of TreeMap are ");  
         for(@SuppressWarnings("rawtypes") Map.Entry l:map.entrySet()){    
          System.out.println(l.getKey()+" "+l.getValue());    
         }    
         
      }  
}

