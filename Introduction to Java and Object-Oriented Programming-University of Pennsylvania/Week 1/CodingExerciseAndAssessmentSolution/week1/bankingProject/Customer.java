package week1.bankingProject;

/**
 * Represents a Customer of the bank
 * @author Praveen
 *
 */
public class Customer {
	
	//instance vars
	
	/**
	 * Name of Customer
	 */
	String name;
	
	/**
	 * Address of Customer
	 */
	String address;
	
	//Constructor
	
	/**
	 * Creates a customer with the given type
	 * @param name of customer
	 */
	public Customer(String name) {
		this.name = name;
	}
	
	//methods
	
	/**
	 * Sets the address of the customer to be given address
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Returns customer's name
	 * @return name of customer
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns customer's address
	 * @return address of customer's
	 */
	public String getAddress() {
		return this.address;
	}
	
	

}
