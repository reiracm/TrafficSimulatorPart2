package Logic;

public class GenericList <T> {
	GNodo<T> _cabeza;
	GNodo<T> _cola;
	
	public GenericList(){
		_cabeza = null;
		_cola = null;
	}
	
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
	
	public GNodo<T> getIterator(){
		return _cabeza;
	}
	

}

