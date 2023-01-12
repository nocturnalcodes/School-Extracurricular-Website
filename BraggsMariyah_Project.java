/*Author: Mariyah Braggs
 * CMIS 141 7381
 * December 13, 2022
 * Purpose: create a program that will track customers and order data
 */

package assignments;

import java.util.*; // for user input

public class BraggsMariyah_Project {
	
	//create method that will add multiple customers
	public static void multiple_customers (String [] names, int[] id, double [] sales) {
		Scanner scan = new Scanner (System.in); //for user input
		
		System.out.print("How many customers would you like to enter?: ");
		int number_of_customers = scan.nextInt();

		for(int i = 0; i < number_of_customers; i++) {
			System.out.println("Customer " + (i + 1) + ": ");
			//ask for customer information
			System.out.print("Please enter the customer name: ");
			names[i] = scan.next();
		}
		
		for(int i = 0; i < number_of_customers; i++) {
			
			//ask for customer id
			System.out.print("Please enter the customer id (5 digit number): ");
			id [i] = scan.nextInt();
		}
		
		for(int i = 0; i < number_of_customers; i++) {
			//ask for customer sales
			System.out.print("Please enter the customer sales(revenue): ");
			sales [i] = scan.nextDouble();
		}
		}
	//create method that will add a single customer
	public static void single_customer(String [] name, int [] id_2, double [] sales_2) {
			Scanner scan = new Scanner(System.in); //for user input
			
			for(int i = 0; i < 1; i++) {
				//ask for customer name
				System.out.print("Please enter the customer name: ");
				name[i] = scan.nextLine();
			}
			for(int i = 0; i < 1; i++) {
				//ask for customer id
				System.out.print("Please enter the customer id (5 digit number): ");
				id_2 [i] = scan.nextInt();
			}
			for(int i = 0; i < 1; i++) {
				//ask for customer sales
				System.out.print("Please enter the customer sales(revenue): ");
				sales_2 [i] = scan.nextDouble();
			}
	}
	//create method that will display all customers
	public static void display(String [] names, String [] name, int id[], int id_2[], double sales[], double [] sales_2) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Customer Data: ");
		//output customer info
		for(int i = 0; i < 2; i++) {
			System.out.print("Name: " + names[i] + " ");
			System.out.print("ID: " + id[i] + " ");
			System.out.println("Revenue: $" + sales[i] + " ");
		}
		for(int i = 0; i < 1; i++) {
			System.out.print("Name: " + name[i] + " ");
			System.out.print("ID: " + id_2[i] + " ");
			System.out.print("Revenue: $" + sales_2[i] + " ");
		}
		}
		
	//create method that will retrieve customer specific data
	public static void retrieve (String names[], int id[], int id_2[], double sales[]) {
		Scanner scan = new Scanner(System.in); //for user input
		//prompt the user for customer id
		
		for(int i = 0; i < 1; i++) {
		System.out.print("Please enter customer id (5 digit number): ");
		id[i] = scan.nextInt();
		
		int index = i;
		
		int a = 0;
		
		for(i = 0; i < 1; i++) {
			if(names[i] == names[i]) {
				i++;
			System.out.print("Customer: " + names[i] + " ID: " + id[index] + " Revenue: " + sales[i]);
		}
		}
		}
		}
	//create method that will display an exit message
	public static void exit() {
		System.out.print("Thank you for using the program!");
	}
	//create method that will retrieve customer with total sales based on range
	public static void retrieve_sales(String names[], String name[],int id[], int [] id_2,double sales[], double [] sales_2) {
		Scanner scan = new Scanner(System.in); //for user input
		int counter = 0;
		
		//prompt user for lowest total sales
		System.out.print("Please enter the lowest total sales: $");
		int min = scan.nextInt();
		
		//prompt user for highest total sales
		System.out.print("Please enter the highest total sales: $");
		int max = scan.nextInt();
		
		System.out.println("The sales that are within that range are:");
		
		for(int i = 0; i < 3 ;i++) {
			if(sales[i] >= min && sales[i] <= max) {
				int index = i;
				System.out.print("Name: " + names[i] + " ");
				System.out.print("ID: " + id[i] + " ");
				System.out.println("Revenue: $" + sales[i] + " ");
			}
			for(int a = 0; a < sales_2.length; a++) {
				if(sales_2[a] >= min && sales_2[a] <= max) {
				int index = a;
				System.out.print("Name: " + name[a] + " ");
				System.out.print("ID: " + id_2[a] + " ");
				System.out.println("Revenue: $" + sales_2[a] + " ");
				}
				
			}
		}
			}
		
	public static void main(String[] args) {
		
		//create scanner
		Scanner scan = new Scanner(System.in);
		
		// display the menu
		System.out.println("   \nMENU: ");
		System.out.println("1: Add multiple new customers");
		System.out.println("2: Add single new customer");
		System.out.println("3: Display all customers");
		System.out.println("4: Retrieve specific customer's data");
		System.out.println("5: Retrieve customers with orders based on range");
		System.out.println("9: Exit program");
		
		//prompt the user to enter their selection
		System.out.print("\nEnter your selection: ");
		int selection = scan.nextInt();
		
		//arrays
		
		String name [] = new String[1];
		
		String names[] = new String[100]; //max of 100 elements
		
		int id [] = new int [100]; // max of 100 elements
		
		int id_2 []= new int [1];
		
		double sales[] = new double[100]; //max of 100 elements
		
		double sales_2 [] = new double [1];
		
		if(selection == 1) {
			multiple_customers(names, id, sales);
		
				// display the menu
				System.out.println("   \nMENU: ");
				System.out.println("1: Add multiple new customers");
				System.out.println("2: Add single new customer");
				System.out.println("3: Display all customers");
				System.out.println("4: Retrieve specific customer's data");
				System.out.println("5: Retrieve customers with orders based on range");
				System.out.println("9: Exit program");
		
				//prompt the user to enter their selection
				System.out.print("\nEnter your selection: ");
				int selection_2 = scan.nextInt();
	
			if (selection_2 == 2) {
			single_customer(name, id_2, sales_2);
		
		// display the menu
		System.out.println("   \nMENU: ");
		System.out.println("1: Add multiple new customers");
		System.out.println("2: Add single new customer");
		System.out.println("3: Display all customers");
		System.out.println("4: Retrieve specific customer's data");
		System.out.println("5: Retrieve customers with orders based on range");
		System.out.println("9: Exit program");
		
		
		//prompt the user to enter their selection
		System.out.print("\nEnter your selection: ");
		int selection_3 = scan.nextInt();
		
		if(selection_3 == 3) {
			display(names,name, id,id_2, sales, sales_2);
			
			// display the menu
			System.out.println("   \nMENU: ");
			System.out.println("1: Add multiple new customers");
			System.out.println("2: Add single new customer");
			System.out.println("3: Display all customers");
			System.out.println("4: Retrieve specific customer's data");
			System.out.println("5: Retrieve customers with orders based on range");
			System.out.println("9: Exit program");
			
		
			
			//prompt the user to enter their selection
			System.out.print("\nEnter your selection: ");
			int selection_4 = scan.nextInt();
		
		if(selection_4 == 4) {
			retrieve(names, id, id_2, sales);
			
			// display the menu
			System.out.println("   \nMENU: ");
			System.out.println("1: Add multiple new customers");
			System.out.println("2: Add single new customer");
			System.out.println("3: Display all customers");
			System.out.println("4: Retrieve specific customer's data");
			System.out.println("5: Retrieve customers with orders based on range");
			System.out.println("9: Exit program");
			
			//prompt the user to enter their selection
			System.out.print("\nEnter your selection: ");
			int selection_5 = scan.nextInt();
		
		if(selection_5 == 5) {
			retrieve_sales(names, name, id, id_2, sales, sales_2);
			
			// display the menu
			System.out.println("   \nMENU: ");
			System.out.println("1: Add multiple new customers");
			System.out.println("2: Add single new customer");
			System.out.println("3: Display all customers");
			System.out.println("4: Retrieve specific customer's data");
			System.out.println("5: Retrieve customers with orders based on range");
			System.out.println("9: Exit program");
			
			//prompt the user to enter their selection
			System.out.print("\nEnter your selection: ");
			int selection_6 = scan.nextInt();
		
		if(selection_6 == 9) {
			exit();
		}

			
	}
		
		
		}
		}
		}
		}
	}
	}
	

		
	

	
	


