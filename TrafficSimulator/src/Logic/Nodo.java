package Logic;

public class Nodo {
	private Calle _calle;
	private Nodo _next;
	
	public void Nodo(){
		this._calle = null;
		this._next = null;
		
	}

	public Calle get_Calle() {
		return _calle;
	}

	public void set_Calle(Calle pCalle) {
		this._calle = pCalle;
	}

	public Nodo get_next() {
		return _next;
	}

	public void set_next(Nodo _next) {
		this._next = _next;
	}


}
