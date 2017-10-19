package MySingletonDesignPattern;

public class SingletonLauncher {

	public static void main(String[] args) {
		// start two threads, one with runnable class, one with extended thread class, which substract and add from bank balance respectively
		
		WastefulClass wastingMoney = new WastefulClass();
		
		Thread spenderThread = new Thread(wastingMoney);
		
		Thread savingThread = new FrugalThread();
		
		spenderThread.setName("Prissy");
		savingThread.setName("Joshua");
		
		spenderThread.start();
		savingThread.start();
		

		

	}

}
