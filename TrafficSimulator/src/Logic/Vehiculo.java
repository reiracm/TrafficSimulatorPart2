package Logic;

public class Vehiculo {

	private int _tipo;
	private int _velocidad;
	private int _ancho;
	private int _largo;
	private int _probAveria;
	private int _probAccidente;
	private int _max_posX = 1000;
	private int _max_posY = 800;
	private int _min_posX = 0;
	private int _min_posY = 0;
	private int _pos_X;
	private int _pos_Y;
	
	public Vehiculo(int pTipo, int pVelocidad, int pLargo, int pAncho, int pProbAveria, int pProbAccidente, int pPos_X, int pPos_Y ){
		this._tipo = pTipo;
		this._largo = pLargo;
		this._ancho = pAncho;
		this._velocidad = pVelocidad;
		this._probAveria = pProbAveria;
		this._probAccidente = pProbAccidente;
		this._pos_X = pPos_X;
		this._pos_Y = pPos_Y;
		
	}


	public int get_tipo() {
		return _tipo;
	}


	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}



	public int get_ancho() {
		return _ancho;
	}


	public void set_ancho(int _ancho) {
		this._ancho = _ancho;
	}


	public int get_largo() {
		return _largo;
	}


	public void set_largo(int _largo) {
		this._largo = _largo;
	}
}

