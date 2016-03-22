package Logic;


public class Calle {

	private int _distancia;
	private int _velocidadMax;
	private int _pendiente;
	private int _ubicacionInicial_X;
	private int _ubicacionInicial_Y;
	private int _ubicacionFinal_X;
	private int _ubicacionFinal_Y;
	private int _pos_X;
	private int _pos_Y;

	public Calle(int pUbicacionInicial_X, int pUbicacionInicial_Y, int pUbicacionFinal_X, int pUbicacionFinal_Y){
		this._ubicacionInicial_X = pUbicacionInicial_X;
		this._ubicacionInicial_Y = pUbicacionInicial_Y;
		this._ubicacionFinal_X = pUbicacionFinal_X;
		this._ubicacionFinal_Y = pUbicacionFinal_Y;
		
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
	
	
}
