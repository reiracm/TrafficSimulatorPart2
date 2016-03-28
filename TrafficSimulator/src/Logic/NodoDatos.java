package Logic;

	/**
	 * Clase que define los elementos que debe tener un Nodo de una lista
	 * @author nachoMarin
	 */

	public class NodoDatos{
	    
	    //Variable para guardar el dato de entrada
	    private int _dato;
	    //Variable para enlzar los nodos
	    private NodoDatos _siguiente;
	    
	    public NodoDatos(){
	        this._dato = 0;
	        this._siguiente = null;
	    }
	    
	    //Métodos "get" y "set" del atributo "_DATO"
	    public int getDato(){
	        return _dato;
	    }
	    public void setDato(int pDATO){
	        this._dato = pDATO;
	    }
	    
	    //Métodos "get" y "set" del atributo "_NEXT"
	    public NodoDatos getNext(){
	        return _siguiente;
	    }
	    public void setNext(NodoDatos pNEXT){
	        this._siguiente = pNEXT;
	    }
	    
	}

