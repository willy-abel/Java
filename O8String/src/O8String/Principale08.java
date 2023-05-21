package O8String;

import java.util.Scanner;

public class Principale08 {

	public static void main(String[] args) {
       // variables
		int n = 1 ;
		String motDePasse = new String(); // creation d'un objet String
		
		Scanner clavier= new Scanner(System.in);
		
		
		while ( motDePasse.equals("SeSaMe")== false && n < 4 ) {
			System.out.println(" Entrer le mot de passe :");// saisie de mot de passe 
			motDePasse = clavier.next();
			n++; // incrementation du compteur d'essais
		}
		
		if(motDePasse.equals("SeSaMe")){
			System.out.print(" Merci.  vous pouvez entrer. ");
			
		}else {
			System.out.print(" l' alarme va etre declenchée");
		}
		clavier.close();
		
	}

}
