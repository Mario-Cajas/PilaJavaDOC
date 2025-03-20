package TareaPila;

public class PilaG <T>{

	 private T tabla[];
	 private int contador;
	/**
	 * Contructor de la clase
	 * @param tamaño - Tamaño del la pila
	 */
    public PilaG (int tamaño){
    	tabla = (T[]) new Object [tamaño];
        contador = 0;  	
    }
    
    /**
     * Introduce un valor en la lista.
     * @param valor
     * @return Devuelve verdadero si la pila tiene espacio o falso si la pila está llena.
     */
    public boolean push(T valor) {
    	
    	if(estaLleno()) {
    		return false;
    	}
    	
    	tabla[contador] = valor;
    	contador++;
    	return true;
    }
    
    /**
     * Extrae un valor con método LIFO de la lista y lo elimina 
     * @return Devuelve el valor, si no hay ningun valor devuelve -1
     */
    public T pop() {
    	
    	if (estaVacio()) {
    		return null;
    	}
    	contador--;
    	return tabla[contador];
    }
    
    /**
     * Extrae el ultimo valor introducido en la lista sin machacarlo
     * @return Devuelve el valor, -1 si no hay ningun valor almacenado  
     */
    public T peek() {
    	
    	if (estaVacio()) {
    		return null;
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
