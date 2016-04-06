package Logic;

import java.util.Random;

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
		System.out.println("Test");
		listaCalles = plistaCalles;
		listaVehiculos = plistaVehiculos;
		
		GNodo<Vehiculo> iterador = listaVehiculos.getIterator();
		if(iterador==null){
			System.out.println("Iterador nulo");
		}
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

		Vehiculo vehiculo = (Vehiculo) o;
		//Se obtiene la posición actual en X del vehiculo
		int posX = vehiculo.get_pos_X();
		//Se obtiene la posicion actual en Y del vehiculo
		int posY = vehiculo.get_pos_Y();
		//se obtiene el ID de la calle
		int idCalle = listaCalles.getIterator().getValor().get_id();
		//se obtiene el ID del vehiculo
		int idVehiculo = vehiculo.get_id();	
		//Se hace un nodo para listaCalles
		GNodo<Calle> iterador = listaCalles.getIterator();
		//Calle es nula al principio
		Calle calle = null;
		/**
		 * Si las coordenadas del Vehiculo son iguales a las coordenadas de la interseccion, 
		 * debe escoger otra carretera. La primera validación es que el ID del carro sea igual al id
		 * de la calle en la que se encuentra. Luego de eso revisará cual otra calle comparte
		 * esas interesecciones. Y existirá un numero aleatorio para verificar en cual calle
		 * entrar. Sino, segura buscando hasta que el iterador sea nulo.
		 */
		while(iterador != null){
			if (iterador.getValor().get_id() == idVehiculo){
				calle = iterador.getValor();
				break;
				}
			iterador = iterador.getSiguiente();
		}
		
		if(calle.buscarIntersecciones(posX, posY) == true){
			Calle calle2 = null;
			while(iterador != null){
				if (iterador.getValor().buscarIntersecciones(posX, posY)){
					if(calle.get_id() != iterador.getValor().get_id()){
						calle2 = iterador.getValor();
					}
				}
		}
			Random rnd = new Random();
			int num = (int) (rnd.nextDouble()*2+1);
			if(num == 1){
				vehiculo.set_id(calle2.get_id());
			}
		}		
	}
}
