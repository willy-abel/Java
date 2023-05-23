package Heritage;

import java.util.ArrayList;

public class Principale12 {

	public static void main(String[] args) {
		
		ArrayList<Employer> salarie= new ArrayList<Employer>();
		
		Employer salarie1 = new Employer(" willy abel ", 200);
		salarie.add(salarie1);
		
		Employer salarie2 = new Employer(" vigny Moricelle ", 250);
		salarie.add(salarie2);
		
		Cadre cadre1 = new Cadre(" Yannick Cedrick ", 300, 50);
		salarie.add(cadre1);
		
		for(int i=0; i< salarie.size(); i++) {
			System.out.println(salarie.get(i).toString()+"\n ");
		}
		
		for(int i=0; i< salarie.size(); i++) {
			if(salarie.get(i).getSalaire()< 230) {
				
				System.out.println(salarie.get(i).getNom()+" n'est pas cadre dans cettte entreprise \n ");
			}
			
		}
		
	}

}
