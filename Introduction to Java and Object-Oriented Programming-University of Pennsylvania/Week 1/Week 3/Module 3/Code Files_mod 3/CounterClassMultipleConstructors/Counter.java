/**
 * Represents a counter.
 * @author lbrandon
 *
 */
public class Counter {
	
	//instance vars
	
	/**
	 * Internal count.
	 */
	int count;
	
	//constructors
	
	/**
	 * Creates a counter and starts internal count at given start value.
	 * @param start
	 */
	public Counter(int start) {
		this.count = start;
	}
	
	/**
	 * Creates a counter and starts internal count at 0.
	 */
	public Counter() {
		this.count = 0;
	}

	public static void main(String[] args) {
	
		Counter counter1 = new Counter(2);
		System.out.println(counter1.count);
		
		Counter counter2 = new Counter();
		System.out.println(counter2.count);

	}

}
