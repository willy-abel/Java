package Heritage;
public class Employer {
	
	// declaration des variables
	private String nom;
	private double salaire;
	
     public Employer(String eNom, double eSalaire) {
    	 nom = eNom;
    	 salaire= eSalaire;   	 
     }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", salaire=" + salaire + "]";
	}

	
     
     
}
