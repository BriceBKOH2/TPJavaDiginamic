package tp_java_10;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public class Rond extends Figure {
	
	// Attributes
	
	protected int rayon;
	// Constructors
	
	public Rond () {
		Random rand = new Random();
		
		origine = Point.getRandomPoint();
		rayon = rand.nextInt(VAL_MAX_RANDOM);
	}
	
 	public Rond (Point p, int r) {
		origine = new Point(p.getX(),p.getY());
		rayon = r;
	}
	
	
	// -- Methods --
 		
 		// Getters
 	
 	public int getRayon() {
 		return rayon;
 	}
 	
 		// Others
	
	public String getType() {
		return "ROND";
	}
	
	public String toString() {
		return "[" + this.getType() + " " + origine.toString() + " , " + rayon + "]";
	}
	
		//Abstracts to define
	
			//  Class heritage : Figure

	public Collection<Point> getPoints() {
		Collection<Point> pointTabList = new ArrayList<Point> ();
		pointTabList.add(origine);
		return pointTabList;
	}
	
	public boolean couvre(Point p) {
		Double distCentre_Point = Math.sqrt((Math.pow(p.getX()-origine.getX(), 2))+(Math.pow(p.getY()-origine.getY(), 2)));
		return (rayon >= distCentre_Point); // distCentre_Point calculates the diagonal segment formed by the rectangle with the two opposite side
											// origine and p (point put in argument, negative value gets positif by the ² so order doesnt matter
	}
	
			// Interface heritage : Surfacable
	
	public double surface () {
		return ((double)rayon * 2 * Math.PI);
	}
		
 }
