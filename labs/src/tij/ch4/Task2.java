package tij.ch4;

import java.util.Random;

public class Task2 {
	Random gen;
	
	public Task2(){
		gen = new Random();
		
		int first = gen.nextInt();
		int second = 0;
		
		for (int i=0; i< 24; i++){
			second = gen.nextInt();
			
			System.out.println("Generated numbers: " + first + "; " + second);
			System.out.print("Greater: ");
			
			if(first > second)
				System.out.println(first);
			else
				System.out.println(second);
			
			first = second;
		}
	}
}
