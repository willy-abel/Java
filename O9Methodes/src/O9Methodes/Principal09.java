package O9Methodes;

import java.util.Scanner;

public class Principal09 {
	// methodes qui calcule le prix solde
	static double calculAfficherPrixSolde(double prixArticle, double tauxSolde) {
		double prixSolde;
		prixSolde = (1 - tauxSolde / 100) * prixArticle;
		return prixSolde;

	};

	public static void main(String[] args) {
		
		double prixArticle=0. , tauxSolde = 0. ;

		Scanner clavier= new Scanner(System.in);
		
		System.out.println(" Pour saisir une valeure decimal au clavier , bien vouloir utiliser la virgule");
		System.out.println(" Entrer le prix de l'article non soldé ");
		prixArticle= clavier.nextDouble();
		
		System.out.println(" Entrer le pourcentage de reduction ");
		tauxSolde=clavier.nextDouble();
		clavier.close();
		; // appel de la fonction
		System.out.println("le prix de l'article soldé est :" + calculAfficherPrixSolde(prixArticle, tauxSolde) + " €.");

	}

}
