package Interface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logic.Calle;
import Logic.GNodo;
import Logic.GenerarVehiculosYCalles;
import Logic.GenericList;
import Logic.Vehiculo;
import XML.LeerXml;

public class TrafficPanel extends JPanel {

	private JFrame frame;
	private Object listaCalles;
	private Vehiculo vehiculo;
	
	private GenericList<GenericList<Integer>> listaDatos = new GenericList<GenericList<Integer>>();
	 // Creamos una lista de "JLabel" para los vehiculos
	private GenericList<JLabel> labelCalles = new GenericList<JLabel>();

	/**
	 * Se crea el panel de tráfico. Se crea un Lector Xml y se lee en el instante.
	 * Creamos una lista de objetos Vehiculos y otra de objetos Calle a partir del XMl leído
	 * Recorremos la lista que contiene los objetos vehiculo para crear un "JLabel" por cada objeto vehiculo
	 * y cada objeto Calle
	 */
	public TrafficPanel(JFrame frame) {
        
		this.frame = frame;
	    setBackground(Color.BLACK);
		setLayout(null);
		setSize(1000, 800);
	        
		LeerXml lector = new LeerXml();
		lector.leerArchivoXml();
		
		GenerarVehiculosYCalles vehiculosYCalles = new GenerarVehiculosYCalles(lector);
	                    
	    // Generamos la lista de objetos vehiculo
	    vehiculosYCalles.generarVehiculos();
	    
	    GenericList<JLabel> labelVehiculos = new GenericList<JLabel>();
	    // Creamos un lista (matriz) con sublistas que contendrán "enteros" de los datos de los vehiculos
		GenericList<GenericList<Integer>> listaDatosVehiculos = new GenericList<GenericList<Integer>>();
		
	    GNodo<Vehiculo> nodoObjVehiculo = vehiculosYCalles.getObjetosVehiculo().getIterator();      

		while (nodoObjVehiculo != null){
	                              JLabel vehiculo = new JLabel();
	                              labelVehiculos.insertarAlFinal(vehiculo);
	                              // Insertamos los datos del vehiculo a la lista de datos
	                              listaDatosVehiculos.insertarAlFinal(nodoObjVehiculo.getValor().datosVehiculo());
	                              // Continuamos con el siguiente nodo de la lista de vehiculos
	                              nodoObjVehiculo = nodoObjVehiculo.getSiguiente();
		}
	    // Se obtienen los nodos de la lista (matriz) de datos de los vehiculos
		GNodo<GenericList<Integer>> iv1 = listaDatosVehiculos.getIterator();
	    // Obtenemos los nodos de cada sublista de la matriz de datos vehiculo
		GNodo<Integer> iv2 = iv1.getValor().getIterator();
	    // Obtenemos los nodos de la lista de "JLabel" de los vehiculos
		GNodo<JLabel> nodoJLabelVehiculo = labelVehiculos.getIterator();
	    while(nodoJLabelVehiculo != null){        
	              nodoJLabelVehiculo.getValor().setBackground(Color.RED);
		          int x1 = iv2.getValor();
	              // Nos movemos al siguiente nodo de la lista de datos del vehiculo actual
		          iv2 = iv2.getSiguiente();
	              // Guardamos la posicioón en "Y" del vehiculo
		          int x2 = iv2.getValor();
	              // Nos movemos al siguiente nodo de la lista de datos del vehiculo actual
		          iv2 = iv2.getSiguiente();
	              // Guardamos el "ancho" del vehiculo
		          int x3 = iv2.getValor();
	              // Nos movemos al siguiente nodo de la lista de datos del vehiculo actual
		          iv2 = iv2.getSiguiente();
	              // Guardamos el "largo" del vehiculo
		          int x4 = iv2.getValor();
	              // Definimos el "JLabel" con los valores que obtuvimos
		          nodoJLabelVehiculo.getValor().setBounds(x1,x2,15,7);
		          nodoJLabelVehiculo.getValor().setOpaque(true);
	              // Añadimos el label vehiculo al Traffic Panel
		          add(nodoJLabelVehiculo.getValor());
		          nodoJLabelVehiculo = nodoJLabelVehiculo.getSiguiente();
		          iv1 = iv1.getSiguiente();
		          
		          if(iv1 != null){
		        	  iv2 = iv1.getValor().getIterator();
		          }				
	                    }
	        
		vehiculosYCalles.generarCalles();
		
	    GenericList<JLabel> labelCalles = new GenericList<JLabel>();

		GenericList<GenericList<Integer>> listaDatosCalles = new GenericList<GenericList<Integer>>();

	    GNodo<Calle> nodoObjCalle = vehiculosYCalles.getObjetosCalle().getIterator();

		while (nodoObjCalle != null){

	        JLabel calle = new JLabel();

		    labelCalles.insertarAlFinal(calle);
	        // Insertamos los datos de la calle a la lista de datos
		    listaDatosCalles.insertarAlFinal(nodoObjCalle.getValor().datosCalles());
	        // Continuamos con el siguiente nodo de la lista de calles
		    nodoObjCalle = nodoObjCalle.getSiguiente();
		}
	                    
		// Obtenemos los nodos de la lista (matriz) de datos de las calles
		GNodo<GenericList<Integer>> ic1 = listaDatosCalles.getIterator();

		GNodo<Integer> ic2 = ic1.getValor().getIterator();
	
		GNodo<JLabel> nodoJLabelCalle = labelCalles.getIterator();

		while(nodoJLabelCalle != null){

	        nodoJLabelCalle.getValor().setBackground(Color.GRAY);
	        //Guardamos la "posición inicial" de la calle
		    int x1 = ic2.getValor();
	        // Nos movemos al siguiente nodo de la lista de datos de la calle actual
		    ic2 = ic2.getSiguiente();
		    int x2 = ic2.getValor();
	        // Nos movemos al siguiente nodo de la lista de datos de la calle actual
		    ic2 = ic2.getSiguiente();
	        // Guardamos la "posición final" de la calle 
		    int x3 = ic2.getValor();
	        // Nos movemos al siguiente nodo de la lista de datos de la calle actual
		    ic2 = ic2.getSiguiente();
	        // Guardamos el "ancho" de la calle 
		    int x4 = ic2.getValor();
	        // Definimos el "JLabel" con los valores que obtuvimos
		    nodoJLabelCalle.getValor().setBounds(x1,x2,x3,x4);
		    nodoJLabelCalle.getValor().setOpaque(true);
	        // Añadimos el label calle al Traffic Panel
		    add(nodoJLabelCalle.getValor());
		    nodoJLabelCalle = nodoJLabelCalle.getSiguiente();
		    ic1 = ic1.getSiguiente();
	        // Verificamos si quedan elementos en la matriz de datos de calle
		    if(ic1 != null){
		    	ic2 = ic1.getValor().getIterator();
		    }				
	        }        
	        }

}
