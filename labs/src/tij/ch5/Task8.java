package tij.ch5;

public class Task8 {
	public Task8(){
		met1();
	}
	
	void met1(){
		met2();
		this.met2();
	}
	
	void met2(){
		System.out.println("DS");
	}
}
