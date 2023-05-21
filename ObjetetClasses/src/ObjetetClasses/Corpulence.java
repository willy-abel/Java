package ObjetetClasses;

public class Corpulence {
	//variables d'instance
	private int taille;
	private int poids;
	
	// constructeur par defaut
	public Corpulence() {
		taille = 1;
		poids = 0 ;
	}

	
	public Corpulence(int ptaille, int ppoids) {
		// TODO Auto-generated constructor stub
		taille = ptaille;
		poids = ppoids;
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
