package assignments;

public class Weekly_Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ðŸ”¹ Q1. Find Second Smallest Element

ðŸ‘‰ Steps:

Take an array of size 6
Traverse and find smallest
Traverse again to find second smallest
Handle case when all elements are same

ðŸ‘‰ Example:
[4, 2, 7, 2, 9, 1] */

		/*int []arr= {4, 2, 7, 2, 9, 1};
		int smallest =arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			if (arr[i]<smallest) {
				smallest =arr[i];
			}
		}
		for (int i=0;i<arr.length;i++) {
			if( arr[i]>smallest &&arr[i]<secondSmallest){
				secondSmallest =arr[i];
			}
		}
		if (secondSmallest ==Integer.MAX_VALUE) {
			System.out.println("No Second Smallest Element");
		}else {
			System.out.println("Second Smallest " +secondSmallest);}
				
			}
				
		


/*ðŸ”¹ Q2. Check if Array is Sorted

ðŸ‘‰ Steps:

Input array
Create method isSorted()
Check ascending order
Return true/false

ðŸ‘‰ Example:
[1, 2, 3, 4] â†’ true
[1, 3, 2] â†’ false*/


 
	int[]arr1= {1,2,3,4};
	int[]arr2= {1,3,2};
	System.out.println(isSorted(arr1));
	System.out.println(isSorted(arr2)); 
}
 public static boolean isSorted (int[]arr){
		
		for(int i=0;i< arr.length-1;i++ ) {
			if(arr[i]> arr[i+1]) {
				return false;
			}
		}
		return true;
	} 
	
		
		/*Q3. Move All Zeros to End

		ðŸ‘‰ Steps:

		Input array
		Move all 0s to end without changing order of others
		Do it in-place (no extra array)

		ðŸ‘‰ Example:
		[1, 0, 3, 0, 5] â†’ [1, 3, 5, 0, 0]*/
		
 public static void moveZeros(int[]arr) {
		int num=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]!=0) {
				int temp =arr[i];
				arr[i]= arr[num];
				arr[num]=temp;
				num++;
				
			}
		}
 }}
	
		


	
	




	


