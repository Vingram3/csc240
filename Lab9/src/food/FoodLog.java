package food;

public class FoodLog {

	private String foodName, foodType;
	private int cal;
	private double fat; 
	
	public FoodLog(String foodName, String foodType, int cal, double fat) {
		this.foodName = foodName;
		this.foodType = foodType;
		this.cal = cal;
		this.fat = fat;
	}
	
	public String toString() {
		return foodName + " " + foodType + " " + cal + " " + fat;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public int getCal() {
		return cal;
	}
	
	public double getFat() {
		return fat;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public void setCal(int cal) {
		this.cal = cal;
	}
	
	public void setFat(int fat) {
		this.fat = fat;
	}
	
	

}