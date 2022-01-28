
//14.You are given a project to demonstrate the multithreading with and without synchronization.

class  que14 {
	int c;
	synchronized void Incrent(int c)
	{
		for (c=1;c<=1000; c++){
			System.out.println(" Thread"+c);
		}
		try{
			Thread.sleep(1000);
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}
	public void printtable(int i) {
		// TODO Auto-generated method stub
		
	}
}
class Thrd1 extends Thread{
	que14 t;
	Thrd1(que14 t){
		this.t=t;
	}
	public void run(){
		t.printtable(5);
	}
}
class Thrd2 extends Thread{
	que14 t;
	Thrd2(que14 t){
		this.t=t;
	}
	public void run(){
		t.printtable(100);
}
}

