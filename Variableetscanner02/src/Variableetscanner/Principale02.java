package Variableetscanner;
import java.util.Scanner;
public class Principale02 {
	// ce programme calcule le quotien de deux nombre
	public static void main(String[] args) {
		// declaration des variables 
		int  diviseur;
		double quotient, dividende;
		
		
		// saisir des valeurs au clavier
		Scanner clavier= new Scanner(System.in);
		// recuperation de la valeur du dividende saisie au clavier
		System.out.println("Entrer le dividende : ");
		dividende=clavier.nextDouble();
		
		// recuperation de la valeur du diviseur saisie au clavier
		System.out.println(" Entrer la vzleur du diviseur : ");
		diviseur=clavier.nextInt();
		
		
		//calcule du quotient des deux nombres
		
		 quotient = dividende/diviseur;
		 
		System.out.println(" le quotient de ces deux nombres est "+ quotient);
		clavier.close();
		
		
		

	}

}
