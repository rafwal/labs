package tij.ch5;

public class Task12 {
	public Task12(){
		new Tank().empty();
		new Tank();
		new Tank().empty();
		new Tank().fill();
		System.gc();
	}
}

class Tank{
	boolean isEmpty = false;
	void empty(){
		isEmpty = true;
	}
	
	void fill(){
		isEmpty = false;
	}
	
	protected void finalize(){
		if (!isEmpty){
			System.out.println("Error");
		}
	}
}