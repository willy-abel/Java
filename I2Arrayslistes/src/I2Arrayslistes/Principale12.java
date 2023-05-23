package I2Arrayslistes;

import java.util.ArrayList;

public class Principale12 {

	private static final boolean True = false;

	public static void main(String[] args) {
		
		ArrayList<Corpulence> patients = new ArrayList<Corpulence>();
		
		Corpulence patient1 = new Corpulence("vigny", 50, 20);
		patients.add(patient1);
		Corpulence patient2 = new Corpulence("Abel", 80, 10);
		patients.add(patient2);
		Corpulence patient3 = new Corpulence("willy", 90, 190);
		patients.add(patient3);	

       	// suppresion d'un élément dans la liste
       	
       	Corpulence patient4 = new Corpulence("Abel", 80, 10);
       	for(int i=0; i < patients.size(); i++) {
       		if(patient4.equals(patients.get(i))== true) {
           	patients.remove(i);		
   		}    		
	}
	for( int i = 0;i<patients.size();i++){
		System.out.println(patients.get(i).toString() + "\n");
	      }	
	
	}
}
