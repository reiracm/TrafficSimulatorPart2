package Logic;

public class Vehiculo implements Runnable {

	private int _tipo;
	private int _velocidad;
	private int _velocidadVehiculo_X = 1;
	private int _velocidadVehiculo_Y = 1;
	private int _ancho;
	private int _largo;
	private int _probabilidadAveria;
	private int _probabilidadAccidente;
	private boolean _estado_A_C;
	private boolean alive = true;
	private int _max_posX = 1000;
	private int _max_posY = 800;
	private int _min_posX = 0;
	private int _min_posY = 0;
	private int _pos_X;
	private int _pos_Y;
	
	public Vehiculo(int pAncho, int pLargo, int pVelocidadVehiculo){
		this._ancho = pAncho;
		this._largo = pLargo;
		this._velocidadVehiculo_X = pVelocidadVehiculo;
		
	}


	public int get_tipo() {
		return _tipo;
	}


	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}


	public int get_velocidadVehiculo() {
		return _velocidadVehiculo_X;
	}


	public void set_velocidadVehiculo(int _velocidadVehiculo) {
		this._velocidadVehiculo_X = _velocidadVehiculo;
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


	public int get_probabilidadAveria() {
		return _probabilidadAveria;
	}


	public void set_probabilidadAveria(int _probabilidadAveria) {
		this._probabilidadAveria = _probabilidadAveria;
	}


	public int get_probabilidadAccidente() {
		return _probabilidadAccidente;
	}


	public void set_probabilidadAccidente(int _probabilidadAccidente) {
		this._probabilidadAccidente = _probabilidadAccidente;
	}


	public boolean is_estado_A_C() {
		return _estado_A_C;
	}


	public void set_estado_A_C(boolean _estado_A_C) {
		this._estado_A_C = _estado_A_C;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(alive){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int temp_X = _pos_X;
			
			if(temp_X < _max_posX && temp_X > _min_posX){
				_pos_X = temp_X;
			}
			
			else if(temp_X >= _max_posX){
				_pos_X = _max_posX;
				_velocidadVehiculo_X *= -1;
			}
			
			else if(temp_X <= _min_posX){
				_pos_X = _min_posX;
				_velocidadVehiculo_X *= -1;
			}
			
			
			
		}
		
	}
	
}
