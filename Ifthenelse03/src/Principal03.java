import java.util.Scanner;

public class Principal03 {

	public static void main(String[] args) {

		// declaration des variables
		int codeSolde;
		double prixArticle, prixSolde;

		Scanner clavier = new Scanner(System.in);
		System.out.println(" Entrer le prix de l'article :");
		prixArticle = clavier.nextDouble();

		System.out.println(" entrer le code solde : 1 pour -20% , 2 pour -50% ou 3 pour -70 % ");
		codeSolde = clavier.nextInt();

		// calcul du prix soldé et affichage
		if (codeSolde == 1) {
			prixSolde = 0.8 * prixArticle;
			System.out.println(" le prix de l'article soldé a -20% est :  " + prixSolde + " € .");
		} else if( codeSolde == 2){
			prixSolde = 0.5 * prixArticle;
			System.out.println(" le prix de l'article soldé a -50% est :  " + prixSolde + " € .");
		}else {
			prixSolde = 0.3 * prixArticle;
			System.out.println(" le prix de l'article soldé a -70% est :  " + prixSolde + " € .");
			
		}
		clavier.close();

	}

}
