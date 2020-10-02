package Question02;

import java.util.ArrayList;

public class GenericPerson {
	
	public void displayElements(ArrayList <? extends IPerson> list) {
		
		for (IPerson iPerson : list) {
			System.out.println(iPerson.displayDetails());
		}
	}
}
