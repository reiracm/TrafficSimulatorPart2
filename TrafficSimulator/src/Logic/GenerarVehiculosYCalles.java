package Logic;

import XML.LeerXml;

public class GenerarVehiculosYCalles {

	GenericList<ListaDatos>  datosCalle;
	GenericList<ListaDatos>  datosVehiculo;
	GenericList<Vehiculo> objetosVehiculo = new GenericList<Vehiculo>();
	GenericList<Calle> objetosCalle = new GenericList<Calle>();
	
	public GenerarVehiculosYCalles(LeerXml leer){
		datosCalle = leer.getInfoCalles();
		datosVehiculo = leer.getInfoVehiculos();
		
		
	}
	
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
	
/*	public void generarCalles(){
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
		
	}*/
	

}
