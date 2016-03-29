package Logic;
/**
 * 
 * @author Ignacio Marin y Yenira Chacón
 *
 */

public class ListaDatos {
	// Puntero que indica la cabeza de la lista
    private NodoDatos _cabeza;
    // Puntero que indica la cola de la lista
    private NodoDatos _cola;
    // Variable para registrar el tamaño de la lista
    private int _largo;
    
    public void ListaEnlazada(){
        _cabeza = null;
        _cola = null;
        _largo = 0;
    }
    /**
     * Agrega un nuevo nodo al final de la lista. Este método se utilizará para rescatar los datos
     * contenidos en el archivo .xml y se puedan guardar en listas para luego crear los objetos. Cada 
     * dato extraído del archivo .xml será de tipo entero.
     * @param pDATO, dato que queremos agregar 
     */
    public void insertarAlFinal(int pDATO){
        NodoDatos nuevoNodo = new NodoDatos();
        nuevoNodo.setDato(pDATO);
        if(_cabeza == null){
            //Inicializa la lista agregando como inicio y fin al nuevo nodo
            _cabeza = nuevoNodo;
            _cola = nuevoNodo;
         // Caso contrario va agregando los nodos al final de la lista
        } else{ 
            // Une la cola de la lista existente con el nuevo nodo
            _cola.setNext(nuevoNodo);
            // Renombra al nuevo nodo como el último de la lista
            _cola = nuevoNodo;
        }
        // Incrementa el contador de tamaño de la lista
        _largo++;
    }
    
    /**
     * Este método es utilizado para extraer cada dato en orden de la lista creada para los
     * valores del archivo .xml
     * @return cabeza
     */
    public NodoDatos getIterator(){
    	return _cabeza;
    }

}
