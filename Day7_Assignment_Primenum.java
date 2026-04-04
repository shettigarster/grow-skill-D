package assignments;

public class Day7_Assignment_Primenum {

	public static void main(String[] args) {
 /*write a program to check if a number is prime or not
Eg   21 not prime,7  prime,39  not prime*/
		
		int num1=21;
		int num2=7;
		int num3 =39;
		
		boolean flag =true;
		if (num1<=1) {
			flag =false;
		}else {
			for(int fact =2;fact <=Math.sqrt(num1);fact++)
			{ if (num1%fact ==0) {
				flag =false;
				break;
			}
		}}
		if (flag)
			System.out.println(num1 + "Prime");
		else
			System.out.println(num1+ "Not Prime");
	
boolean flag1 =true;
if (num2<=1) {
	flag1 =false;
}else {
	for(int fact1 =2;fact1 <=Math.sqrt(num1);fact1++)
	{ if (num2%fact1 ==0) {
		flag1 =false;
		break;
	}
	}
}
if (flag1)
	System.out.println(num2 + "Prime");
else
	System.out.println(num2+ "Not Prime");
	

boolean flag2 =true;
if (num3<=1) {
	flag2 =false;
}else {
	for(int fact2 =2;fact2 <=Math.sqrt(num3);fact2++)
	{ if (num3 %fact2 ==0) {
		flag2 =false;
		break;
	}
	}
}
if (flag2)
	System.out.println(num3 + "Prime");
else
	System.out.println(num3+ "Not Prime");
	}}
	
		
			
