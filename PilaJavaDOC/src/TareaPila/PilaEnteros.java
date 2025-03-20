package TareaPila;
/**
 *  Implemento una pila guarda valores enteros
 *  @author Mario Cajas
 *  @version 1.0
 */
public class PilaEnteros {

	 private int tabla[];
	 private int contador;
	/**
	 * Contructor de la clase
	 * @param tamaño - Tamaño del la pila
	 */
    public PilaEnteros (int tamaño){
    	tabla = new int[tamaño];
    	contador = 0;
    }
    /**
     * Introduce un entero en la lista.
     * @param valor
     * @return Devuelve verdadero si cabe o falso si la pila está llena.
     */
    public boolean push(int valor) {
    	
    	if(estaLleno()) {
    		return false;
    	}
    	
    	tabla[contador] = valor;
    	contador++;
    	return true;
    }
    
    /**
     * Extrae un entero (ultimo introducido) de la lista y lo elimina.
     * @return Devuelve el valor, si no hay ningun valor devuelve -1
     */
    public int pop() {

    	if (estaVacio()) {
    		return -1;
    	}
    	contador--;
    	return tabla[contador];
    }
    
    /**
     * Extrae el ultimo entero introducido en la lista sin eliminarlo.
     * @return Devuelve el valor, -1 si no hay ningun valor almacenado  
     */
    public int peek() {
    	
    	if (estaVacio()) {
    		return -1;
    	}
    	return tabla[contador - 1];
    }
    
    /**
     * @return Devuelve verdadero si la pila esta llena
     */
    public boolean estaLleno() {
    	
    	if(contador == tabla.length) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * @return Devuelve verdadero si la pila esta vacia
     */
    public boolean estaVacio() {
    	
    	if (contador <= 0) {
    		return true;
    	}
    	return false;
    }
}
