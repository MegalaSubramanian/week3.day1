package week3.day1.assessment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit -> AxisBank");
	}
public static void main(String[] args) {
	AxisBank obj = new AxisBank();
	BankInfo obj1 = new BankInfo();
	obj.deposit();
	obj1.deposit();	
}
}
