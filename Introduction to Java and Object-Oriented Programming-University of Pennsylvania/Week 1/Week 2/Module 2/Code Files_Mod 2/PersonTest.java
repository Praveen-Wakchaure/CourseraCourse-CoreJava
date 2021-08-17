import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person person1 = new Person("Ted", 22);
		Person person2 = new Person("ted", 22);
		
		//assertEquals uses == to compare primitives
		//let's compare the ages of person1 and person2
		assertEquals(person1.age, person2.age);
		
		//assertEquals uses equals method implemented in person class
		assertNotEquals(person1, person2);
		
		Person person3 = new Person("Ted", 34);
		
		assertEquals(person1, person3);
	}

}
