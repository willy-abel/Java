package O5boucle;

import java.util.Scanner;

public class Principal05 {

	public static void main(String[] args) {

		int nombreAnnee = 0, i;
		double tauxInteret, capitalInitiale, capitalFinal;
		// recupera du capital initial
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
		   

		for(i =1; i<= nombreAnnee; i++ ) {
			capitalFinal=(1+ tauxInteret/100)*capitalFinal;
			
		}
		System.out.println(" les interets acquis au bout de " + nombreAnnee+ " ans sont de :");
        System.out.printf("%2.6f", capitalFinal-capitalInitiale);
        System.out.print(" €");
        clavier.close();
	}

}
