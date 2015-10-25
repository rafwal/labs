package tij.ch4;


public class Task4 {
	
	private int LIMIT = 100;
	
	public Task4(){
		boolean isPrimal = true;
		
		for(int i=2; i<=LIMIT; i++){
			
			for (int j=2; j<i; j++){
				
				if( i%j == 0){
					isPrimal = false;
					break;
				}
				
			}
			
			if (isPrimal)
				System.out.print(i + " ");
			else
				isPrimal = true;
		}
	}
}
