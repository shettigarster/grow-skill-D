package assignments;

public class Day8_AssignmentFactorialnumber {
	
	//Finding factorial number 

	public static void main(String[] args) {
		/*int num=5;
		int fact =1;
		
		for(int i=1; i<=num;i++) {
			fact =fact* i;
		}
		
System.out.println("Factorial:" +fact);
	} */
		
int num=7;
int sum =0;
for(int i=1;i<=num/2;i++) {
	if (num%i==0) {
		sum= sum+i;
	}}

if (sum ==num) {
	System.out.println(num + " is perfect Number");
}else {
		System.out.println(num + " is not a perfect Number");
	}
}
	}

	
	

