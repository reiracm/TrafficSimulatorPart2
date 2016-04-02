package Logic;

/**
 * 
 * @author Yenira Chacón
 */
public class ControladorTrafico implements Observer {
	GenericList<Calle> listaCalles;
	GenericList<Vehiculo> listaVehiculos;
	
	/**
	 * 
	 * @param plistaCalles
	 * @param plistaVehiculos
	 */
	public ControladorTrafico(GenericList<Calle> plistaCalles, GenericList<Vehiculo> plistaVehiculos){
		listaCalles = plistaCalles;
		listaVehiculos = plistaVehiculos;
		
		GNodo<Vehiculo> iterador = listaVehiculos.getIterator();
		while(iterador!=null){
			iterador.getValor().setObserver(this);
			iterador = iterador.getSiguiente();
		}
	}

	@Override
	/**
	 * 
	 */
	public void update(Observable o) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = (Vehiculo) o;
		int posX = vehiculo.get_pos_X();
		int posY = vehiculo.get_pos_Y();
		boolean busquedaInterseccionX = listaCalles.getIterator().getValor().get_interseccion_X().busqueda(posX);
		boolean busquedaInterseccionY = listaCalles.getIterator().getValor().get_interseccion_Y().busqueda(posY);
		//Si las coordenadas del Vehiculo son iguales a las coordenadas de la interseccion, 
		//debe escoger otra carretera
		if ((busquedaInterseccionX == true) && (busquedaInterseccionY == true)){
			
		}
		
		
	}

}
