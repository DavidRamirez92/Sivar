package dinamicImplementation;

import interfaces.ConjuntoTDA;


public class Conjunto implements ConjuntoTDA {

	public class Nodo {
		int info;
		Nodo sig;
	}

	Nodo elemento;

	
	
	public void inicializarConjunto() {
		elemento = null;
	}

	
	
	public boolean conjuntoVacio() {
		return elemento == null;
	}

	
	
	public void agregar(int x) {
		if (!this.pertenece(x)) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			nuevo.sig = elemento;
			elemento = nuevo;
		}
	}

	
	
	public int elegir() {
		return elemento.info;
	}

	
	
	public void sacar(int x) {
		if (this.pertenece(x)) {
			if (elemento.info == x) {
				elemento = elemento.sig;
			} else {
				Nodo aux = new Nodo();
				aux = elemento;
				while (aux.sig.info != x) {
					aux = aux.sig;
				}
				aux.sig = (aux.sig).sig;
			}
		}
	}

	
	
	public boolean pertenece(int x) {
		Nodo aux = elemento;
		int cont = 0;
		while (aux != null) {
			if (aux.info == x)
				cont++;
			aux = aux.sig;
		}
		return cont > 0;
	}

}
