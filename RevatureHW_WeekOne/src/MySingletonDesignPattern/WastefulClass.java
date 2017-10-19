package MySingletonDesignPattern;

import java.util.concurrent.ThreadLocalRandom;

public class WastefulClass implements Runnable{

	@Override
	public void run() {
		// Iteratively Withdraw
		boolean x = true;
		int randomNum;
		Singleton One = Singleton.getSingleton();
		while (x) {
			System.out.println(Thread.currentThread().getName() + ": Starting Bank Balance = " + Singleton.getBankBalance());
			randomNum = ThreadLocalRandom.current().nextInt(1, 101);
			One.withdrawFunds(randomNum);
			System.out.println(Thread.currentThread().getName() + ": New Bank Balance = " + Singleton.getBankBalance());
			if (Singleton.getBankBalance() <=0) {
				x = false;
			}
		}
		
		
	}

}
