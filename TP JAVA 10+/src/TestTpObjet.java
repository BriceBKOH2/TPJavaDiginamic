import java.util.Collection;

import tp_java_10.*;

public class TestTpObjet {

	public static void main(String[] args) {
		
		Collection<Figure> f = FigureUtil.genere(1000);
		Dessin dessing = new Dessin(f);
		Point p = new Point(50,50);
		
		FigureUtil.getFigureEn(p, dessing).affiche();

	}

}
