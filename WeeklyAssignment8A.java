package assignments;

public class WeeklyAssignment8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You are given a list of strings. Write a Java program to find the longest common prefix among all the strings.
		//If there is no common prefix, return an empty string "".
		//Input: ["flower", "flow", "flight"], Input: ["dog", "racecar", "car"] , Input: ["interview", "internet", "internal", "interval"]
		
		String longest = "";
		String []words1 = {"flower", "flow", "flight"};
		//String []words2 = {"dog", "racecar", "car"};
		//String []words3 = {"interview", "internet", "internal", "interval"};
		int index =0;
		int flag =0;
		String current1 = "";
		//String current2 = "";
		//String current3 = "";
		
		String word1= words1[0];
		//String word2= words2[0];
		//String word3= words3[0];
		
		
		while(index<word1.length()) {
			current1 =current1 +word1.charAt(index);
			//while(index<word2.length()) {
				//current2 =current2 +word2.charAt(index);
				//while(index<word3.length()) {
					//current3 =current3 +word3.charAt(index);
			for(int i =0; i<=words1.length-1; i++)
				//for(int j =0; i<=words2.length-1; j++)
					//for(int k =0; i<=words2.length-1; k++)
			{
				String username1 = words1[i];
				//String username2 = words1[j];
				//String username3 = words1[k];
				if(username1.startsWith(current1))
					//if(username2.startsWith(current2))
						//if(username3.startsWith(current3))
				{
					
				}
				else {
					flag=1;
					break;
				}
				
			}
			if(flag==0)
				longest =current1;
			index++;
			
		}
if( longest.isEmpty())
System.out.println("No common Prefix");
	
else 
	System.out.println("Longest");
	}

		
		

	}