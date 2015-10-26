package tij.ch5;

public class Task21_22 {
	public Task21_22(){
		for(Banknots bank: Banknots.values())
			System.out.println(bank + " " + bank.ordinal());
	}
	
	public void task22Method(Banknots value){
		switch(value){
		case ONE$:	System.out.println("REALLY NOT ENAUGH");
					break;
		case TWO$:	System.out.println("STILL NOT ENAUGH");
					break;
		case FIVE$:	System.out.println("NOT ENAUGH");
					break;
		case TEN$:
		case TWENTY$:
		case FIFTY$:System.out.println("CAN DO");
					break;
		}
	}
}

	

enum Banknots{
	ONE$, TWO$, FIVE$, TEN$, TWENTY$, FIFTY$
}

