package tp_java_10;

import java.util.Random;

public class Point {
	
	// Constants
	
	protected static final int VAL_MAX_POINT = 75;
	
	// Attributes
	
	private int x ;
	private int y ;
	
	// Constructors
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// -- Methods --
	
		// Getters
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
		// Others
	
	public String toString() {
		return "[" + x + ";" + y + "]";
	}
	
	public void affiche() {
		System.out.println(this);
	}
	
	public boolean equals (Point p) {
		return ( (x == p.getX()) && (y == p.getY()) );
	}

	public static Point getRandomPoint() { 	// Method to create a new point, static to avoid having to create a new point object
		Random rand = new Random();		   	// exemple : Rond r = new Rond (Point.getRandomPoint(),5);
										 	// instead of Point p = new Point(); p.getRandomPpoint(); Rond r = new Rond (p,5);
		
		return new Point(rand.nextInt(VAL_MAX_POINT),rand.nextInt(VAL_MAX_POINT));
	}
	
}
