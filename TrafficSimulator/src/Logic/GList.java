package Logic;

public abstract class GList<T>{
	GNodo<T> _cabeza;
	GNodo<T> _cola;

	public void insertarAlFinal(T dato) {
		
		GNodo<T> nodo = new GNodo<T>(dato);
		nodo.setValor(dato);

		if (_cabeza == null) {
			_cabeza = nodo;
			_cola = nodo;
		} else {
			_cola.setSiguiente(nodo);
			_cola = nodo;
		}
	}
	
    public void eliminar(T dato) {
        if(_cabeza.getValor() == dato){
            _cabeza = _cabeza.getSiguiente();           
        }
        else{
            GNodo<T> temp = _cabeza;
            while(temp.getSiguiente() != null){
                if(temp.getSiguiente().getValor() == dato){
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    break;
                }
                temp= temp.getSiguiente();
            }
        }
    }
	
}
