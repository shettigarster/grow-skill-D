package assignments;

class vehicle
{
	String brand;
	int speed;
	
	static String company = "AutoWorld Ltd";
	
	vehicle(String brand,int speed){
		
		this.brand=brand;
		this.speed=speed;
	}
	
	void run() {
		System.out.println("Vehicle is running");
	}
	final void engineType() {
		System.out.println("Engine Type :Standard Engine");
	}
	static void displayCompany() {
		System.out.println("Company:"+company);
	}
	
}
class Car extends vehicle {
	String fuelType;
	
	Car(String brand,int speed, String fuelType){
		super(brand,speed);
		this.fuelType =fuelType;
	}
	@Override
	void run() {
		System.out.println("Car is running smoothly");
	}
}


public class WeeklyAssignments7B {

	public static void main(String[] args) {
		
		 Car car = new Car("Hyundai",120, "Petrol");
		 System.out.println("Brand:"+ car.brand);
		 System.out.println("Speed:"+ car.speed);
		 System.out.println("Fuel Type:"+ car.fuelType);
		 
		 vehicle v= new vehicle("X",80);
		 v.run();
		 car.run();
		 
		 vehicle.displayCompany();
		 v.engineType();
		 System.out.println("Error: Cannot override final Method");
		 
		 String str = car.brand;
			StringBuilder reverse = new StringBuilder();
			String[]words =str.split(" ");
			for (String word:words)
			{
				StringBuilder sb =new StringBuilder(word);
				reverse = reverse.append(" ").append(sb.reverse());
			}
		
			String reverseReuslt=reverse.toString().trim();
			System.out.println(reverseReuslt);
			
			
			
			
		 
		 

	}

}
