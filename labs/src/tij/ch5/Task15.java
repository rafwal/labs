package tij.ch5;

public class Task15 {
	public Task15(){
		new str2().show();
	}
}

class str2{
	String str;
	{
		str = "asa";
	}
	
	void show(){
		System.out.println(str);
	}
}