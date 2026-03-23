package day1;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A student scored 87.6 marks in an exam (stored in a float). Perform the following operations:

			Convert the float marks into:
			double
			int
			Print all three values.
			Convert the final integer value into a character using ASCII and print it.*/
		
		float marks =87.6f;
		double marksDouble =marks;
		int marksInt=(int)marks;
		char asciiChar =(char)marksInt;
		System.out.println("Float "+marks);
		System.out.println("Double "+marksDouble);
		System.out.println("Integer Value "+marksInt);
		System.out.println("ASCII Value "+ asciiChar);
		
		
		/*Problem Statement:
			Write a Java program that:

			Takes a character input from the user (e.g., 'A').
			Finds and prints its ASCII value.
			Adds 5 to the ASCII value.
			Converts the new value back to a character and prints it.*/
		
		char alpha = 'A';
		int value =alpha;
	
		System.out.println("ASCII Value "+value );
		int value1 =value+5;
		System.out.println(value1);
		char newChar = (char)value1;
		System.out.println(newChar);
		
		
		
		

		
		

		

	}

}
