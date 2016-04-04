package Logic;

import java.awt.Color;

import javax.swing.JLabel;

public class Vehiculo extends Observable{

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
	private int _idCalle;
	private boolean _alive = true;
	
	/**
	 * 
	 * @param pTipo: Cada carro posee un tipo, según ese tipo se define el color y tamaño
	 * @param pVelocidad: cada carro va a llevar una velocidad que puede variar aleatoriamente
	 * @param pLargo:Largo del carro
	 * @param pAncho:Ancho del carro
	 * @param pProbAveria: numero que se le asigna en el xml como probabilidad de avería
	 * @param pProbAccidente: número que se le asigna en el xml como probabilidad de accidente
	 * @param pPos_X: posición X en el panel
	 * @param pPos_Y: posición Y en el panel
	 */
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
	/**
	 * Constructor utilizado para extraer la lista de objetos que está almacenada en la
	 * clase GenerarVehiculosYCalles. Esta lista se utilizará para crear los labels.
	 * @param crear
	 */

	public Vehiculo (GenerarVehiculosYCalles crear){
		lblVehiculo = crear.getObjetosVehiculo();
	}
        
                    public GenericList<Integer> datosVehiculo(){
		GenericList<Integer> lista = new GenericList<Integer>();
		if (this._tipo == 1){
			lista.insertarAlFinal(this._pos_X);
			lista.insertarAlFinal(this._pos_Y);
			lista.insertarAlFinal(this._ancho);
			lista.insertarAlFinal(this._largo);
		}
		else{
			lista.insertarAlFinal(this._pos_X);
			lista.insertarAlFinal(this._pos_Y);
			lista.insertarAlFinal(this._ancho);
			lista.insertarAlFinal(this._largo);
		}
		return lista;
	}
	


	/**
	 * 
	 * @return tipo de vehículo
	 */
	public int get_tipo() {
		return _tipo;
	}
	
	/**
	 * 
	 * @param _tipo
	 */
	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}

	/**
	 * 
	 * @return velocidad del vehículo
	 */
	public int get_velocidad() {
		return _velocidad;
	}

	/**
	 * 
	 * @param _velocidad
	 */
	public void set_velocidad(int _velocidad) {
		this._velocidad = _velocidad;
	}

	/**
	 * 
	 * @return ancho del vehiculo
	 */
	public int get_ancho() {
		return _ancho;
	}

	/**
	 * 
	 * @param _ancho
	 */
	public void set_ancho(int _ancho) {
		this._ancho = _ancho;
	}

	/**
	 * 
	 * @return largo del vehiculo
	 */
	public int get_largo() {
		return _largo;
	}

	/**
	 * 
	 * @param _largo
	 */
	public void set_largo(int _largo) {
		this._largo = _largo;
	}

	/**
	 * 
	 * @return probAveria la probabilidad de que un vehículo se averíe
	 */
	public int get_probAveria() {
		return _probAveria;
	}

	/**
	 * 
	 * @param _probAveria
	 */
	public void set_probAveria(int _probAveria) {
		this._probAveria = _probAveria;
	}

	/**
	 * 
	 * @return probAccidente la probabilidad de que un vehículo tenga un accidente
	 */
	public int get_probAccidente() {
		return _probAccidente;
	}

	/**
	 * 
	 * @param _probAccidente
	 */
	public void set_probAccidente(int _probAccidente) {
		this._probAccidente = _probAccidente;
	}

	/**
	 * 
	 * @return max_posX la maxima posición en X que puede tener un vehiculo
	 */
	public int get_max_posX() {
		return _max_posX;
	}

	/**
	 * 
	 * @param _max_posX
	 */
	public void set_max_posX(int _max_posX) {
		this._max_posX = _max_posX;
	}

	/**
	 * 
	 * @return _max_posY la máxima posición en Y que puede tener un vehículo
	 */
	public int get_max_posY() {
		return _max_posY;
	}

	/**
	 * 
	 * @param _max_posY
	 */
	public void set_max_posY(int _max_posY) {
		this._max_posY = _max_posY;
	}

	/**
	 * 
	 * @return _min_posX la mínima posición en Y que puede tener un vehículo
	 */
	public int get_min_posX() {
		return _min_posX;
	}

	/**
	 * 
	 * @param _min_posX
	 */
	public void set_min_posX(int _min_posX) {
		this._min_posX = _min_posX;
	}

	/**
	 * 
	 * @return _min_posY la mínima posición en Y que puede tener un vehículo
	 */
	public int get_min_posY() {
		return _min_posY;
	}

	/**
	 * 
	 * @param _min_posY
	 */
	public void set_min_posY(int _min_posY) {
		this._min_posY = _min_posY;
	}

	/**
	 * 
	 * @return _pos_X posición en X en la interfaz
	 */
	public int get_pos_X() {
		return _pos_X;
	}

	/**
	 * 
	 * @param _pos_X
	 */
	public void set_pos_X(int _pos_X) {
		this._pos_X = _pos_X;
	}

	/**
	 * 
	 * @return _pos_Y posición en Y que tiene un vehículo en la interfaz
	 */
	public int get_pos_Y() {
		return _pos_Y;
	}

	/**
	 * 
	 * @param _pos_Y
	 */
	public void set_pos_Y(int _pos_Y) {
		this._pos_Y = _pos_Y;
	}

	/**
	 * 
	 * @return _idCalle manera de identificar una calle
	 */
	public int get_idCalle() {
		return _idCalle;
	}

	/**
	 * 
	 * @param _idCalle
	 */
	public void set_idCalle(int _idCalle) {
		this._idCalle = _idCalle;
	}
	
}