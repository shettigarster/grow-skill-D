package assignments;

class book{
	
	String title;
	String author;
	
	static String libraryName ="City Library";
	final int ISBN =12345;
	
	book(String title,String author)
	{
		this.title =title;
		this.author =author;
		
		
		}
	
	void display() {
		System.out.println("Title :" + title);
		System.out.println("Author:" + author);
		
		
	}
	
	String getDescription() {
		return "This is a Physical Book";
			}
	static void showLibrary() {
		System.out.println("Library:"+ libraryName);
	}
}
class ebook extends book{
	String fileSize;
	ebook(String title,String author,String fileSize){
		super(title, author);
		this.fileSize =fileSize;
		
	}
	
	
	
	void display() {
		super.display();
		System.out.println("Filesize :" + fileSize);
	}
	
	String getDescription() {
		return "This is an Elctronic book";	}
}


public class WeeklyAssignments7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ebook book =new ebook("Automic Habit","James clear", "5MB");
book.display();
	

	book b = new book("X","Y");
	
	
	System.out.println(b.getDescription());
	System.out.println(book.getDescription());
	
	book.showLibrary();
	//b.ISBN =9999;
	System.out.println("ISBN :"+ b.ISBN);
	
	
	
}}
