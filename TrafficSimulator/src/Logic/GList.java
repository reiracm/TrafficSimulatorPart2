package Logic;

public abstract class GList<T,T2>{
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

	public abstract void eliminar(T2 key);
	
    public void eliminar(Integer key) {
        if(_cabeza.getValor() == key){
            _cabeza = _cabeza.getSiguiente();           
        }
        else{
            GNodo<T> temp = _cabeza;
            while(temp.getSiguiente() != null){
                if(temp.getSiguiente().getValor() == key){
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    break;
                }
                temp= temp.getSiguiente();
            }
        }
    }
	
}
