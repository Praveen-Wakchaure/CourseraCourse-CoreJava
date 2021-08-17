package week1;

public class Casting {
	
	public static void main(String[] args) {
		
		//----Integer to String-----//
		
		int num = 0;
		
		String str = Integer.toString(num);
		
		String str2 = String.valueOf(num);
		
		System.out.println(str);
		System.out.println(str2);
		
		
		//---------String to Integer-----------------//
		
		String str1 = "0";
		
		int num1 = Integer.parseInt(str1);
		
		System.out.println(num);
	}

}
