package InterfacePractice;

public class Triangle implements Shape{
	
	private final int NUMBER_SIDES = 3;
	private double area = 0;
	
	private int sideALength;
	private int sideBLength;
	private int sideCLength;
	private String triangleType; //acute, obtuse, right
	
	public Triangle(String type, int sideA, int sideB, int sideC) {
		super();
		setSideALength(sideA);
		setSideBLength(sideB);
		setSideCLength(sideC);
		setTriangleType(type);
		setArea(sideA, sideB, sideC);
	}
	
	public int getSideALength() {
		return sideALength;
	}



	private void setSideALength(int sideALength) {
		this.sideALength = sideALength;
	}



	public int getSideBLength() {
		return sideBLength;
	}



	private void setSideBLength(int sideBLength) {
		this.sideBLength = sideBLength;
	}



	public int getSideCLength() {
		return sideCLength;
	}



	private void setSideCLength(int sideCLength) {
		this.sideCLength = sideCLength;
	}



	public String getTriangleType() {
		return triangleType;
	}



	public void setTriangleType(String triangleType) {
		this.triangleType = triangleType;
	}
    

	public void setArea(int sideA, int sideB, int sideC) {
		double halfPerimeter = (sideA+sideB+sideC)/2;
		double numberToSquare = halfPerimeter*((halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
		
		this.sideALength=sideA;
		this.sideBLength=sideB;
		this.sideCLength=sideC;
		this.area = Math.sqrt(numberToSquare);
	}
	
	@Override
	public int getNumberSides() {
		return NUMBER_SIDES;
	}

	@Override
	public double getArea() {
		// calculate area
		
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [NUMBER_SIDES=" + NUMBER_SIDES + ", area=" + area + ", sideALength=" + sideALength
				+ ", sideBLength=" + sideBLength + ", sideCLength=" + sideCLength + ", triangleType=" + triangleType
				+ "]";
	}

}
