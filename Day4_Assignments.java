package assignments;

public class Day4_Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Input:
			Marks of 5 subjects (out of 100 each)
Conditions:
			1. Fail Condition
			If any subject < 33 â†’
			Result = Fail
			Grade = F

			2. If Pass (all subjects â‰¥ 33):
			Calculate percentage and print percentage
			Result=Pass
			and check grade on basis of percentage as
			Assign grade:
			Percentage	Grade
			â‰¥ 90	A+
			75â€“89	A
			60â€“74	B
			50â€“59	C
			33â€“49	D */
		int[] marks = {90,89,74,59,49,33};
		int total=0;
		boolean fail =false;
		System.out.println("Marks of 5 subjects (out of 100 each)");
		for (int i=0;i<5;i++) {
		System.out.println("subject"+ (i +1) +":"+ marks[i]);
		total+=marks[i];
		if (marks [i]<33) {
			fail =true;
		}
		
		double percentage =total/5.0;
			if(fail) {
				System.out.println("\nResult: Fail");
		}else {
			
			System.out.println("\nresult:Pass");
			System.out.println("percentage"+percentage + "%");
			
			if (percentage>=90) {
				System.out.println("Grade: A+");
			}else if (percentage>=89) {
				System.out.println("Grade: A");
			}else if (percentage>=74) {
				System.out.println("Grade: B");
			}else if (percentage>=59) {
				System.out.println("Grade: C");
			}else if (percentage>=49) {
					System.out.println("Grade: D");
			}else {
				System.out.println("Grade :F");
				
			
		}
			
		}
		
		

		}}}
