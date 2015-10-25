package tij.ch4;

public class Task9 {
	public Task9(int lim){
		int fib0 = 0;
		int fib1 = 1;
		System.out.println("0: " + fib0);
		System.out.println("1: " + fib1);
		
		for (int i=2; i<=lim; i++){
			int newFib = fib0 + fib1;
			fib0 = fib1;
			fib1 = newFib;
			System.out.println(i + ": " + newFib);
		}
	}
}
