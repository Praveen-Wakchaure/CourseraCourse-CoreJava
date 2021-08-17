/**
 * Represent a person.
 * @author lbrandon
 *
 */
public class Person {

	//instance variables
	
	/**
	 * Name of person.
	 */
	String name;
	
	/**
	 * Age of person.
	 */
	int age;
	
	/**
	 * Creates a person with given name and age.
	 * @param name of person
	 * @param age of person
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Compares instances of person based on name.
	 * If two people have the same name, they are equal.
	 */
	public boolean equals(Object something) {
		
		//cast given object to Person
		Person otherPerson = (Person) something;
		
		//returns true if names of two people are the same
		//case sensitive
		return this.name.equals(otherPerson.name);
	}
}
