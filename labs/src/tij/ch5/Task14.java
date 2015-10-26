package tij.ch5;

public class Task14 {
	public Task14(){
		str1.show();
	}
}

class str1{
	public static String strr = "aaaa";
	public static String str;
	static {
		str = "dsadas";
	}
	
	static void show(){
		System.out.println(str + strr);
	}
}