package assignments;
import java.io.*;
import java.util.Scanner;

public class Weekly_Assignment_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter File Name:");
        

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        String longestWord = "";

        try {
        	String fileName = null;
			FileReader fr = new FileReader("C:\\Users\\User\\OneDrive\\Documents\\data.txt");
        	BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                lineCount++;
                charCount += line.length() + 1;

                String[] words = line.split("\\s+");

                wordCount += words.length;

                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            br.close();

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Longest Word: " + longestWord);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
