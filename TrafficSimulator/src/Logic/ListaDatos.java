package Logic;

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
     * Agrega un nuevo nodo al final de la lista
     * @param pDATO, dato que queremos agregar 
     */
    public void insertarAlFinal(int pDATO){
        // Define un nuevo nodo
        NodoDatos nuevoNodo = new NodoDatos();
        // Agrega el dato al nodo
        nuevoNodo.setDato(pDATO);
        // Consulta si la lista esta vacía
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

}
