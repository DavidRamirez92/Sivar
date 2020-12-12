package aplication;
import interfaces.*;
import dinamicImplementation.*;
import metod.*;
public class App {
	private static final String archivo ="src/recurses/baseDeDatos.csv";
	public static void main(String[] args) {
		DiccionarioSimpleTDA baseDeDatos=new DiccionarioSimple();
		baseDeDatos.inicializarDiccionarioSimple();
		ConjuntoTDA conjunto=new Conjunto();
		conjunto.inicializarConjunto();
		UtilMetod method=new UtilMetod();
		method.readFile(baseDeDatos, archivo);

	}

}
