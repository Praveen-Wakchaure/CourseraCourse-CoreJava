package week1.assessmentHomework1SimpleGame;
//package simplegame;
import java.util.Scanner;

/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing.  Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
*/
public class SimpleGame {

	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @param seconds to convert
	 * @return string for the converted seconds in the format: 23:59:59
	 * 
	 * Example(s): 
	 * - If input seconds is 1432, print and return output in the format: 0:23:52
	 * - If input seconds is 0, print and return output in the format: 0:0:0
	 * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
	 *   So if input seconds is -2, print and return: -1:-1:-1 
	 *   If input seconds is -3214, likewise print and return: -1:-1:-1
	 */
	public String convertTime(int seconds){
		// TODO: Your code goes here
		
		String output = null;
		
		if (seconds<0)
		{
			String negativeSecondOutput="-1:-1:-1";
			
			output=negativeSecondOutput;
			
			//System.out.println(negativeSecondOutput);
			
		}else if (seconds>=0) {
			int hours = seconds/3600;
			
			int hoursRemender = seconds%3600;
			
			int minutes = hoursRemender/60;
			
			int minutsRemender = hoursRemender%60;
			
			int second = minutsRemender;
			
			String output1 =hours+":"+minutes+":"+second;
			
			output=output1;
			
			//System.out.println(output1);
			
		}else {
			System.out.println("Invalid Input");
		}
		return output;
		
	}

	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 * @return integer in which all the digits in the given non-negative integer are added.
	 * 
	 * Example(s): 
	 * - If input is 565, print and return 16.
	 * - If input is 7, print and return 7.
	 * - If input is 0, print and return 0.
	 */
	public int digitsSum(int input){
		// TODO: Your code goes here
		
		int output = 0;
		int b =0;
		for(int i=0;input!=0;i++) {
			
			int a = input%10;
			
			b=b+a;
			
			a=input/10;
			
			input=a;
			
			output=b;
		}
		
		System.out.println(output);
		
		return output;
	}
	
	public static void main(String[] args) {
		
		// Create an instance of the SimpleGame class.
		// TODO: Your code goes here
		
		SimpleGame sg = new SimpleGame();
		
		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.
		
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
		
		// TODO: Your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which game you want to play?");
		System.out.println("Press 1 for Time Converting game");
		System.out.println("OR");
		System.out.println("Press 2 for digit sum game");
		
		int game = sc.nextInt();
		
		if(game==1)
		{
			System.out.println("Enter the value of Seconds:");
			
			int seconds = sc.nextInt();
			
			sg.convertTime(seconds);
			
		}else if (game==2){
			
			System.out.println("Enter the digit");
			
			int input = sc.nextInt();
			
			sg.digitsSum(input);
			
		}
		sc.close();
	}	
}