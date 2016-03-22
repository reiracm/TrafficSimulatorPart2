package Logic;

public class Lista {
	private Nodo _cabeza;
	private Nodo _cola;
	private int _largo;

	public void Lista() {
		_cabeza = null;
		_cola = null;
		_largo = 0;
	}

	public void insertarAlFinal(Calle calle) {
		Nodo nodo = new Nodo();
		nodo.set_Calle(calle);

		if (_cabeza == null) {
			_cabeza = nodo;
			_cola = nodo;
		} else {
			_cola.set_next(nodo);
			_cola = nodo;
		}

		_largo = _largo++;
	}

	public Nodo get_cabeza() {
		return _cabeza;
	}

	public void set_cabeza(Nodo _cabeza) {
		this._cabeza = _cabeza;
	}

	public Nodo get_cola() {
		return _cola;
	}

	public void set_cola(Nodo _cola) {
		this._cola = _cola;
	}

	public int get_largo() {
		return _largo;
	}

	public void set_largo(int _largo) {
		this._largo = _largo;
	}

}
