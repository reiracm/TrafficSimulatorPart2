package Logic;

import java.awt.Color;

import javax.swing.JLabel;

public class Calle {

	private int _tipo;
	private int _puntoInicial;
	private int _puntoFinal;
	private int _posX;
	private int _posY;
	private int _señal;
	private int _velocidadMax;
	private int _interseccion_X;
	private int _interseccion_Y;
	private int _inclinacion;
	private GenericList<Calle> lblCalle;

	public Calle(int pTipo, int pPuntoInicial, int pPuntoFinal, int pPosX, int pPosY, int pSeñal,int pVelocidadMax,int pInterseccion_X, int pInterseccionY, int pInclinacion){
		this._tipo = pTipo;
		this._puntoInicial = pPuntoInicial;
		this._puntoFinal = pPuntoFinal;
		this._posX = pPosX;
		this._posY = pPosY;
		this._señal = pSeñal;
		this._velocidadMax = pVelocidadMax;
		this._interseccion_X = pInterseccion_X;
		this._interseccion_Y = pInterseccionY;
		this._inclinacion = pInclinacion;
		
	}
	
	public Calle(GenerarVehiculosYCalles crear){
		lblCalle = crear.getObjetosCalle();
	}
	
	public void crearLblVehiculo(){
		GNodo<Calle> apuntador = lblCalle.getIterator();
		while(apuntador!=null){
			JLabel lblCalle = new JLabel();
			//Calle horizontal
			if(apuntador.getValor().get_tipo() == 1){
				lblCalle.setBounds(apuntador.getValor()._puntoInicial, apuntador.getValor()._posY, apuntador.getValor()._puntoFinal - apuntador.getValor()._puntoInicial , 10);
				lblCalle.setBackground(Color.GRAY);
			}
			//Calle Vertical
			else if(apuntador.getValor().get_tipo() == 2){
				lblCalle.setBounds(apuntador.getValor()._posX, apuntador.getValor()._puntoInicial, 10, apuntador.getValor()._puntoFinal - apuntador.getValor()._puntoInicial);
				lblCalle.setBackground(Color.GRAY);
			}
/*			else if(apuntador.getValor().get_tipo()== 3){
				lblCalle.setBounds(apuntador.getValor().get_pos_X(), apuntador.getValor().get_pos_Y(), 15, 9);
				lblCalle.setBackground(Color.GRAY);
			}
			else if(apuntador.getValor().get_tipo() > 3){
				lblCalle.setBounds(apuntador.getValor().get_pos_X(), apuntador.getValor().get_pos_Y(), 10, 5);
				lblCalle.setBackground(Color.RED);
			}*/
		}
	}

	public int get_tipo() {
		return _tipo;
	}

	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
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