import java.text.DecimalFormat;
public class SavingsAccountTest {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double money = 0;
		
		//instantiate 2 savingsAccount objects saver1 with $2k and saver 2 with $3k set intrest rate to 4% for both
		SavingsAccount saver1 = new SavingsAccount(2000.00, .04);
		System.out.println("saver1's monthly balance:");
		
		//calculate the monthly intrest for both for each of the 12 months
		for(int i=1; i<13;i++ ) {
			saver1.calculateMonthlyIntrest();
			money = saver1.getSavingsBalance();
			money = Double.valueOf(df.format(money));
			System.out.println("month " + i + " $" + money);
			}
		
		saver1.modifyIntrestRate(.05);
		saver1.calculateMonthlyIntrest();
		money = saver1.getSavingsBalance();
		money = Double.valueOf(df.format(money));
		System.out.println("month 13 $" + money);
		
		money = 0;
		SavingsAccount saver2 = new SavingsAccount(3000.00, .04);
		System.out.println("");
		System.out.println("saver2's monthly balance:");
		
		
		
		for(int i=1; i<13;i++ ) {
			saver2.calculateMonthlyIntrest();
			money = saver2.getSavingsBalance();
			money = Double.valueOf(df.format(money));
			System.out.println("month " + i + " $" + money);
		}
		saver2.modifyIntrestRate(.05);
		saver2.calculateMonthlyIntrest();
		money = saver2.getSavingsBalance();
		money = Double.valueOf(df.format(money));
		System.out.println("month 13 $" + money);
	}

}
