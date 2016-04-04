package Logic;

import java.awt.Color;

import javax.swing.JLabel;

import DataAccess.IConstants;

public class Calle {

		private int _tipo;
		private int _puntoInicial;
		private int _puntoFinal;
		private int _posEje;
		private int _señal;
		private int _velocidadMax;
		private GenericList<Integer> _interseccion_X;
		private GenericList<Integer> _interseccion_Y;
		private int _inclinacion;
		private GenericList<Calle> lblCalle;
		private static int indice = 0;
		private int _id;

		/**
		 * 
		 * @param pTipo
		 * @param pPuntoInicial
		 * @param pPuntoFinal
		 * @param pPosX
		 * @param pPosY
		 * @param pSeñal
		 * @param pVelocidadMax
		 * @param pInterseccion_X
		 * @param pInterseccionY
		 * @param pInclinacion
		 */
		public Calle(int pTipo, int pPuntoInicial, int pPuntoFinal, int pPosEje, int pSeñal,int pVelocidadMax,GenericList<Integer> pInterseccion_X, GenericList<Integer> pInterseccionY, int pInclinacion){
			this._tipo = pTipo;
			this._puntoInicial = pPuntoInicial;
			this._puntoFinal = pPuntoFinal;
			this._posEje = pPosEje;
			this._señal = pSeñal;
			this._velocidadMax = pVelocidadMax;
			this._interseccion_X = pInterseccion_X;
			this._interseccion_Y = pInterseccionY;
			this._inclinacion = pInclinacion;
			_id = indice;
			indice ++;
			
		}
		/**
		 * 
		 * @param crear
		 */
		public Calle(GenerarVehiculosYCalles crear){
			lblCalle = crear.getObjetosCalle();
		}
		
		/**
		 * 
		 */
		
		public GenericList<Integer> datosCalles(){
			GenericList<Integer> lista = new GenericList<Integer>();
			if (this._tipo == 1){
				lista.insertarAlFinal(this._puntoInicial);
				lista.insertarAlFinal(this._posEje);
				lista.insertarAlFinal(this._puntoFinal - this._puntoInicial);
				lista.insertarAlFinal(IConstants.ANCHOCALLE);
			}
			else{
				lista.insertarAlFinal(this._posEje);
				lista.insertarAlFinal(this._puntoInicial);
				lista.insertarAlFinal(IConstants.ANCHOCALLE);
				lista.insertarAlFinal(this._puntoFinal - this._puntoInicial);
			}
			return lista;
		}
		
		/*public void crearLblVehiculo(){
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
		

		/**
		 * 
		 * @return
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
		 * @return
		 */
		public int get_señal() {
			return _señal;
		}

		/**
		 * 
		 * @param _señal
		 */
		public void set_señal(int _señal) {
			this._señal = _señal;
		}

		/**
		 * 
		 * @return
		 */
		public int get_velocidadMax() {
			return _velocidadMax;
		}

		/**
		 * 
		 * @param _velocidadMax
		 */
		public void set_velocidadMax(int _velocidadMax) {
			this._velocidadMax = _velocidadMax;
		}

		/**
		 * 
		 * @return
		 */
		public GenericList<Integer> get_interseccion_X() {
			return _interseccion_X;
		}

		/**
		 * 
		 * @param _interseccion_X
		 */
		public void set_interseccion_X(GenericList<Integer> _interseccion_X) {
			this._interseccion_X = _interseccion_X;
		}

		/**
		 * 
		 * @return
		 */
		public GenericList<Integer> get_interseccion_Y() {
			return _interseccion_Y;
		}

		/**
		 * 
		 * @param _interseccion_Y
		 */
		public void set_interseccion_Y(GenericList<Integer> _interseccion_Y) {
			this._interseccion_Y = _interseccion_Y;
		}

		/**
		 * 
		 * @return
		 */
		public int get_id() {
			return _id;
		}

		/**
		 * 
		 * @param _id
		 */
		public void set_id(int _id) {
			this._id = _id;
		}
		
		
		}