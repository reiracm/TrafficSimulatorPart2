package Logic;

public class GNode<T> {
	
	private T _valor;
    
    private GNode<T> _siguiente;
    
    public GNode(T pdato){
    	_valor = pdato;
    	_siguiente = null;
    	
    }

	public T getValor() {
		return _valor;
	}

	public void setValor(T pdato) {
		this._valor = pdato;
	}

	public GNode<T> getSiguiente() {
		return _siguiente;
	}

	public void setSiguiente(GNode<T> siguiente) {
		this._siguiente = siguiente;
	}

}
