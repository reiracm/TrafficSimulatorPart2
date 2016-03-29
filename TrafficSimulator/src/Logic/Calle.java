package Logic;


public class Calle {

	private int _tipo;
	private int _ubicacionInicial_X;
	private int _ubicacionInicial_Y;
	private int _ubicacionFinal_X;
	private int _ubicacionFinal_Y;
	private int _señal;
	private int _velocidadMax;
	private int _interseccion_X;
	private int _interseccion_Y;

	public Calle(int pTipo, int pUbicacionInicial_X, int pUbicacionInicial_Y, int pUbicacionFinal_X, int pUbicacionFinal_Y, int pSeñal,int pVelocidadMax,int pInterseccion_X, int pInterseccionY){
		this._tipo = pTipo;
		this._ubicacionInicial_X = pUbicacionInicial_X;
		this._ubicacionInicial_Y = pUbicacionInicial_Y;
		this._ubicacionFinal_X = pUbicacionFinal_X;
		this._ubicacionFinal_Y = pUbicacionFinal_Y;
		this._señal = pSeñal;
		this._velocidadMax = pVelocidadMax;
		this._interseccion_X = pInterseccion_X;
		this._interseccion_Y = pInterseccionY;
		
	}

	public int get_tipo() {
		return _tipo;
	}

	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}

	public int get_ubicacionInicial_X() {
		return _ubicacionInicial_X;
	}

	public void set_ubicacionInicial_X(int _ubicacionInicial_X) {
		this._ubicacionInicial_X = _ubicacionInicial_X;
	}

	public int get_ubicacionInicial_Y() {
		return _ubicacionInicial_Y;
	}

	public void set_ubicacionInicial_Y(int _ubicacionInicial_Y) {
		this._ubicacionInicial_Y = _ubicacionInicial_Y;
	}

	public int get_ubicacionFinal_X() {
		return _ubicacionFinal_X;
	}

	public void set_ubicacionFinal_X(int _ubicacionFinal_X) {
		this._ubicacionFinal_X = _ubicacionFinal_X;
	}

	public int get_ubicacionFinal_Y() {
		return _ubicacionFinal_Y;
	}

	public void set_ubicacionFinal_Y(int _ubicacionFinal_Y) {
		this._ubicacionFinal_Y = _ubicacionFinal_Y;
	}

	public int get_señal() {
		return _señal;
	}

	public void set_señal(int _señal) {
		this._señal = _señal;
	}

	public int get_velocidadMax() {
		return _velocidadMax;
	}

	public void set_velocidadMax(int _velocidadMax) {
		this._velocidadMax = _velocidadMax;
	}

	public int get_interseccion_X() {
		return _interseccion_X;
	}

	public void set_interseccion_X(int _interseccion_X) {
		this._interseccion_X = _interseccion_X;
	}

	public int get_interseccion_Y() {
		return _interseccion_Y;
	}

	public void set_interseccion_Y(int _interseccion_Y) {
		this._interseccion_Y = _interseccion_Y;
	}
	
}