package tij.ch5;

public class Task19 {

	public Task19(){
		varargsMethod(1,2,3,4,5,6);
		varargsMethod(new Integer[]{1,2,3,4,5});
	}
	
	public void varargsMethod(Integer... args){
		for (Integer i: args){
			System.out.println(i);
		}
	}
}
