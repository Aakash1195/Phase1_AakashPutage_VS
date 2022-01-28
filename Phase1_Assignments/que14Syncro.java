
public class que14Syncro extends que14 {

	public static void main (String [] arg){
		que14 obj =new que14();
		
		Thrd1 t1= new Thrd1(obj);
		Thrd2 t2= new Thrd2(obj);
		t1.start();
		t2.start();
	}
}
