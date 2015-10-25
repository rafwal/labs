package tij.ch4;

import java.util.Random;

public class Task3 {
	Random gen;
	
	public Task3(){
		gen = new Random();
		
		int first = gen.nextInt();
		int second = 0;
		
		while (true){
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
