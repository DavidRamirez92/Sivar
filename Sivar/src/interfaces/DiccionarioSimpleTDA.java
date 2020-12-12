package interfaces;

import interfaces.ConjuntoTDA;

public interface DiccionarioSimpleTDA {
	void inicializarDiccionarioSimple();

  
    void agregar(int clave, int valor);

   
    void eliminar(int clave);

   
    int recuperar(int clave);

    
    ConjuntoTDA claves();
}
