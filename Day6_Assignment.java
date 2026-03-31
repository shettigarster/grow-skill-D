package assignments;

public class Day6_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to check Armstrong 
		int number =153;
		int ActualNumber =number;
		int sum=0;
	
		while (number>0) {
			int digit =number%10; //last digit
			sum+= digit*digit*digit; //cube addition
			number=number/10; //last digit removing
		}
			if (sum==ActualNumber) {
				System.out.println(ActualNumber + " Is Armstrong Number");
			}else {
				System.out.println(ActualNumber + "Not an Armstrong number");
			}
		}
	}
