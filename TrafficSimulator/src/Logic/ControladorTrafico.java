package Logic;


public class ControladorTrafico implements Observer {
	GenericList<Calle> listaCalles;
	GenericList<Vehiculo> listaVehiculos;
	
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
	public void update(Observable o) {
		// TODO Auto-generated method stub
		
	}

}
