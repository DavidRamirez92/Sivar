package dinamicImplementation;

import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {

	Nodo inicio;

    class Nodo {
        int clave;
        double valor;
        Nodo sig;
    }

	
    
    public void inicializarDiccionarioSimple() {
        this.inicio = null;
    }

	
    
    public void agregar(int clave, double valor) {
        Nodo actual = this.inicio;
        while (actual != null && actual.clave != clave)
            actual = actual.sig;
        if (actual != null) {
            actual.valor = valor;
        } else {
            Nodo nuevo = new Nodo();
            nuevo.clave = clave;
            nuevo.valor = valor;
            nuevo.sig = this.inicio;
            this.inicio = nuevo;
        }
    }

	
    
    public void eliminar(int clave) {
        Nodo actual = this.inicio, ant = null;
        while (actual != null && actual.clave != clave) {
            ant = actual;
            actual = actual.sig;
        }
        if (ant == null) {
            this.inicio = this.inicio.sig;
        } else {
            ant.sig = actual.sig;
        }
    }

	
    
    public double recuperar(int clave) {
        Nodo actual = this.inicio;
        while (actual.clave != clave)
            actual = actual.sig;
        return actual.valor;
    }

	
    
    public ConjuntoTDA claves() {
        ConjuntoTDA claves = new Conjunto();
        claves.inicializarConjunto();
        Nodo actual = this.inicio;
        while (actual != null) {
            claves.agregar(actual.clave);
            actual = actual.sig;
        }
        return claves;
    }

}
