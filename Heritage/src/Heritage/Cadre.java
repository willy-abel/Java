package Heritage;
public class Cadre extends Employer {
	// declaration de variables
	private double prime;
	
	public Cadre(String cNom, double cSalaire, double cPrime) {
		super(cNom ,cSalaire);
		prime=cPrime;
	}

	@Override
	public double getSalaire() {
		return super.getSalaire()+ prime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cadre [nom=" + super.getNom() + ", salaire=" + this.getSalaire() + "]";
	}
	

}
