package ComparableFruitsPractice;

public class Fruit implements Comparable<Fruit>{

	private String name = "fruit";
	private String color = "grey";
	private float ounces = 0f;
	private String flavor = "bland";
	private int rating = 0;
	
	
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Fruit(String name, String color, float ounces, String flavor, int rating) {
		super();
		this.name = name;
		this.color = color;
		this.ounces = ounces;
		this.flavor = flavor;
		this.rating = rating;
	}



	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return o.rating - this.rating;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public float getOunces() {
		return ounces;
	}



	public void setOunces(float ounces) {
		this.ounces = ounces;
	}



	public String getFlavor() {
		return flavor;
	}



	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", ounces=" + ounces + ", flavor=" + flavor + ", rating="
				+ rating + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(ounces);
		result = prime * result + rating;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(ounces) != Float.floatToIntBits(other.ounces))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}



}
