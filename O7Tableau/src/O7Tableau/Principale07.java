package O7Tableau;

import java.util.Scanner;

public class Principale07 {

	public static void main(String[] args) {
		// learn array
		
		int nombreAnnee=0 , i=0;
		double tauxInteret=0. , capitalInitiale=0.,capitalFinal=0.;
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Quel est le montant du capital à placer (en €)?? ");
		capitalInitiale = clavier.nextDouble();
		
		// nombre d annee de placement du capital
		System.out.print("Combien d'année le capital vas -t- il etre placé? ");
		   nombreAnnee=clavier.nextInt();
		   //
			System.out.print("Quel est le taux d'interet au placement");
			
			tauxInteret=clavier.nextInt();
			
			capitalFinal=capitalInitiale;
			
			//tableau servant à creer les taux d'interet 
			  double tabInterets[] = new double[nombreAnnee];
			  
			  for(i=0; i<tabInterets.length ;i++) {
				  
					capitalFinal=(1+ tauxInteret/100)*capitalFinal;
                    
					tabInterets[i]=capitalFinal-capitalInitiale;
					System.out.println(" les interets acquis au bout de "+ (i+1) +" an(s) sont de   ");
			        System.out.printf("%2.6f", tabInterets[i]);
			        System.out.print("€");
				 
			  }
			  clavier.close();
			  
		   
		
		

	}

}
