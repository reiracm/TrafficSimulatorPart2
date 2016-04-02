package Logic;

/**
 * 
 * @author Yenira Chacón
 *
 * @param <T>
 */
public class GenericList <T> {
	GNodo<T> _cabeza;
	GNodo<T> _cola;
	
	public GenericList(){
		_cabeza = null;
		_cola = null;
	}
	
	/**
	 * Esta lista genérica va a insertar datos al final de la lista. 
	 * @param pdato = parámetro que será de cualquier tipo que se desee 
	 */
	public void insertarAlFinal (T pdato){
		
		GNodo<T> nodo = new GNodo<T>(pdato);
		nodo.setValor(pdato);

		if (_cabeza == null) {
			_cabeza = nodo;
			_cola = nodo;
		} else {
			_cola.setSiguiente(nodo);
			_cola = nodo;			
		}
		System.out.println("insertado");
		
		
	}
	/**
	 * Obtiene de la lista cada dato
	 * @return _cabeza = la cabeza será el dato hasta que cabeza sea igual a nulo
	 */
	public GNodo<T> getIterator(){
		return _cabeza;
	}
	
	public boolean busqueda(Integer pValor) {
        
        GNodo<Integer> temp = (GNodo<Integer>) _cabeza;
        
        while(temp != null){
            
            if(temp.getValor() == pValor){
                return true;
            }
            
            temp = temp.getSiguiente();
        }
        
        return false;
    }

}

