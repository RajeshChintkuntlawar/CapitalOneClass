package InterfacePractice;

public class Square implements Shape{

	private final int NUMBER_SIDES = 4;
	private double area=0;
	
	private int sideALength;
	private int sideBLength;
	private int sideCLength;
	private int sideDLength;
	


	public Square(int sideALength, int sideBLength, int sideCLength, int sideDLength) {
		super();
		setSideALength(sideALength);
		setSideBLength(sideBLength);
		setSideCLength(sideCLength);
		setSideDLength(sideDLength);
		//setArea() is called from set length functions
	}

	public int getSideALength() {
		return sideALength;
	}

	public void setSideALength(int sideALength) {
		this.sideALength = sideALength;
		setArea();
	}

	public int getSideBLength() {
		return sideBLength;
	}

	public void setSideBLength(int sideBLength) {
		this.sideBLength = sideBLength;
		setArea();
	}

	public int getSideCLength() {
		return sideCLength;
	}

	public void setSideCLength(int sideCLength) {
		this.sideCLength = sideCLength;
		setArea();
	}

	public int getSideDLength() {
		return sideDLength;
	}

	public void setSideDLength(int sideDLength) {
		this.sideDLength = sideDLength;
		setArea();
	}

	private void setArea() {
		this.area = this.sideALength * this.sideBLength;
	}

	@Override
	public int getNumberSides() {
		return NUMBER_SIDES;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "Square [NUMBER_SIDES=" + NUMBER_SIDES + ", area=" + area + ", sideALength=" + sideALength
				+ ", sideBLength=" + sideBLength + ", sideCLength=" + sideCLength + ", sideDLength=" + sideDLength
				+ "]";
	}
	

}
