package tp_java_10;

import java.util.Collection;
import java.util.HashSet;	// see setFigures in Attributes for explanation 

public class Dessin {
	// Attributes
	
	HashSet<Figure> setFigures;	// We chose Hashset over other collection because we wont have duplicate on
								// the figures put on a future canevas, also it's not planned to have lots of insertion
								// or suppression in the list
	
	// Constructors
	
	public Dessin() {
		setFigures = new HashSet<Figure>();
	}
	
	public Dessin(Collection<Figure> figureCollec) {
		setFigures = new HashSet<Figure>();
		setFigures.addAll(figureCollec);
	}
	
	// -- Methods --
	
		// Getters
		
	public Collection<Figure> getFigure() {
		Collection<Figure> resultatFigures = new HashSet<Figure> ();
		resultatFigures = setFigures;
		return resultatFigures;
	}
	
		// Others
	
	public boolean add(Figure figure) {
		return setFigures.add(figure);
	}
	
	
}
