package ObjetetClasses;
public class Principale11 {

	public static void main(String[] args) {

		//constructeur d'initialisation
		Corpulence jean= new Corpulence();
		//constructeur d' initialisation 
		Corpulence pierre= new Corpulence(2, 70);
		
       System.out.println(pierre.getPoids());
       System.out.println(pierre.getTaille());
       jean.setPoids(200);
       System.out.println(jean.getPoids());
       System.out.println(jean.analyseImc());


		
		
		
	}

}
