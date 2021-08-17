import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter; //declare Counter for testing
	
	@BeforeEach
	void setUp() throws Exception {
		this.counter = new Counter(); //initialize counter before every test method
	}

	@Test
	void testIncrement() {
		//calling increment the first time should return 1
		assertTrue(this.counter.increment() == 1);
		
		//calling increment again should return 2
		assertTrue(this.counter.increment() == 2);
		
		//call increment third time
		this.counter.increment();
		
		//calling increment a third time should not return a count of 2
		assertFalse(this.counter.getCount() == 2, "should not return 2 after calling increment a third time.");
		
		//expects 3 when calling getcount
		assertEquals(3, this.counter.getCount());
		
		//calling increment again should not return 3
		assertNotEquals(3, this.counter.increment());
	}

	@Test
	void testDecrement() {
		
		//calling decrement the first time should return -1
		assertEquals(-1, this.counter.decrement());
		
		//calling decrement again returns -2
		assertTrue(this.counter.decrement() == -2);
		
		//call decrement a third time
		this.counter.decrement();
		
		//calling decrement 3 times should not return -2
		assertFalse(this.counter.getCount() == -2, "should not return -2 after calling decrement again.");
		
		//calling getcount should return -3
		assertTrue(this.counter.getCount() == -3);
		
		
		
		
		
		
	}

}
