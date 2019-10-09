package tp_java_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Rectangle extends Figure {
	
	// Attributes de la classe : Origine point is basGauche (bottom left) inherited by Parent class Figures


	protected Point basDroite;
	protected Point hautGauche;
	protected Point hautDroite;
	protected int longueur;
	protected int largeur;
	
	// Constructors
	
	public Rectangle() {
		Random rand = new Random();
		
		longueur = rand.nextInt(VAL_MAX_RANDOM);
		largeur = rand.nextInt(VAL_MAX_RANDOM);
		origine = Point.getRandomPoint(); // Origine point for calculation
		basDroite = new Point (origine.getX()+largeur,origine.getY());
		hautGauche = new Point (origine.getX(),origine.getY()+longueur);
		hautDroite = new Point (origine.getX()+largeur,origine.getY()+longueur);
	}
	
	public Rectangle(Point origine, int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.origine = new Point(origine.getX(),origine.getY()); // Origine point for calculation
		basDroite = new Point (origine.getX()+largeur,origine.getY());
		hautGauche = new Point (origine.getX(),origine.getY()+longueur);
		hautDroite = new Point (origine.getX()+largeur,origine.getY()+longueur);
		
	}
	
	// -- Methods --
	
		// Getters
	
	public Point getPointBasGauche() {
		return origine;
	}
	
	public Point getPointBasDroite() {
		return basDroite;
	}
	
	public Point getPointHautGauche() {
		return hautGauche;
	}
	
	public Point getPointHautDroite() {		
		return hautDroite;
	}
	
		// Others
	
	public String getType() {
		return "RECTANGLE";
	}	
	
	public String toString() {
		return ("[" + this.getType() + " "
		 		+ this.getPointBasGauche().toString()
		 		+ this.getPointBasDroite().toString()
				+ this.getPointHautGauche().toString()
				+ this.getPointHautDroite().toString()
				+ "]");
		
	}
	
//	protected void getRandomPoint() {
//		Random rand = new Random();
//		
//		origine = new Point(rand.nextInt(VAL_MAX_RANDOM),rand.nextInt(VAL_MAX_RANDOM)); // voir constructeur avec arguments => point d'origine
//		basDroite = new Point (origine.getX()+largeur,origine.getY());
//		hautGauche = new Point (origine.getX(),origine.getY()+longueur);
//		hautDroite = new Point (origine.getX()+largeur,origine.getY()+longueur);
//	}
	
	
		//Abstract to define
			
			//  Class heritage : Figure
	
	public Collection<Point> getPoints() {
		Collection<Point> pointTabList = new ArrayList<Point> ();
		pointTabList.add(origine);
		pointTabList.add(basDroite);
		pointTabList.add(hautGauche);
		pointTabList.add(hautDroite);
		return pointTabList;
	}
	
	public boolean couvre(Point p) {
		for(Point testPoint : this.getPoints()) {
			if (!testPoint.equals(p)) {
				return false;
			}
		}
		return true;
	}
	
			// Interface heritage : Surfacable
	
	public double surface () {
		return ((double)longueur * largeur);
	}
	
}
