package tij.ch4;

import java.util.Arrays;

public class Task10 {
	
	
	public Task10(){
		
		for(int i=10; i<100; i++){
			for(int j=(1000/i); j<i; j++){
				int n = i*j;
				
				int [] factorsDigits = getSortedFactorsDigits(i, j);
				int [] numberDigits = getSortedNumberDigits(n);
				if (Arrays.equals(factorsDigits, numberDigits))
					System.out.println(n + " = " + i + " * " + j);
			}
		}
	}
	
	private int[] getSortedFactorsDigits(int factor1, int factor2){
		int[] digits = new int[4];
		digits[0] = factor1/10;
		digits[1] = factor1%10;
		digits[2] = factor2/10;
		digits[3] = factor2%10;
		Arrays.sort(digits);
		return digits;		
	}
	
	private int[] getSortedNumberDigits(int number){
		int[] digits = new int[4];
		digits[0] = (number/1000) %10;
		digits[1] = (number/100)%10;
		digits[2] = (number/10)%10;
		digits[3] =  number%10;
		Arrays.sort(digits);
		return digits;		
	}
	
	
}

