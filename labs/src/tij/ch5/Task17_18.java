package tij.ch5;

public class Task17_18 {
	public Task17_18(){
		Str3[] arr = new Str3[10];
		
		for (int i=0; i<arr.length; i++){
			arr[i] = new Str3("" + i);
		}
	}
}

class Str3{
	public Str3(String str){
		System.out.println(str);
	}
}