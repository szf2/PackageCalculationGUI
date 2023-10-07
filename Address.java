/**
 * A name Address gets address information
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: Address.java
 */

import java.util.*;
import java.util.regex.*;

public class Address {
	
/**
 * 	Information about Addresses street
 */
	
private String street;

/**
 * Information about Addresses city
 */

private String city;

/**
 * Information about Addresses state
 */

private String state;

/**
 * Information about Addresses zipCode
 */

private String zipCode;

/**
 * Constructs a Address object with default values for instance fields
 */

public Address() {
	super();
	setStreet("");
	setCity("");
	setState("");
	setZipCode("55555");
}

/**
 * Constructs a Address object
 * @param street
 * @param city
 * @param state
 * @param zipCode
 */

public Address(String street, String city, String state, String zipCode) {
	super();
	setStreet(street);
	setCity(city);
	setState(state);
	setZipCode(zipCode);
} 

/**
 * Returns the street 
 * @return street of address
 */

public String getStreet() {
	return street;
}

/**
 * Sets street to parameter value
 * @param street
 */

public void setStreet(String street) {
	this.street = street;
}

/**
 * Returns city address
 * @return city of the address
 */

public String getCity() {
	return city;
}

/**
 * Sets city to parameter value
 * @param city of the address
 */

public void setCity(String city) {
	this.city = city;
}

/**
 * Returns the state 
 * @return state of address
 */

public String getState() {
	return state;
}

/**
 * Sets state to paramter value
 * @param state
 */

public void setState(String state) {
	this.state = state;
}

/**
 * Returns zipCode
 * @return zipCode of address
 */

public String getZipCode() {
	return zipCode;
}

Scanner another = new Scanner(System.in);

/**
 * Sets zipCode to parameter value
 * @param zipCode
 * @return
 */

public boolean setZipCode(String zipCode) {
	this.zipCode = zipCode;
	
	String regex = "^[0-9]{5}";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(zipCode);
	System.out.println(matcher.matches());
	boolean not = false;
	
	try {
		if(matcher.matches() == true) {
			this.zipCode = zipCode;
			matcher = pattern.matcher(zipCode);
			return not;
			
		}
		
		throw new ZipcodeException();
		
	}catch (ZipcodeException e) {
		while(not == false) {
			System.out.println("Enter zipcode again");
			zipCode = another.nextLine();
			matcher = pattern.matcher(zipCode);
			if(matcher.matches() == true) {
				break;
			}
		}
		return not;
	}
}	

	

		


}
