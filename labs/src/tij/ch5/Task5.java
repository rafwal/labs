package tij.ch5;

public class Task5 {
	Dog dog = new Dog();
	public Task5(){
		dog.bark(.3d);
		dog.bark(32.2f);
		dog.bark("DSDS");
	}
	
}

class Dog{
	void bark(int var){
		System.out.println("int");
	}
	
	void bark(double var){
		System.out.println("double");
	}
	void bark(float var){
		System.out.println("float");
	}
	void bark(long var){
		System.out.println("long");
	}
	void bark(String var){
		System.out.println("String");
	}
}