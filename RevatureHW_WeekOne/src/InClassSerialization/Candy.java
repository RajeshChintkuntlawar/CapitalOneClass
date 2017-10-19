package InClassSerialization;

import java.io.Serializable;
public class Candy implements Serializable {
    private static final long serialVersionUID = -1110004773145562710L;
    private String candyName;
    private String candyColor;
    private transient String Ingrediants;
    public Candy() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Candy(String candyName, String candyColor, String ingrediants) {
        super();
        this.candyName = candyName;
        this.candyColor = candyColor;
        Ingrediants = ingrediants;
    }
    public String getCandyName() {
        return candyName;
    }
    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }
    public String getCandyColor() {
        return candyColor;
    }
    public void setCandyColor(String candyColor) {
        this.candyColor = candyColor;
    }
    public String getIngrediants() {
        return Ingrediants;
    }
    public void setIngrediants(String ingrediants) {
        Ingrediants = ingrediants;
    }
    @Override
    public String toString() {
        return "Candy [candyName=" + candyName + ", candyColor=" + candyColor + ", Ingrediants=" + Ingrediants + "]";
    }
    
}