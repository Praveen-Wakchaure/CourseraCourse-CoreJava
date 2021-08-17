package week1;

public class CharOperations {
	
	public static void main(String[] args) {
		
		//get a specific char
		
		String str = "city"; 
		char firstChar = str.charAt(2); //firstChar is ‘c’
		
		System.out.println(firstChar);
		
		//convert a String to an array of chars, use the ”toCharArray()” method of a String
		
		String myString = "hello";
		
		char [] arrayOfChar = myString.toCharArray();
		
		System.out.println(arrayOfChar);
		
		//To check whether a specified char value is a letter, use “Character.isLetter(char)”
		
		boolean isLetter = Character.isLetter('p');       //isLetter is true
		
		System.out.println(isLetter);     
		
		//To check whether a specified char value is uppercase, use “Character.isUpperCase(char)”

		boolean isUpperCase = Character.isUpperCase('T'); //isUpperCase is true
		
		System.out.println(isUpperCase);
		
		//To check whether a specified char value is lowercase, use “Character.isLowerCase(char)"
		
		boolean isLowerCase = Character.isLowerCase('t'); //isLowerCase is true
		
		System.out.println(isLowerCase);
		
		//To convert a character to uppercase, use “Character.toUpperCase(char)”
		
		char myChar = Character.toUpperCase('t'); //myChar is ‘T’
		
		System.out.println(myChar);
		
		//To convert a character to lowercase, use “Character.toLowerCase(char)”
		
		char myChar1 = Character.toLowerCase('T'); //myChar is ‘t’
		
		System.out.println(myChar1);
		
		// compare characters
		
		char myChar2 = 'a';
		char myChar3 = 'b';
		boolean compared = myChar2 < myChar3; 
		
		System.out.println(compared);
		
	
	}

}
