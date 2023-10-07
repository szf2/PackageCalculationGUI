/**
 * A name Internet that has internet package information
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: Internet.java
 */
public class Internet extends Package {

/**
 * 	Information about the cost
 */
	
private double cost;

/**
 * Informatin about speed
 */

private int mbps;

/**
 * Information about the type
 */

private String info;

/**
 * Constructs a Internet object with default values for instance fields
 */

public Internet() {
	this.cost = 0;
	this.mbps = 0;
	this.info = "";
}

/**
 * Constructs Internet object
 * @param info
 * @param mbps
 * @param cost
 */

public Internet( String info, int mbps, double cost) {
	setInfo(info);
	setMbps(mbps);
	setCost(cost);
}

/**
 * Returns the cost 
 * @return cost of package
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
 * Returns the speed 
 * @return speed of Internet
 */

public int getMbps() {
	return mbps;
}

/**
 * Sets mbps to parameter value
 * @param mbps speed of Internet
 */

public void setMbps(int mbps) {
	this.mbps = mbps;
}

/**
 * Returns the information 
 * @return information about Internet
 */

public String getInfo() {
	return info;
}

/**
 * Sets info to parameter value
 */

public void setInfo(String info) {
	this.info = info;
}

/** toString
 * Prints out information about the internet package
 */

public String toString() {
	return info + " " + mbps + " " +  cost +  "\n";
}

}
