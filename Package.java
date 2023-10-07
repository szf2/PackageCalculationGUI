/**
 * A name Package that stores package information and cost
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: Package.java
 */
public class  Package {

	/**
	 * Information about the cost 
	 */
	
	private double cost;
	
	/**
	 * Information about the package information
	 */
	
	private String info;
	
	/**
	 * Constructs a Package object with default parameter values for instance fields
	 */

	public Package() {
		super();
		this.info = "";
		this.cost = 0;

	}
	
	/**
	 * Constructs Package object
	 * @param cost
	 * @param info
	 */
	
	public Package(double cost, String info) {
		super();
		setCost(cost);
		setInfo(info);

	}
	
	/**
	 * Returns the cost
	 * @return cost
	 */
	
	public double getCost() {
		return cost;
	}
	
	/**
	 * Sets cost to parameter value
	 * @param cost of package
	 */
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Returns information
	 * @return information about the package
	 */
	
	public String getInfo() {
		return info;
	}
	
	/**
	 * Sets info to parameter value
	 * @param info about the package
	 */
	
	public void setInfo(String info) {
		this.info = info;
	}

	/** toString
	 * Prints out the cost and information
	 */
	
	@Override
	public String toString() {
		
		return cost + info;
		
	}
	
}
