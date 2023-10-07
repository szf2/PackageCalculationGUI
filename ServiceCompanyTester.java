import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ServiceCompanyTester {

	public static void main(String[] args) throws IOException {
		int reader;
		String zipCode;
		String phone;
		String info;
		Boolean code = false;
		String answer;
		Boolean digit = false;
		String phoneNum;
		String name;
		String brand;
		double cost;
		int mbps;

		
		Address location = new Address();
		TvPackage [] tele = new TvPackage [3];
		Internet [] net = new Internet [3];
		Phone [] cell = new Phone [2];
		Scanner fileIn = null;
		Scanner different = null;
		Customer [] pack = new Customer[1];
		ServiceCompany selection = new ServiceCompany();
		
			
try {
			
			fileIn = new Scanner(new FileInputStream("serviceOptions.dat"));
			
		} catch (FileNotFoundException e) {
			System.out.println("File isn't found");
			System.exit(0);
		}	
		
		
		
		fileIn.useDelimiter(",|\r");
		
		while(fileIn.hasNextLine()) {
			
			double price = 0;
			String data;
			int speed = 0;
			String plan;
			double expenses = 0;
			String upper;
			String lower;
			String medium;
			
//			data = fileIn.next();
//			System.out.println("Package 1: " + data);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price + "\n");
//
//			data = fileIn.next();
//			System.out.println("Package 2: " + data);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price + "\n");
//			
//			data = fileIn.next();
//			System.out.println("Package 3: " + data);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price + "\n");
//			
//			
//			lower = fileIn.next();
//			System.out.println("Type: " + lower);
//			speed = fileIn.nextInt();
//			System.out.println("Speed: " + speed);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price + "\n");
//			
//			
//			medium = fileIn.next();
//			System.out.println("Type: " + medium);
//			speed = fileIn.nextInt();
//			System.out.println("Speed:" + speed);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price + "\n");
//			
//			
//			upper = fileIn.next();
//			System.out.println("Type: " + upper);
//			speed = fileIn.nextInt();
//			System.out.println("Speed: " + speed);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price+ "\n");
//			
//			data = fileIn.next();
//			System.out.println("Brand: "+ data);
//			price = fileIn.nextDouble();
//			System.out.println("Price:" + price + "\n");
//			
//			data = fileIn.next();
//			System.out.println("Brand: " + data);
//			price = fileIn.nextDouble();
//			System.out.println("Price: " + price + "\n");
//			
//			
			
	 for(int i = 0; i<tele.length; ++i){
			data = fileIn.next();
		//	System.out.println("Package 1: " + data);
			price = fileIn.nextDouble();
		//	System.out.println("Price: " + price + "\n");
			tele[i] = new TvPackage(data,price);
			
	}
			selection.SetTvOptions(tele);
			
			 for(int i = 0; i<net.length; ++i){
					lower = fileIn.next();
		//	System.out.println(" Type: " + lower);
			speed = fileIn.nextInt();
		//	System.out.println(" Speed: " + speed);
			price = fileIn.nextDouble();
		//	System.out.println(" Price: " + price + "\n");
			
			net[i] = new Internet(lower,speed,price);
	
	}	
			 selection.SetInternetOptions(net);
			
			for(int i = 0; i<cell.length; ++i){
					
			data = fileIn.next();
		//	System.out.println(" Brand: "+ data);
			price = fileIn.nextDouble();
		//	System.out.println(" Price:" + price + "\n");
						
			
			cell[i] = new Phone(data,price);

}
			selection.SetPhoneOPtions(cell);
			
			if(fileIn.hasNextLine()) {
				fileIn.nextLine();
			}	
			
			





//	System.out.println("Please enter your Id ");
//	String response;	
	//	try {
//		
//		file = new Scanner(new FileInputStream("transaction.txt"));
//		boolean present = false;
//		while(file.hasNextLine()) {
//			response = file.nextLine();
//			if(response.equals(customerIdNum)) {
//				present = true;
//			}
//				if(file.hasNextLine()) {
////					file.nextLine();
////			}
////	} catch (FileNotFoundException e) {
////		System.out.println("Customer does not exist");
////		System.exit(0);
////	}	
////	
//	
//		
//	
//	
		Scanner scnr = new Scanner(System.in);
		boolean stop = false;
		int options;
			
		
	
	Scanner other = new Scanner(System.in);
	boolean dont = false;
	int choice;
	String message;
	String streetName;
	String cityName;
	String stateName;
	String zipName;
	int customerID;
	Customer citizen = new Customer();
	
	do {
		System.out.println("Welcome!");
		System.out.println("Choose 1 to create a customer");
		System.out.println("Choose 2 to search a customer");
		System.out.println("Choose 3 to quit");
		choice = other.nextInt();
		if(choice == 1) {
			other.nextLine();
			System.out.println("Enter name");
			name = other.nextLine();
			citizen.setName(name);
			
			System.out.println("Enter phone number ");
			phone = other.nextLine();
			citizen.setPhoneNum(phone);
			System.out.println("Enter street");
			streetName = other.nextLine();
			System.out.println("Enter city");
			cityName = other.nextLine();
			System.out.println("Enter state");
			stateName = other.nextLine();
			System.out.println("Enter zipcode");
			zipName = other.nextLine();
			Address place = new Address(streetName,cityName,stateName,zipName);
			citizen = new Customer(name,phone,place);
			selection.addCustomer(citizen);	
			
			do {
				System.out.println("Choose a Service");
				System.out.println("Choose 1 to view tv Package"); 
				System.out.println("Choose 2. to view internet Package");
				System.out.println("Choose 3.to view phone Package"); 
				System.out.println("Choose 4 Make Transaction"); 
				System.out.println("Choose 5.View transaction");
				System.out.println("Choose 0 to exit");
				
				options = scnr.nextInt();
				switch(options) {
				
				case 1:
					System.out.println(selection.GetTvOptions());
		
					break;
					
				case 2:
					System.out.println(selection.GetInternetOptions());
					
					break;
					
				case 3:
					System.out.println(selection.GetPhoneOptions());
										break;
					
				case 4:
					System.out.println("Make a transaction");
					int	select;
					do {
						System.out.println(selection.GetTvOptions());
						System.out.println("Choose one option. Select 1 for first option, Select 2 for second option, Select 3, for third option");
						
						select = scnr.nextInt();
				
						if(select >= 1 && select <=3) {
					
							
							citizen.addPackage(selection.getTvPackage(select-1));
						} else {
							System.out.println("Invalid option");
						}
					} while (!(select >= 1 && select <=3));
					
					int decision;
					do {
					System.out.println(selection.GetInternetOptions());
					System.out.println("Choose one option. Select 1 for first option, Select 2 for second option, Select 3, for third option");
					
					 decision = scnr.nextInt();
					if(decision>=1 && decision <=3) {
						citizen.addPackage(selection.getInternetPackage(decision-1));
					}
					else {
						System.out.println("Not a valid option");
					}
					}while(!(decision>=1 && decision <=3));
					
					int declare;
					do {
					System.out.println(selection.GetPhoneOptions());
					System.out.println("Choose one option. Select 1 for first option, Select 2 for second option");
					
					 declare = scnr.nextInt();
					if(declare >=1 && declare <=2) {
						citizen.addPackage(selection.getPhonePackage(declare-1));
					}
					else {
						System.out.println("Option not valid");
					}
					}while(!(declare>=1 && declare <=3));
					
					break;
					
				case 5:
					System.out.println("View transaction");
					System.out.println("$ " + Math.round(citizen.getTotalCost()*100.00)/100.0);
					break;
					
				case 0: 
					stop = true;
					break;
				default:
					System.out.println("Not an option");
				}
			}while(!stop);
			System.out.println("Thank you for your service");

			
		}		
			else if(choice == 2) {
			System.out.println("Enter customer ID Number");
			customerID = other.nextInt();
			
			
			while(!(selection.searchCustomer(customerID))) {
				System.out.println("Not a customer");
				System.out.println("Enter customer ID");
				customerID = other.nextInt();
				
			}
			
			
		}
			else if(choice == 3) {
			System.out.println("Quitting");
			dont = true;
			
			}
			else {
				System.out.println("Not a correct option");
		}
		}while(!dont);
			System.out.println("Thank you");
		
	
			
			


	
	






	
Scanner input = new Scanner(System.in);
Double expense;

	try

	{
	
		//FileOutputStream fileStream = new FileOutputStream("transaction.txt");
		PrintWriter outFS = new PrintWriter("transaction.txt");
		
		
			
		outFS.println(selection.toString());
		
		
		outFS.close();
		//fileStream.close();
		System.out.println("Data written to file");
			
		
		
		
	}
	catch(
	FileNotFoundException e)
	{
		System.out.println("File isn't here");
		System.exit(0);

	}
	
	
	

		}
	}
}








