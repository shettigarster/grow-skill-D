package assignments;


//Salary calculation Using this keyword

class employee 
{
	int id ;
	String name;
  double basicSalary;
  
  employee(int id,String name,double basicSalary)
  {
  	this.id = id;
  	this.name =name;
  	this.basicSalary =basicSalary;
  }
  
  double calculateSalary() {
  	double hra =0.20*basicSalary;
  	double bonus= 0.10*basicSalary;
  	double totalSalary = basicSalary+hra+bonus;
  	return totalSalary;
  }
  
  void display() {
  	System.out.println("Employee ID :" + id);
  	System.out.println("Employee Name :"+ name);
  	System.out.println("Employee Basic Salary :"+ basicSalary);
  	System.out.println("Employee Total Salary:" + calculateSalary());
  }}
  
  public class WeeklyAssignments6A {
      public static void main(String[] args) {
      	employee emp1 = new employee(101,"Rahul",50000);
      			emp1.display();
      }
}




