package tp_java_10;

import java.util.Collection;
import java.util.HashSet;	// See getPoints method for explanation
import java.util.Iterator;
import java.util.Random;

public class FigureUtil {
	
	protected static final int VAL_MAX_RANDOM = 26; // Used mostly to get random int between 0 and 25
	
	// -- Methods --
	
	// Others
	public static Rond getRandomRond() {
		Random rand = new Random();
		
		Rond rond = new Rond(Point.getRandomPoint(),rand.nextInt(VAL_MAX_RANDOM));
		return rond;
	}
	
	public static Rectangle getRandomRectangle() {
		Random rand = new Random();
		
		Rectangle rectangle = new Rectangle(Point.getRandomPoint(),
				rand.nextInt(VAL_MAX_RANDOM),
				rand.nextInt(VAL_MAX_RANDOM));
		return rectangle;
	}
	
	public static Carre getRandomCarre() {
		Random rand = new Random();
		
		Carre carre = new Carre(Point.getRandomPoint(),rand.nextInt(VAL_MAX_RANDOM));
		return carre;
	}
	
	public static Segment getRandomSegment() {
		Random rand = new Random();
		
		Segment resultat = new Segment(Point.getRandomPoint(), rand.nextInt(VAL_MAX_RANDOM), rand.nextBoolean());
		return resultat;
	}
	
	public static Figure getRandomFigure() {
		Random rand = new Random();
		
		switch(rand.nextInt(4)) {
		case 0 :
			return FigureUtil.getRandomRond();
		case 1 :
			return FigureUtil.getRandomRectangle();
		case 2 :
			return FigureUtil.getRandomCarre();
		case 3 :
			return FigureUtil.getRandomSegment();
		default :
			System.out.println("Erreur switch/case non supporté");
			return null;
		}
	}

	public static Figure getRandomSurfacable() {
		Random rand = new Random();
		
		switch(rand.nextInt(3)) {
		case 0 :
			return FigureUtil.getRandomRond();
		case 1 :
			return FigureUtil.getRandomRectangle();
		case 2 :
			return FigureUtil.getRandomCarre();
		default :
			System.out.println("Erreur switch/case non supporté");
			return null;
		}
	}
	
	public static Collection<Point> getPoints(Figure... figures) {
		Collection<Point> pointTab = new HashSet<Point>(); 	// We use HashSet because of how we implemented our constructors
															// since we only use X and Y value to create a new point and
															// not directly affect the point to origine, we have no duplicates
															// points in our collection of point. If this were to change
															// we should use ArrayList instead of HashSet.
		
		// Boucle remplissage du tableau de point
		for (int i = 0; i < figures.length ; i++) {
			pointTab.addAll(figures[i].getPoints());
		}
		
		return pointTab;
	}
	
	public static Collection<Figure> genere(int nombreFigure) {
		
		Collection<Figure> setFigures = new HashSet<Figure> ();
		
		// Filling Loop
		for (int i = 0; i < nombreFigure; i++) {
			setFigures.add(FigureUtil.getRandomFigure());
		}
		
		return setFigures;
	}
	
	public static Figure getFigureEn(Point pointArg, Dessin dessin) {
		Collection<Figure> figureCollec = dessin.getFigure();
		Iterator<Figure> iteratorFigure = figureCollec.iterator();
		Figure resultat;
		Figure figureStock;
		
		while(iteratorFigure.hasNext()) {			// Accessing Loop
			figureStock = iteratorFigure.next();
			
			
			if (figureStock.couvre(pointArg)) {		//Testing loop
				resultat=figureStock;
				return (resultat);
			}
		}	
		return null;
	}
	
}
