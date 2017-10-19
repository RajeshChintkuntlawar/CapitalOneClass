package MySingletonDesignPattern;

public class Singleton{
	
	private static Singleton onlyOne = new Singleton();
	
	private static double bankBalance = 20D;

	
	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getSingleton() {
		return onlyOne;
	}
	
	synchronized public double changeBankAccount(double addThis) {
		bankBalance+=addThis;
		return bankBalance;
	}
	
	synchronized public double withdrawFunds(double removeThis) {
		bankBalance-=removeThis;
		return bankBalance;
	}

	public static double getBankBalance() {
		return bankBalance;
		
	}

	
	

}
