package assignments;

public class Weekly_Assignment_4 {

	public static void main(String[] args) {
		/*✅ Q1. Fibonacci Series with Condition
		Write a Java program to:
			1.	Print Fibonacci series up to n terms 
			2.	Stop printing using break if any number in the series becomes greater than 100 
			👉 Example:
			Input: n = 10
			Output: 0 1 1 2 3 5 8 13 21 34 55 89 */
		/*int n =11;
		int num1 =0, num2 =1;
		int count =2;
		System.out.print(num1+" "+ num2+ " ");
		while(count<=n) {
			int next = num1+num2;
			if(next>100) {break;
			}
			System.out.print(next + " ");
			num1=num2;
			num2 =next;
			count++;
			
		}  */


	
	
	/* ✅ Q2. Prime Factors of a Number
Write a program to:
1.	Take a number n 
2.	Print all its prime factors 
3.	Do not print repeated factors (unique only) 
4.	Stop (break) if factor becomes greater than n/2 
👉 Example:
Input: n = 60
Output: 2 3 5 */
	/*int num=60;
	for(int i =2;i<=num/2;i++) {
			if (i>num/2)break;
			if (num%i==0) {
				System.out.println(i+" ");
				
				while (num%i ==0) {
					num=num/i;
				}
			}
	}
	


}*/
		String num="57243";
		String result ="";
		int pos =1;
		
		for (int i =num.length()- 1; i>=0;i--) {
			int digit =num.charAt(i) - '0';
			if(pos %2!=0) {
				if (digit<=4)digit *=2;
				}else {
					digit =1;
				}
			result =digit +result;pos ++;
			
		}
		System.out.println(result);
	
}}




