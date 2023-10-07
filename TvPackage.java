/**
 * **
 A name TvPackage that has tv information
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: TvPackage.java
 */
public class TvPackage extends Package {

	/**
	 * Information about the cost
	 */
	
	private double cost;
	
	/**
	 * Information about the info
	 */
	
	private String info;
	
	/**
	 * Constructs a TvPackage object with default value for instance fields
	 */
	
	public TvPackage() {
		this.cost = 0;
		this.info = "";
	}
	
	/**
	 * Constructs a TvPackage
	 * @param info
	 * @param cost
	 */
	
	public TvPackage(String info, double cost) {
		super();
		setInfo(info);
		setCost(cost);
	}
	
	/**
	 * Returns the cost 
	 * @return cost of TvPackage
	 */
	
	public double getCost() {
		return cost;
	}
	
	/**
	 * Sets cost to parameter value
	 * @param cost of the package
	 */
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Returns the info 
	 * @returns info about TvPackage
	 */
	
	public String getInfo() {
		return info;
	}
	
	/**
	 * Sets info to parameter value
	 * @param info about TvPackage
	 */
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	/**toString
	 * Prints the info and cost of TvPackage
	 * 
	 */
	
	public String toString() {
		return info + " "  + cost + "\n";
	}
	
}
