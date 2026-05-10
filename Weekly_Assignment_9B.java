package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mobile {
	String Model;
	String Brand;
	double Price;


public  Mobile(String Model,String Brand, double Price ) {
	this.Model =Model;
	this.Brand =Brand;
	this.Price =Price;
	
}
void display() {
	System.out.println(Model + ""+ Brand + "" + Price );
}
}

public class Weekly_Assignment_9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Mobile>mobiles=new ArrayList <>();
		mobiles.add(new Mobile("S23 ","Samsung ", 70000));
		mobiles.add(new Mobile("i15 ", "Apple ",  80000));
		mobiles.add(new Mobile("12 ","Oneplus " , 60000));
		mobiles.add(new Mobile("V30 ", "vivo  ",  35000));
		mobiles.add(new Mobile("GT  ","Realme ",  30000));
		
		System.out.println("Original Mobile:");
		for(Mobile m: mobiles) {
			
			m.display();
		}
		
		Collections.sort(mobiles,Comparator.comparingDouble((Mobile m)->m.Price).reversed());
		
		System.out.println("\n After sorting Descending :");
		
		for (Mobile m:mobiles) {
			m.display();
		}
		
         mobiles.remove(0);
         System.out.println("\n After Removing Most Expensive Mobile");
         for(Mobile m :mobiles) {
        	 m.display();
         }
         
         System.out.println("\nsearchresult");
         
         for(Mobile m:mobiles) {
        	 if(m.Brand.equalsIgnoreCase("vivo  ")) {
        		 System.out.println("Brand found :" + m.Brand);
        	 }
         }
         
         for(Mobile m:mobiles) {
        	 if(m.Brand.equalsIgnoreCase("Samsung ")) {
        		 m.Price =68000;
        	 }
         }
         System.out.println("\nAfter price update");
         for(Mobile m :mobiles) {
        	 m.display();
         }
         
         System.out.println("\n Final list:");
         for(Mobile m :mobiles) {
        	m.display();
         
         }
	}

}
