package interfaces;

import interfaces.ConjuntoTDA;

public interface DiccionarioSimpleTDA {
	void inicializarDiccionarioSimple();

  
    void agregar(int clave, double valor);

   
    void eliminar(int clave);

   
    double recuperar(int clave);

    
    ConjuntoTDA claves();
}
