package tij.ch5;

public class Task10 {
	public Task10(){
		new fin1();
		System.gc();
	}
}


class fin1{
	
	protected void finalize(){
		System.out.println("GERE");
	}
}