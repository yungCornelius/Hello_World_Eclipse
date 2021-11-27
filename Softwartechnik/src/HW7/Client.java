package HW7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Client{
	
public static void main(String[] args) {
		
	CostCalculator cC = new CostCalculator();
	PackingInstructor pI = new PackingInstructor();

		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItmes.addAll(namesList);
        
        
        java.util.Iterator<HouseholdItem> i1 = householdItmes.iterator();


        while (i1.hasNext()) {
        	HouseholdItem temp = i1.next();
        	System.out.print("Total cost for " + temp.getName() + " is: ");
        	cC.getCosts(temp);
        	System.out.println("");
        }
		
        System.out.println("");

        java.util.Iterator<HouseholdItem> i2 = householdItmes.iterator();
        
        while (i2.hasNext()) {
        	HouseholdItem temp = i2.next();
        	System.out.println(temp.getName() + ":");
        	pI.getPackingInstructions(temp);
        }
  
}

}
