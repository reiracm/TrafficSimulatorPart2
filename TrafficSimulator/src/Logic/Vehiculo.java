package Logic;

import java.awt.Color;

import javax.swing.JLabel;

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
	private GenericList<Vehiculo> lblVehiculo;
	
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
	
	public Vehiculo (GenerarVehiculosYCalles crear){
		lblVehiculo = crear.getObjetosVehiculo();
	}
	
	public void crearLblVehiculo(){
		GNodo<Vehiculo> apuntador = lblVehiculo.getIterator();
		while(apuntador!=null){
			JLabel lblCar = new JLabel();
			if(apuntador.getValor().get_tipo() == 1){
				lblCar.setBounds(apuntador.getValor().get_pos_X(), apuntador.getValor().get_pos_Y(), 15, 7);
				lblCar.setBackground(Color.WHITE);
			}
			else if(apuntador.getValor().get_tipo() == 2){
				lblCar.setBounds(apuntador.getValor().get_pos_X(), apuntador.getValor().get_pos_Y(), 25, 7);
				lblCar.setBackground(Color.BLUE);
			}
			else if(apuntador.getValor().get_tipo()== 3){
				lblCar.setBounds(apuntador.getValor().get_pos_X(), apuntador.getValor().get_pos_Y(), 15, 9);
				lblCar.setBackground(Color.YELLOW);
			}
			else if(apuntador.getValor().get_tipo() > 3){
				lblCar.setBounds(apuntador.getValor().get_pos_X(), apuntador.getValor().get_pos_Y(), 10, 5);
				lblCar.setBackground(Color.RED);
			}
		}
	}

	public int get_tipo() {
		return _tipo;
	}

	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}

	public int get_velocidad() {
		return _velocidad;
	}

	public void set_velocidad(int _velocidad) {
		this._velocidad = _velocidad;
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

	public int get_probAveria() {
		return _probAveria;
	}

	public void set_probAveria(int _probAveria) {
		this._probAveria = _probAveria;
	}

	public int get_probAccidente() {
		return _probAccidente;
	}

	public void set_probAccidente(int _probAccidente) {
		this._probAccidente = _probAccidente;
	}

	public int get_max_posX() {
		return _max_posX;
	}

	public void set_max_posX(int _max_posX) {
		this._max_posX = _max_posX;
	}

	public int get_max_posY() {
		return _max_posY;
	}

	public void set_max_posY(int _max_posY) {
		this._max_posY = _max_posY;
	}

	public int get_min_posX() {
		return _min_posX;
	}

	public void set_min_posX(int _min_posX) {
		this._min_posX = _min_posX;
	}

	public int get_min_posY() {
		return _min_posY;
	}

	public void set_min_posY(int _min_posY) {
		this._min_posY = _min_posY;
	}

	public int get_pos_X() {
		return _pos_X;
	}

	public void set_pos_X(int _pos_X) {
		this._pos_X = _pos_X;
	}

	public int get_pos_Y() {
		return _pos_Y;
	}

	public void set_pos_Y(int _pos_Y) {
		this._pos_Y = _pos_Y;
	}
	
}