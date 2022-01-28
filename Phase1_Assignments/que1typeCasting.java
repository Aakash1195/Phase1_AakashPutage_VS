
public class que1typeCasting {

	public static void main(String[] args) 
    { 
		String sd="138.0988";
        double d=Double.parseDouble(sd);
        System.out.println("String to Double: "+d);
        
        String sf="43.3";
        float f=Float.parseFloat(sf);
        System.out.println("String to Float: "+f);
        
        
        String sl="1382324";
        long l=Long.parseLong(sl);
        System.out.println("String to Long: "+l);
        
        
        String si="13";
        int n = Integer.parseInt(si);
        System.out.println("String to int: "+n);
       
        
        
        String ts="Aakash";
        
        String ts1="FALSE";
        
        Boolean b1=Boolean.valueOf(ts);
        Boolean b2=Boolean.valueOf(ts1);
        
        System.out.println("String to Boolean: "+b1);
        System.out.println("String to Boolean: "+b2);
        String by="101";
        byte b=Byte.parseByte(by);
        System.out.println("String to Byte: "+b);
        char ch = ts.charAt(4);
        System.out.println("Character: "+ch);
        
        
    } 
}
