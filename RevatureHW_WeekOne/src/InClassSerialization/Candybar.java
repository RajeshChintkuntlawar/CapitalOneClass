package InClassSerialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Candybar implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 293L;
	private int calories = 0;
	private String type = "chocolate";
	private double weightInOunces = 0;
	private List<String> ingredients = new ArrayList<String>();
	
	public Candybar(int cal, String type, double wt, List<String> ing) {
		setCalories(cal);
		setType(type);
		setWeightInOunces(wt);
		setIngredients(ing);
	}
	
	
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeightInOunces() {
		return weightInOunces;
	}
	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}


	@Override
	public String toString() {
		return "Candybar [calories=" + calories + ", type=" + type + ", weightInOunces=" + weightInOunces
				+ ", ingredients=" + ingredients + "]";
	}
	
	


}
