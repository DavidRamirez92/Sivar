package interfaces;

public interface ConjuntoTDA {
	void inicializarConjunto();

	boolean conjuntoVacio();

	
	void agregar(int valor);

	
	int elegir();

	
	void sacar(int valor);

	
	boolean pertenece(int valor);
}
