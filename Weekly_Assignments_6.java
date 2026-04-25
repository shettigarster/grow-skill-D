package assignments;

//Problem Statement 1

 class person
{
  String name ="Deekshith";
  int age = 38;
  person(String name, int age)
  {
	  this.name =name;
	  this.age=age;
  }

}

class student extends person
{
	int marks;
	
	student(String name,int age,int marks)
	{
		super(name,age);
		this.marks =marks;
	}

	void print ()
	
	{
		System.out.println("Name :"+ this.name + "   Age :" + this.age + "  Marks:" + this.marks);
		
	}
}


public class Weekly_Assignments_6 {

	public static void main(String[] args) {
		
		student s1 = new student( "Deekshith",38,90);
		s1.print();

	}

}   


