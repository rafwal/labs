package tij.ch5;

public class Task6 {
	Dog2 dog = new Dog2();
	
	public Task6(){
		dog.bark(12,321l);
	}
	
	//ZALEZY :D
	
}

class Dog2{
	void bark(int var, long var2){
		System.out.println("int");
	}
	
	void bark(long var, int var2){
		System.out.println("int2");
	}
	
}

