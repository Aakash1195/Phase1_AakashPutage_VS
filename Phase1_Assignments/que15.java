import java.io.File;
import java.io.IOException;

//15.You are given a project to demonstrate the uses of try-catch blocks in Java.

public class que15 {
	
	public static void main (String [] args){
		
		try {
			File file1 =new File("D://Java Files//AakashPhase1//pending.txt");
			
			if (file1.createNewFile()){
				System.out.println("File Successfully Created");
			}else {if (file1.exists()){
				System.out.println("File Already Exists");
			}
			else {
				System.out.println("File Dosenot Exists");
			}
			}
		    }
			catch (IOException e){
		          e.getStackTrace();
				
			}
		}		
	
		
	}


