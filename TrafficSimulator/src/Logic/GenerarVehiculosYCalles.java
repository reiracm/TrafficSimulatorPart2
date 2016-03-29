package Logic;

import XML.LeerXml;

/**
 * 
 * @author Yenira Chacón
 *
 */
public class GenerarVehiculosYCalles {

	// Lista genérica que contendrá los datos obtenidos del XML de Calle
	GenericList<ListaDatos>  datosCalle;
	//Lista genérica que contendrá los datos obtenidos del XML de Vehiculo
	GenericList<ListaDatos>  datosVehiculo;
	//Lista Genérica que guardará objetos Vehiculo con los datos extraídos
	GenericList<Vehiculo> objetosVehiculo = new GenericList<Vehiculo>();
	//Lista Genérica que guardará objetos Calle con los datos extraídos
	GenericList<Calle> objetosCalle = new GenericList<Calle>();
	
	/**
	 * Esos datos se guardan en nuevas variables para tener control sobre ellas
	 * en está clase que Generará los objetos en listas.
	 * 
	 * @param leer = será de tipo LeerXml porque de esa clase se extraen las matrices de datos creadas
	 */
	public GenerarVehiculosYCalles(LeerXml leer){
		datosCalle = leer.getInfoCalles();
		datosVehiculo = leer.getInfoVehiculos();
		
		
	}
	
	/**
	 * Método que posee dos apuntadores que accesar a los datos de la matriz de Vehiculos, de manera que cuando
	 * la cabeza de la sublista sea nula, el apuntador de la lista genérica apuntará al siguiente elemento
	 * el cual es otra sublista y de esta manera irá creando los objetos y guardandolos en una lista nueva.
	 */
	public void generarVehiculos(){
		GNodo<ListaDatos> apuntador = datosVehiculo.getIterator();
		while(apuntador != null){
			NodoDatos apuntadorDos = apuntador.getValor().getIterator();
			int type = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int speed = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int large = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int weigth = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int failure = apuntadorDos.getDato();

			apuntadorDos = apuntadorDos.getNext();
			int accident = apuntadorDos.getDato();

			apuntadorDos = apuntadorDos.getNext();
			int posX = apuntadorDos.getDato();

			apuntadorDos = apuntadorDos.getNext();
			int posY = apuntadorDos.getDato();
			
			Vehiculo car = new Vehiculo(type,speed,large,weigth,failure,accident,posX,posY);
			objetosVehiculo.insertarAlFinal(car);
			
			apuntador = apuntador.getSiguiente();
		}
		
	}
	
	/**
	 * Método que posee dos apuntadores que accesar a los datos de la matriz de Calle, de manera que cuando
	 * la cabeza de la sublista sea nula, el apuntador de la lista genérica apuntará al siguiente elemento
	 * el cual es otra sublista y de esta manera irá creando los objetos y guardandolos en una lista nueva.
	 */
	public void generarCalles(){
		GNodo<ListaDatos> apuntador = datosCalle.getIterator();
		while(apuntador != null){
			NodoDatos apuntadorDos = apuntador.getValor().getIterator();
			int type = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int XIni = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int YIni = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int XFini = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int YFini = apuntadorDos.getDato();

			apuntadorDos = apuntadorDos.getNext();
			int signal = apuntadorDos.getDato();

			apuntadorDos = apuntadorDos.getNext();
			int maxSpeed = apuntadorDos.getDato();

			apuntadorDos = apuntadorDos.getNext();
			int intX = apuntadorDos.getDato();
			
			apuntadorDos = apuntadorDos.getNext();
			int intY = apuntadorDos.getDato();
			
			Calle calle = new Calle(type,XIni,YIni,XFini,YFini,signal,maxSpeed,intX,intY);
			objetosCalle.insertarAlFinal(calle);
			
			apuntador = apuntador.getSiguiente();
		}
		
	}

	/**
	 * Método para tener acceso desde otras clases a la lista de vehículos creada.
	 * @return objetosVehiculo = lista de objetos Vehiculo
	 */
	public GenericList<Vehiculo> getObjetosVehiculo() {
		return objetosVehiculo;
	}

	/**
	 * Método para tener acceso desde otras clases a la lista de calles creada.
	 * @return objetosCalle = lista de objetos Calle
	 */
	public GenericList<Calle> getObjetosCalle() {
		return objetosCalle;
	}
	
	

}
