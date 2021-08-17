import java.util.ArrayList;

/**
 * Represent a customer with name, ID, and geography.
 * @author lbrandon
 *
 */
public class Customer {

	//static variables
	//shared across all instances of Customer
	
	/**
	 * Company for all customers.
	 */
	static final String COMPANY = "CVS";
	
	/**
	 * Store list of all customers.
	 */
	static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
	
	/**
	 * To generate and keep track of customer IDs.
	 */
	static Counter COUNTER;
	
	//instance vars
	
	/**
	 * Name of customer.
	 */
	String name;
	
	/**
	 * Geography of customer.
	 */
	String geography;
	
	/**
	 * ID of customer.
	 */
	int ID;
	
	//constructor
	
	public Customer(String name, String geography) {
		this.name = name;
		this.geography = geography;
		
		//get unique ID from counter
		this.ID = Customer.COUNTER.getCount();
		
		//increment counter
		Customer.COUNTER.increment();
		
		//adds this customer to list of all customers
		Customer.CUSTOMERS.add(this);
	}
	
	//methods
	
	/**
	 * Prints all customers for the company.
	 */
	public static void printAllCustomers() {
		System.out.println("All customers: ");
		
		//iterate over statically references list of customers
		for (Customer c : Customer.CUSTOMERS) {
			System.out.println(c);
		}
		
		System.out.println("\n");
	}
	
	/**
	 * Compares two customers for equality.
	 * If they have the same name and geography, they are equal.
	 */
	public boolean equals(Object obj) {
		
		//cast object to customer
		Customer otherCustomer = (Customer) obj;
		
		//compare name and geography for customers
		if ((this.name.equals(otherCustomer.name) && (this.geography.equals(otherCustomer.geography)))) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Returns ID, name of customer, and geography.
	 */
	public String toString() {
		return this.ID + ": " + this.name + ", Company: " + Customer.COMPANY + ", Location: " + this.geography;
	}
	
	/**
	 * Locates the given customer in the list of customers.
	 * @param customer to look up
	 * @return index of the given customer in the list, otherwise -1
	 */
	public static int findCustomer(Customer customer) {
		
		//set default index
		int index = -1;
		
		//iterate over customer list and locate given customer
		for (int i = 0; i < Customer.CUSTOMERS.size(); i++) {
			if (Customer.CUSTOMERS.get(i).equals(customer)) { //will call equals method in customer class
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	/**
	 * Removes the given customer from list of customers.
	 * @param customer to remove
	 */
	public static void removeCustomer(Customer customer) {
		
		//find the customer
		int removeIndex = Customer.findCustomer(customer);
		
		//check if index is valid, then remove customer
		if (removeIndex >= 0) {
			Customer.CUSTOMERS.remove(removeIndex);
		}
	}
	
	public static void main(String[] args) {
		
		//initialize the counter for generating unique IDs for each customer
		Customer.COUNTER = new Counter(1);
		
		//create customer
		Customer c1 = new Customer("chenyun", "Los Angeles");
		
		//print all customers
		Customer.printAllCustomers();
		
		//create customer
		Customer c2 = new Customer("huize", "NYC");
		
		//print all customers
		Customer.printAllCustomers();
		
		//create customer
		Customer c3 = new Customer("jeffrey", "Australia");
		
		//print all customers
		Customer.printAllCustomers();
		
		//remove customer
		Customer.removeCustomer(c1);
		
		//print all customers
		Customer.printAllCustomers();
		

	}

}
