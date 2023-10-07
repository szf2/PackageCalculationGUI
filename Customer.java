/**
 A name Customer can get customer's information
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: Customer.java
 */


import java.util.*;
import java.util.regex.*;
import java.util.Scanner;
import java.lang.Math;

public class Customer {
	
/**
 * Information of an object package	
 */
	
private Package [] pack = new Package[3];

/**
 * Information about the customers name
 */

private String name; 

/**
 * Information about the customers phone number
 */
private String phoneNum;

/**
 * Information about the customers id number
 */

private int customerIdNum;

/**
 * Number of packages
 */

private int numbers;

/**
 * The information of an arrays size
 */

private static int nextcustomerIdNum = 0;

/**
 * Information of an address
 */

private Address map;

/**
 * Constructs a Customer object with default values for instance fields
 */

public Customer() {
	super();
	setName("");
	setPhoneNum("(000)000-0000");
	setCustomerIdNum();
	
	}

/**
 * Constructs a customer object
 * @param name
 * @param phoneNum
 * @param newAddress
 */

public Customer( String name, String phoneNum, Address newAddress) {
	super();
	setName(name);
	setPhoneNum(phoneNum);
	setCustomerIdNum();
	this.map = newAddress;
}

/**
 * Returns the name of customer
 * @return customers name
 */

public String getName() {
	return name;
}

/**
 * Sets Customer to parameter value
 * @param name of customer
 */
public void setName(String name) {
	this.name = name;
}

/**
 * Returns the phone number of customer
 * @return customers phone number
 */

public String getPhoneNum() {
	return phoneNum;
}

/**
 * Returns the next customers Id number
 * @return next customers Id number
 */

public static int getNextcustomerIdNum() {
	return nextcustomerIdNum++;
}

Scanner different = new Scanner(System.in);

/**
 * Sets customer to parameter value
 * @param phoneNum
 * @return phone number of the customer
 */

public boolean setPhoneNum(String phoneNum)  {
	this.phoneNum = phoneNum;


	String regex = "\\([0-9]{3}\\)[0-9]{3}\\-[0-9]{4}";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(phoneNum);
	System.out.println(matcher.matches());
	boolean incorrect = false;
	
		
	
	
	
try {
		
		if(matcher.matches() == true) {
			this.phoneNum = phoneNum;
			matcher = pattern.matcher(phoneNum);
			return incorrect;
		}
		
			throw new PhoneNumException();
		
		
	}catch (PhoneNumException e) {
		
		while(incorrect == false) {
			
			System.out.println("Enter phone number again");
			phoneNum = different.nextLine();
		    matcher = pattern.matcher(phoneNum);
			if(matcher.matches() == true) {
			break;
		}
		}
		return incorrect;
	}
}
	
/**
 * Returns the customers ID number	
 * @return the Id number of the customer
 */

public int getCustomerIdNum() {
	return customerIdNum;
}

/**
 * Sets customer Id number to parameter value
 */

public void setCustomerIdNum() {
	customerIdNum = getNextcustomerIdNum();
}

/**
 * Sets customer to parameter value
 * @param cost of package
 */

public void addPackage(Package cost) {
	if(numbers<3) {
	pack[numbers] = cost;
	numbers = numbers +1;
	}
}

/**
 * Returns the total cost 
 * @return total cost
 */

public double getTotalCost() {
	double cost = 0;
	for(int i = 0; i<numbers; ++i) {
		cost += pack[i].getCost();
		
	}
	return cost;
}

/** toString
 * Prints out information about the customers Id number, total cost, and service
 */

@Override
public String toString() {
	String in = "";
	for(int i = 0; i<numbers; ++i) {
		in += pack[i].toString();
	}
	return  "Customer Id Number: " + customerIdNum +"\n" + " Total cost " + Math.round(getTotalCost()*100.0)/100.0 +"\n"+" Each service cost: " +"\n" + in;
}

}
