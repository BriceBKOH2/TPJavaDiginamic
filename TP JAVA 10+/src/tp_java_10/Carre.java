package tp_java_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Carre extends Rectangle {

	// See Class Rectangle
		
	// Constructor
	
	public Carre() {
		Random rand = new Random();
		
		longueur = rand.nextInt(VAL_MAX_RANDOM);
		largeur = longueur;
		origine = Point.getRandomPoint(); // Point d'origine pour les calculs
		basDroite = new Point (origine.getX()+longueur,origine.getY());
		hautGauche = new Point (origine.getX(),origine.getY()+longueur);
		hautDroite = new Point (origine.getX()+longueur,origine.getY()+longueur);
	}
		
	public Carre(Point origine, int longueur) {
		super(origine,longueur,longueur);					// Calling super() use Rectangle constructor
	}
	
	public Carre(Point origine, int longueur, int largeur) {
		super(origine,longueur,longueur);					// Calling super() use Rectangle constructor
	}
		
	// -- Methods --
		
		
		// Others
	
	public String getType() {
		return "CARRE";
	}	
	
	public String toString() {
		return ("[" + this.getType() + " "
				+ this.getPointBasGauche().toString()
				+ this.getPointBasDroite().toString()
				+ this.getPointHautGauche().toString()
				+ this.getPointHautDroite().toString()
				+ "]");
		
	}
	
		//Abstracts to define
	
			//  Class heritage : Figure
	
	public Collection<Point> getPoints() {
		Collection<Point> pointTabList = new ArrayList<Point> ();
		pointTabList.add(origine);
		pointTabList.add(basDroite);
		pointTabList.add(hautGauche);
		pointTabList.add(hautDroite);
		return pointTabList;
	}
	
			// Interface heritage : Surfacable (Heritage from Rectangle)
	
	public double surface () {
		return ((double)Math.pow(longueur, 2));
	}
}
