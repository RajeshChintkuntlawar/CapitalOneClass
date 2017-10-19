package InterfacePractice;

public abstract class AbstractClass {
	
	private int ID;
	private int number;
	private String name;
	
	public AbstractClass(int ID, int number, String name) {
		super();
		this.ID = ID;
		this.number = number;
		this.name = name;
	}
	
	public abstract String getName(int ID);
	
	public abstract int getNumber(int ID);

}
