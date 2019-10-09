package tp_java_10;

import java.util.Collection;

public abstract class Figure {
	// Constants
	
	protected static final int VAL_MAX_RANDOM = 26; // Used mostly to get random int between 0 and 25
		
	// Attributes
		
	protected Point origine;
	
	// Constructors
	
	public Figure() {
		origine = Point.getRandomPoint();
	}
	
	public Figure(Point p) {
		origine = new Point(p.getX(),p.getY());
	}
	
	// -- Methods --
	
		// Getters
	
	public Point getPointOrigine() {
		return origine;
	}
	
		// Others
	
	public String getType() {
		return "FIGURE";
	}
	
	public String toString() {
		return "[" + this.getType() + origine.toString() + "]";
	}
	
	public void affiche() {
		System.out.println(this);
	}
	
	// Replaced by  static method getRandomPoint() from the Point class, calling methods : Point.getRandomPoint();
//	protected void getRandomPoint() {
//		Random rand = new Random();
//		
//		origine = new Point(rand.nextInt(VAL_MAX_RANDOM),rand.nextInt(VAL_MAX_RANDOM));
//	}
	
		// Abstract
	
	public abstract Collection<Point> getPoints();
	
	public abstract boolean couvre(Point p);
	
}
