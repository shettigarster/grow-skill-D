package assignments;

public class Day5_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i =1;	
	while(i<=50) {
		if(i% 2==0 && i%5==0) {
			System.out.println(i*i);
		}else if (i%2==0) {
			System.out.println(i*i*i);
		}else if(i%5==0) {
			System.out.println(i*5);
		}else {
			System.out.println(i);
			
		}
	
	
		i++;	
}}}

	
