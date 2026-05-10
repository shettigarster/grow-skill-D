package assignments;


//Assignment 1: Book Management System using ArrayList

import java.util.ArrayList;



class Book {
	int bookId;
	String bookName;
	double price;
	
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	
	void display() {
		System.out.println(bookId+" "+ bookName+ " "+ price + " ");
	}
	
	
	
}
public class Weekly_Assignment_9A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book>books =new ArrayList<>();
		
		books.add(new Book (101, "Java",499));
		books.add(new Book (102, "Python",399));
		books.add(new Book (103, "SQL",299));
		books.add(new Book (104, "c++",599));
		
		System.out.println("Original List");
		for(Book b :books) {
			b.display();
			
			
		}
		
		books.removeIf(b->b.bookId==102);
		System.out.println("\nAfter Removing bookId 102");
		for(Book b : books) {
			b.display();
		}
		
		for(Book b : books) {
			if(b.bookId==103) {
				b.price=349;
			}
		}
		System.out.println("\nAfter Updating Price:");
		for(Book b: books) {
			b.display();
		}
		
		System.out.println("\nSearch result");
		for(Book b:books) {
			b.display();
			
			if (b.bookName.equalsIgnoreCase("Java")) {
				System.out.println("Book Found" + b.bookName);
			}
		}
		
		System.out.println("\nFinal List");
		for(Book b:books) {
			b.display();
		}

	}

}
