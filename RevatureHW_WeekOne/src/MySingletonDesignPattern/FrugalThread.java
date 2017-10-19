package MySingletonDesignPattern;

import java.util.concurrent.ThreadLocalRandom;

public class FrugalThread extends Thread{
	@Override
	public void run() {
		// Iteratively Save
		boolean x = true;
		int randomNum;
		Singleton One = Singleton.getSingleton();
		while (x) {
			System.out.println(Thread.currentThread().getName() + ": Starting Bank Balance = " + Singleton.getBankBalance());
			randomNum = ThreadLocalRandom.current().nextInt(1, 101);
			One.changeBankAccount(randomNum);
			System.out.println(Thread.currentThread().getName() + ": New Bank Balance = " + Singleton.getBankBalance());
			if (Singleton.getBankBalance() <=0) {
				x = false;
			}
		}
	}

}
