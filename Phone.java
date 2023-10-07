/**
 * A name Phone that stores phone information
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: Phone.java
 */
public class Phone extends Package{
	
/**
 * 	Information about the cost
 */
	
private double cost;

/**
 * Information about the type
 */

private String brand;

/**
 * Constructs a phone object with default values for instance fields
 */

public Phone() {
	this.cost = 0;
	this.brand = "";
}

/**
 * Constructs phone object
 * @param brand
 * @param cost
 */

public Phone(String brand, double cost) {
	super();
	setBrand(brand);
	setCost(cost);
}

/**
 * Returns the cost 
 * @return cost of phone
 */

public double getCost() {
	return cost;
}

/**
 * Sets cost to parameter value
 * @param cost of phone package
 */

public void setCost(double cost) {
	this.cost = cost;
}

/**
 * Returns the info about the type
 * @return type of phone info
 */

public String getBrand() {
	return brand;
}

/**
 * Sets brand to parameter value
 * @param brand of phone
 */

public void setBrand(String brand) {
	this.brand = brand;
}

/**toString
 * Prints the type and cost of phone
 */

public String toString() {
	return brand + " "  + cost + "\n";
}

}
