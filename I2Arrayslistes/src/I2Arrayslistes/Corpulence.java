package I2Arrayslistes;

import java.util.Objects;

public class Corpulence {
	private static final boolean True = false;
	private static final boolean False = false;
	private static final String Else = null;
	//variables d'instance
	private String nom; 
	private int taille;
	private int poids;
	

	public Corpulence(String pNom, int ptaille, int ppoids) {
		// constructeur d'initialisation 
		nom= pNom;
		taille = ptaille;
		poids = ppoids;
	}
	
	
	public int hashCode() {
		return Objects.hash(nom, poids, taille);
	}

	public boolean equals(Corpulence obj) {
		if(obj.nom== this.nom && obj.taille == this.taille && obj.taille == this.taille) {
			return true;
		}else{
			return false;
		}
		
	}

	public String toString() {
		return "Corpulence [nom=" + nom + ", taille=" + taille + ", poids=" + poids + ", analyseImc()=" + analyseImc()
				+ "]";
	}
	//getter 
	public int getTaille() {
		return taille;
	}
	
	public int getPoids() {
		return poids;
	}
	// setter
	public void setTaille(int ptaille) {
		if(ptaille >= 0) {
			taille=ptaille;		
		}else {
			System.out.println(" la taille doit etre un nombre positive");
		}
		
	}
	public void setPoids(int pPoids) {
		if(pPoids >= 0) {
			poids=pPoids;		
		}else {
			System.out.println(" la taille doit etre un nombre positive");
		}
	}
	
	
	//Méthode qui calcule l'imc de l'objet courant
	private int calculImc(){
		int imc;
		if (poids<=0 || taille<=0){
			imc = 0;
		}else{
			imc = (int)( 10000 * poids/(double)(taille * taille));
		}
		return imc;
	}

	//Méthode qui analyse l'imc de l'objet courant
	public String analyseImc() {
		int imc = this.calculImc();
		String str = new String();
		if (imc < 16) {
			str = "Anorexie";
		} else if (imc >= 16 && imc < 20) {
			str = "maigreur";
		} else if (imc >= 20 && imc < 26) {
			str = "corpulence normale";
		} else if (imc >= 26 && imc < 30) {
			str = "surpoids";
		} else {
			str = "obésité";
		}
		return str;
	}

	
}

