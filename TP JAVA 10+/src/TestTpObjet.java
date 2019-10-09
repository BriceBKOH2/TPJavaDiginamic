import java.util.Collection;

import tp_java_10.*;

public class TestTpObjet {

	public static void main(String[] args) {
		
		Collection<Figure> p = FigureUtil.genere(6);
		for (Figure f : p) {
			f.affiche();
		}

	}

}
