//create a class called saving account.
public class SavingsAccount {
	//use static variable annual intrest rate
	static double annualIntrestRate;
	//each object of the class contain a private instance bariable savings balance
	private double savingsBalance;
	
	public SavingsAccount(double money, double intrestRate) {
		annualIntrestRate = intrestRate;
		savingsBalance = money;
		
	}
	//provide a method calculate monthly intrest
	public void calculateMonthlyIntrest(){	
	//that multiplies savings balec by annual intrest rate/12
	//intrest should be added to savings balance
		savingsBalance +=((savingsBalance*annualIntrestRate)/12);	
	}
	
	//provide a static method modify intrest rate that sets annual intrest rate to a new value
	public static void modifyIntrestRate(double rate) {
		annualIntrestRate = rate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
		
	}
}
