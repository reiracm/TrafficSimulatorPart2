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
		 * @param pId
		 * @param inclinacion
		 * @param interseccionX
		 * @param pIdCalle
		 */
		public Calle(int pTipo, int pPuntoInicial, int pPuntoFinal, int pPosEje, int pSeñal,int pVelocidadMax,int pId, int inclinacion, GenericList<Integer> interseccionX, GenericList<Integer> interseccionY){
			this._tipo = pTipo;
			this._puntoInicial = pPuntoInicial;
			this._puntoFinal = pPuntoFinal;
			this._posEje = pPosEje;
			this._señal = pSeñal;
			this._velocidadMax = pVelocidadMax;
			this._interseccion_X = interseccionX;
			this._interseccion_Y = interseccionY;
			this._inclinacion = inclinacion;
			this._id = pId;
			
		}
		/**
		 * 
		 * @param crear
		 */
		public Calle(GenerarVehiculosYCalles crear){
			crear.getObjetosCalle();
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
		/**
		 * Va a comparar los parámetros ingresados con la interseccion en X y Y de la calle
		 * @param pInt_X
		 * @param pInt_Y
		 * @return true o false
		 */
		public boolean buscarIntersecciones(int pInt_X, int pInt_Y){
			return _interseccion_X.busqueda(pInt_X) && _interseccion_Y.busqueda(pInt_Y);
			
		}
		

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