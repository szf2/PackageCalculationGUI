/**
 * A name ServiceCompany has array of objects
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:4
 File Name: ServiceCompany.java
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ServiceCompany {
	
/**
 * 	Information about array of customers
 */
	
private Customer [] customers;

/**
 * Information about the number
 */

private int number;

/**
 * Information about the max number
 */

private int max = 5;

/**
 * Information about the array of TvPackage
 */

TvPackage [] tv = new TvPackage[3];

/**
 * Information about the array of Internet
 */

Internet [] internet = new Internet[3];

/**
 * Information about the array of Phone
 */

Phone [] phone = new Phone[2];

/**
 * Constructs a ServiceCompany object with default values for instance fields
 */

public ServiceCompany() {
setNumber(0);
customers = new Customer[max];
for (int i = 0; i < max; i++) {
	this.customers[i] = new Customer();
}
}

/**
 * Constructs a ServiceCompany object
 * @param number
 * @param customers
 */


public ServiceCompany(int number, Customer [] customers){
	setNumber(number);
	max += customers.length;
	this.customers = new Customer[max];
	for (int i = 0; i < customers.length; i++) {
		this.customers[i] = customers[i];
	}
}

//{
//	Scanner fileIn;
//	try {
//		FileInputStream file = new FileInputStream("serviceOptions.dat");
//		fileIn = new Scanner(file);
//	
//	
//	
//	for(int i = 0; i<tv.length; ++i) {
//
//		 String name = fileIn.next();
//		 double value = fileIn.nextDouble();
//		 
//		
//		
//		Package temp = new Package(value, name);
//		tv[i] = temp;
//		
//	}
//	
//	for(int i = 0; i<internet.length; ++i) {
//		
//		double values = fileIn.nextDouble();
//		int speed = fileIn.nextInt();
//		String name = fileIn.next();
//		
//		Internet temp1 = new Internet(values, speed, name);
//		internet[i] = temp1;
//		
//	}
//	
//	for(int i = 0; i<phone.length; ++i) {
//		double values = fileIn.nextDouble();
//		String name = fileIn.next();
//		
//		Package temp2 = new Package(values, name);
//		phone[i] = temp2;
//	}
//	}
//	catch(FileNotFoundException e) {
//		System.out.println("File isn't here");
//		System.exit(0);
//	}
//
//	
//}

	/**
	 * Constructs a Customer object
	 * @param customers
	 * @param number
	 * @param tv
	 * @param internet
	 * @param phone
	 */

		public ServiceCompany(Customer[] customers, int number, TvPackage[] tv, Internet[] internet, Phone[] phone) {
	super();
	this.customers = customers;
	this.number = number;
	this.tv = tv;
	this.internet = internet;
	this.phone = phone;
	
}
		/**
		 * Sets TvOptions to a parameter value
		 * @param tv
		 */
		
		public void SetTvOptions(TvPackage [] tv) {
			this.tv = tv;
		}
		
		/**
		 * Sets InternetOptions to a parameter value
		 * @param internet
		 */
		
		public void SetInternetOptions(Internet [] internet) {
			this.internet = internet;
		}
		
		/*
		 * Sets PhoneOPtions to a parameter value
		 */
		
		public void SetPhoneOPtions(Phone [] phone) {
			this.phone = phone;
		}
		
		/**
		 * Returns TvOptions
		 * @return TvOptions of the package
		 */
		
		public String GetTvOptions() {
		String television = "";
			for(int i =0; i<tv.length; ++i) {
				television += tv[i].toString();
				
			}
			return television;
		}
		
		/**
		 * Returns InternetOptions
		 * @return InternetOptions for the customer to view
		 */
		
		public String GetInternetOptions(){
				String web = "";
			for(int i = 0; i<internet.length; ++i) {
					web += internet[i].toString();
			}
		
			return web;
		}
		
		/**
		 * Returns PhoneOptions
		 * @return PhoneOptions for the customer to view
		 */
		
		public String GetPhoneOptions() {
		String	telephone = "";
			for(int i = 0; i<phone.length; ++i) {
				telephone += phone[i].toString();
			}
			return telephone;
		}
		
		/**
		 * Sets Customer array to a parameter value
		 * @param customers array of customers
		 */
		

		public ServiceCompany(Customer[] customers) {
			this.customers = customers;
			
		}
		
		/**
		 * Returns the PhonePackage 
		 * @param index
		 * @return information about the phone package
		 */
		
		public Phone getPhonePackage(int index) {
			return phone[index];
		}
		
		/**
		 * Returns TvPackage
		 * @param index
		 * @return information about the tv package
		 */
		
		public TvPackage getTvPackage(int index) {
			return tv[index];
		}
		
		
		/**
		 * Returns InternetPackage
		 * @param index
		 * @return information about the internet package
		 */
		
		public Internet getInternetPackage(int index) {
			return internet[index];
		}
		
		/**
		 * Returns the Customer array object
		 * @return the service the customer has choosen
		 */
		
		public Customer[] getService() {
			return customers;
		}
		
		/**
		 * Returns the number 
		 * @return number
		 */
		
		public int getNumber() {
			return number;
		}
		
		/**
		 * Sets number to parameter value
		 * @param number 
		 */
		
		public void setNumber(int number) {
			this.number = number;
		}
		
		/**
		 * Sets number to parameter value
		 * @param number for ServiceCompany
		 */
		
		public ServiceCompany(int number) {
			super();
			this.number = number;
		}
		
	
		
		/**
		 * Set individual to parameter value 
		 * @param individual and adds the customer
		 */
		
		public void addCustomer(Customer individual) {
			if(number<max) {
				customers[number] = individual;
				number = number + 1;
				
			}
			
		}
		
		/**
		 * Sets customerIDNum to parameter value
		 * @param customerIDNum
		 * @return
		 */
		
		public boolean searchCustomer(int customerIDNum) {
			int find = 0;
			for(int i = 0; i<max; ++i) {
				if(customers[i].getCustomerIdNum()== customerIDNum) {
					System.out.println(customers[i].toString());
					return true;
				}
			}return false;
			
			
		}
		
		/**toString
		 * Prints the customers information pertaining to the service
		 * 
		 */
		
		@Override
		public String toString() {
			String out = "";
			for(int i = 0; i<customers.length; ++i) {
				out += customers[i].toString();
			}
			return out;
		}
		
		
}