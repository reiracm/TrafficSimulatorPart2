package Logic;

import XML.LeerXml;

/**
 * 
 * @author Yenira Chacón
 *
 */
public class GenerarVehiculosYCalles {

	// Lista genérica que contendrá los datos obtenidos del XML de Calle
	GenericList<GenericList>  datosCalle;
	//Lista genérica que contendrá los datos obtenidos del XML de Vehiculo
	GenericList<GenericList>  datosVehiculo;
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
		GNodo<GenericList> apuntador = datosVehiculo.getIterator();
		while(apuntador != null){
			GNodo<Integer> apuntadorDos = apuntador.getValor().getIterator();
			int type = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int speed = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int large = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int weigth = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int failure = apuntadorDos.getValor();

			apuntadorDos = apuntadorDos.getSiguiente();
			int accident = apuntadorDos.getValor();

			apuntadorDos = apuntadorDos.getSiguiente();
			int posX = apuntadorDos.getValor();

			apuntadorDos = apuntadorDos.getSiguiente();
			int posY = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int idCalle= apuntadorDos.getValor();
			
			Vehiculo car = new Vehiculo(type,speed,large,weigth,failure,accident,posX,posY,idCalle);
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
		GNodo<GenericList> apuntador = datosCalle.getIterator();
		GenericList<Integer> interseccionX = new GenericList<Integer>();
		GenericList<Integer> interseccionY = new GenericList<Integer>();
		
		while(apuntador != null){
			GNodo<Integer> apuntadorDos = apuntador.getValor().getIterator();
			int type = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int pIni = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int pFini = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int posEje = apuntadorDos.getValor();

			apuntadorDos = apuntadorDos.getSiguiente();
			int signal = apuntadorDos.getValor();

			apuntadorDos = apuntadorDos.getSiguiente();
			int maxSpeed = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int inclinacion = apuntadorDos.getValor();
			
			apuntadorDos = apuntadorDos.getSiguiente();
			int pId = apuntadorDos.getValor();

			while(apuntadorDos != null){
				
				int intX = apuntadorDos.getValor();
				interseccionX.insertarAlFinal(intX);
			
				apuntadorDos = apuntadorDos.getSiguiente();
				int intY = apuntadorDos.getValor();
				interseccionY.insertarAlFinal(intY);
				
				apuntadorDos = apuntadorDos.getSiguiente();
				
			}
			
			Calle calle = new Calle(type,pIni,pFini,posEje,signal,maxSpeed,pId,inclinacion, interseccionX, interseccionY);
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
