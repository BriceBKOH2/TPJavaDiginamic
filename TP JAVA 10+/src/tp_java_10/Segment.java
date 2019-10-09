package tp_java_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Segment extends Figure {
	
	// Attributes
	
	protected Point finSegment;
	protected int longueur;
	protected boolean estHorizontal;

	// Constructors 
	
	public Segment() {
		Random rand = new Random();
		
		longueur = rand.nextInt(VAL_MAX_RANDOM);
		estHorizontal = rand.nextBoolean();
		origine = Point.getRandomPoint();
	}
	
	public Segment(Point debut, int longueur, boolean horizontal) {
		this.longueur = longueur;
		estHorizontal = horizontal;
		origine = new Point(debut.getX(), debut.getY());
		
		if (estHorizontal) {
			finSegment = new Point(origine.getX() + longueur, origine.getY());
		}
		else {
			finSegment = new Point(origine.getX(), origine.getY() + longueur);
		}
	}
	
	// Methods
	
		// Getters
	
	public Point getFinSegment() {
		return finSegment;
	}
	
		// Others
	
	public String getType() {
		return "SEGMENT";
	}
	
	
	public String toString() {
			return "[" + this.getType()+ " " + origine.toString() + " à " + finSegment.toString() + "]";
	}
	
		//Abstract to define
	
			// Class heritage : Figure

	public Collection<Point> getPoints() {
		Collection<Point> pointTabList = new ArrayList<Point> ();
		pointTabList.add(origine);
		pointTabList.add(finSegment);
		return pointTabList;
	}
	
	public boolean couvre(Point p) {
		// A DEFINIR !
		return false;
	}
	
}
