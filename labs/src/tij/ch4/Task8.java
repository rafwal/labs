package tij.ch4;

import java.util.Random;

public class Task8 {
	Random gen = new Random();
	
	public Task8(){
		int randomNumber = 0;
		outer:
		while(true){
			randomNumber = gen.nextInt(10);
			
			switch(randomNumber){
			case 0:
				System.out.println("EXIT");
				break outer;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
				System.out.println("Odd number");
				break;
			default:
				System.out.println("Even number");
				break;
			}
		}
	}
}
