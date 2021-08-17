package week1;

/**
 * My First Java Class
 * @author Praveen
 *
 */

public class FirstClass {
	
	/**
	 * This is the main method
	 * @param args
	 */

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		/*
		 * String and Character 
		 */
		
		String str = "city";
		
		char chr = 'c';
		
		String str1 = str +500;  //String with int 
		
		String str2 = chr + "";  //String with char
		
		System.out.println(str1);
		System.out.println(str2);
		
		/*
		 * Math Operation
		 */
		
		System.out.println("3th power of 5: " + Math.pow(5, 3));
		
		System.out.println(4/6);
		
		/*
		 * String Operation
		 */
		
		String myName = "Ämit" + "" + "Shah";
		
		myName.toUpperCase();
		
		System.out.println(myName);
		
		/*
		 * Conditionals and Loops
		 */
		
		if(6!=7) {
			System.out.println("not equals");
		}
		
		/*
		 * Casting
		 */
		
		//int to String
		
		String intToString = Integer.toString(1);
		
		System.out.println(intToString +"  "+intToString.getClass());
		
		/*
		 * Quiz
		 */
		
		//int num = 6.7; 
		
		System.out.println(5>3);
		
		String a = "Hello"; 
		char b = '!'; 
		int c = 0; 
		System.out.println(a + b + c); 

	}

}
