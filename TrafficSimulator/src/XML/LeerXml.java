package XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.*;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;
import Logic.GenericList;
import Logic.ListaDatos;

/**
 * 
 * @author Ignacio Marin y Yenira Chacón
 *
 */
public class LeerXml {
	// Lista que contendrá listas con toda la información de las calles
	GenericList<ListaDatos> infoCalles = new GenericList<ListaDatos>();

    // Lista que contendrá listas con toda la información de los vehiculos
    GenericList<ListaDatos> infoVehiculos = new GenericList<ListaDatos>(); 

    /**
     * Método que lee el archivo XML y lo guarda en nuestras listas que contendrán la información de la simulación
     */
    public void leerArchivoXml() {
              // Cargamos el archivo XML 
              File archivo = new File("archivo.xml");

              try {
                        // Parseamos el documento para poder leerlo como un árbol de nodos
                        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                        Document doc = builder.parse(archivo);

                        // "<calle> ... </calle>"
                        // Obtenemos todos los nodos hijos de "simulacion" que tengan la etiqueta "calle"
                        NodeList listaCalles = doc.getElementsByTagName("calle");
                        // Iteramos por todos los nodos que tienen la etiqueta "calle" para obtener sus valores
                        for (int i = 0; i < listaCalles.getLength(); i++) {
                                  // Creamos una lista que contendra los elementos de una calle que obtendremos del archivo XML
                        		  ListaDatos datosCalles = new ListaDatos();
                                  // Seleccionamos la cabeza de la calle en la que estamos actualmente, ya que estamos iterando
                                  Element element = (Element) listaCalles.item(i);

                                  // Obtenemos la cabecera con la etiqueta "tipo" que esta dentro de la calle actual
                                  NodeList tipo = element.getElementsByTagName("tipo");
                                  // Seleccionamos la cabecera con la etiqueta "tipo" dentro de la calle
                                  Element datoTipo = (Element) tipo.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "tipo" como un "String"
                                  String tipoCalleString = datoTipo.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int tipoCalle = Integer.parseInt(tipoCalleString.trim());
                                  // Añadimos el dato a nuestra lista de infomación de calle
                                  datosCalles.insertarAlFinal(tipoCalle);
                                  System.out.println("tipoCalle --> insertado");

                                  // Obtenemos la cabecera con la etiqueta "posX1" que esta dentro de la calle actual
                                  NodeList x1 = element.getElementsByTagName("posX1");
                                  // Seleccionamos la cabecera con la etiqueta "posX1" dentro de la calle
                                  Element datoPosX1 = (Element) x1.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "posX1" como un "String"
                                  String posX1String = datoPosX1.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int posX1 = Integer.parseInt(posX1String.trim());
                                  // Añadimos el dato a nuestra lista de información de calle
                                  datosCalles.insertarAlFinal(posX1);
                                  System.out.println("posX1 --> insertado");

                                  //Obtenemos la cabecera con la etiqueta "posY1" que esta dentro de la calle actual
                                  NodeList y1 = element.getElementsByTagName("posY1");
                                  // Seleccionamos la cabecera con la etiqueta "posY1" dentro de la calle
                                  Element datoPosY1 = (Element) y1.item(0);
                                  // Obtenemos el valor que está adentro de la etiqueta "posY1" como un "String"
                                  String posY1String = datoPosY1.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int posY1 = Integer.parseInt(posY1String.trim());
                                  // Añadimos el dato a nuestra lista de información de calle
                                  datosCalles.insertarAlFinal(posY1);
                                  System.out.println("posY1 --> insertado");

                                  // Obtenemos la cabecera con la etiqueta "posX2" que está dentro de la calle actual
                                  NodeList x2 = element.getElementsByTagName("posX2");
                                  // Seleccionamos la cabecera con la etiqueta "posX2" dentro de calle
                                  Element datoPosX2 = (Element) x2.item(0);
                                  // Obtenemos el valor que está adentro de la etiqueta "posX2" como un "String"
                                  String posX2String = datoPosX2.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int posX2 = Integer.parseInt(posX2String.trim());
                                  // Añadimos el dato a nuestra lista de información de calle
                                  datosCalles.insertarAlFinal(posX2);
                                  System.out.println("posX2 --> insertado");

                                  // Obtenemos la cabecera con la etiqueta "posY2" que está adentro de la calle actual
                                  NodeList y2 = element.getElementsByTagName("posY2");
                                  // Seleccionamos la cabecera con la etiqueta "posY2" dentro de calle
                                  Element datoPosY2 = (Element) y2.item(0);
                                  // Obetenemos el valor que está adentro de la etiqueta "posY" como un "String"
                                  String posY2String = datoPosY2.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int posY2 = Integer.parseInt(posY2String.trim());
                                  // Añadimos el dato a nuestra lista de información de calle
                                  datosCalles.insertarAlFinal(posY2);
                                  System.out.println("posY2 --> insertado");

                                  //Obtenemos la cabecera con la etiqueta "señal" que está adentro de la calle actual
                                  NodeList señal = element.getElementsByTagName("señal");
                                  // Seleccionamos la cabecera con la etiqueta "señal" dentro de calle
                                  Element datoSeñal = (Element) señal.item(0);
                                  // Obtenemos el valor que está adentro de la etiqueta "señal" como un "String"
                                  String tipoSeñalString = datoSeñal.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int tipoSeñal = Integer.parseInt(tipoSeñalString.trim());
                                  // Añadimos el dato a nuestra lista de información de calle
                                  datosCalles.insertarAlFinal(tipoSeñal);
                                  System.out.println("señal --> insertado");

                                  // Obtenemos la cabecera con la etiqueta "velocidadMaxi" que está dentro de la calle actual
                                  NodeList vm = element.getElementsByTagName("velocidadMaxi");
                                  // Seleccionamos la cabecera con la etiqueta "velocidadMaxi" dentro de la calle
                                  Element datoVM = (Element) vm.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "velocidadMaxi" como un "String"
                                  String velocidadMaxiString = datoVM.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int velocidadMaxi = Integer.parseInt(velocidadMaxiString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosCalles.insertarAlFinal(velocidadMaxi);
                                  System.out.println("velocidadMaxiCalle --> insertado");      
                                  
                                  // Obtenemos la cabecera con la etiqueta "distancia" que está dentro de la calle actual
                                  NodeList distancia = element.getElementsByTagName("distancia");
                                  // Seleccionamos la cabecera con la etiqueta "distancia" dentro de la calle
                                  Element datoDis = (Element) distancia.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "distancia" como un "String"
                                  String distanciaString = datoDis.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int distanciaCalle = Integer.parseInt(distanciaString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosCalles.insertarAlFinal(distanciaCalle);
                                  System.out.println("distanciaCalle --> insertado");  
                                  
                                  // Obtenemos la cabecera con la etiqueta "interseccionX" que está dentro de la calle actual
                                  NodeList interseccionX = element.getElementsByTagName("interseccionX");
                                  // Seleccionamos la cabecera con la etiqueta "interseccionX" dentro de la calle
                                  Element datointerX = (Element) interseccionX.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "interseccionX" como un "String"
                                  String interXString = datointerX.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int interXCalle = Integer.parseInt(interXString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosCalles.insertarAlFinal(interXCalle);
                                  System.out.println("InterseccionXCalle --> insertado"); 
                                  
                                  // Obtenemos la cabecera con la etiqueta "interseccionY" que está dentro de la calle actual
                                  NodeList interseccionY = element.getElementsByTagName("interseccionY");
                                  // Seleccionamos la cabecera con la etiqueta "interseccionY" dentro de la calle
                                  Element datointerY = (Element) interseccionY.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "interseccionY" como un "String"
                                  String interYString = datointerY.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int interYCalle = Integer.parseInt(interYString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosCalles.insertarAlFinal(interYCalle);
                                  System.out.println("InterseccionYCalle --> insertado"); 

                                  // Añadimos la lista con la información de la calle a la matriz que contiene todas las calles
                                  infoCalles.insertarAlFinal(datosCalles);
                                  System.out.println("calle " + i + " --> insertado");
                                  System.out.println();
                        }

                        // "<vehiculo> ... </vehiculo>"
                        // Obtenemos todos los nodos hijos de "simulacion" que tengan la etiqueta "vehiculo"
                        NodeList listaVehiculos = doc.getElementsByTagName("vehiculo");                  
                        // Iteramos por todos los nodos que tienen la etiqueta "vehiculo" para obtener sus valores
                        for (int i = 0; i < listaVehiculos.getLength(); i++) {
                                  // Creamos una lista que contendrá los elementos de un vehiculo que obtendremos del archivo XML
                                  ListaDatos datosVehiculo = new ListaDatos();
                                  // Seleccionamos la cabeza del vehiculo en el que estamos actualmente, ya que estamos iterando
                                  Element element = (Element) listaVehiculos.item(i);

                                  // Obtenemos la cabecera con la etiqueta "tipo" que está dentro del vehiculo actual
                                  NodeList tipo = element.getElementsByTagName("tipo");
                                  // Seleccionamos la cabecera con la etiqueta "tipo" dentro del vehiculo
                                  Element datoTipo = (Element) tipo.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "tipo" como un "String"
                                  String tipoVehiculoString = datoTipo.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int tipoVehiculo = Integer.parseInt(tipoVehiculoString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(tipoVehiculo);
                                  System.out.println("tipoVehiculo --> insertado");

                                  // Obtenemos la cabecera con la etiqueta "velocidad" que está dentro del vehiculo actual
                                  NodeList v = element.getElementsByTagName("velocidad");
                                  // Seleccionamos la cabecera con la etiqueta "velocidad" dentro del vehiculo
                                  Element datoV = (Element) v.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "velocidad" como un "String"
                                  String velocidadString = datoV.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int velocidad = Integer.parseInt(velocidadString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(velocidad);
                                  System.out.println("velocidadVehiculo --> insertado");

                                   // Obtenemos la cabecera con la etiqueta "largo" que está dentro del vehiculo actual
                                  NodeList lrg = element.getElementsByTagName("largo");
                                  // Seleccionamos la cabecera con la etiqueta "largo" dentro del vehiculo
                                  Element datoLargo = (Element) lrg.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "largo" como un "String"
                                  String datoLargoString = datoLargo.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int largo = Integer.parseInt(datoLargoString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(largo);
                                  System.out.println("largoVehiculo --> insertado");                             

                                  // Obtenemos la cabecera con la etiqueta "ancho" que está dentro del vehiculo actual
                                  NodeList ach = element.getElementsByTagName("ancho");
                                  // Seleccionamos la cabecera con la etiqueta "ancho" dentro del vehiculo
                                  Element datoAch = (Element) ach.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "ancho" como un "String"
                                  String anchoString = datoAch.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int ancho = Integer.parseInt(anchoString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(ancho);
                                  System.out.println("anchoVehiculo --> insertado");

                                  // Obtenemos la cabecera con la etiqueta "probAveriarse" que está dentro del vehiculo actual
                                  NodeList pA = element.getElementsByTagName("probAveriarse");
                                  // Seleccionamos la cabecera con la etiqueta "probAveriarse" dentro del vehiculo
                                  Element datoPA = (Element) pA.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "probAveriarse" como un "String"
                                  String pAString = datoPA.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int probAveriarse = Integer.parseInt(pAString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(probAveriarse);
                                  System.out.println("probAveriarse --> insertado");   
                                  
                                  // Obtenemos la cabecera con la etiqueta "probAccidente" que está dentro del vehiculo actual
                                  NodeList pAC = element.getElementsByTagName("probAccidente");
                                  // Seleccionamos la cabecera con la etiqueta "probAccidente" dentro del vehiculo
                                  Element datoPAC = (Element) pAC.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "probAccidente" como un "String"
                                  String pACString = datoPAC.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int probAccidente = Integer.parseInt(pACString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(probAccidente);
                                  System.out.println("probAccidente --> insertado"); 
                                  
                                  // Obtenemos la cabecera con la etiqueta "pos X" que está dentro del vehiculo actual
                                  NodeList posX = element.getElementsByTagName("pos_X");
                                  // Seleccionamos la cabecera con la etiqueta "pos X" dentro del vehiculo
                                  Element datoPosX = (Element) posX.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "pos X" como un "String"
                                  String posXString = datoPosX.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int pos_X = Integer.parseInt(posXString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(pos_X);
                                  System.out.println("posicion X --> insertado"); 
                                  
                                  // Obtenemos la cabecera con la etiqueta "pos Y" que está dentro del vehiculo actual
                                  NodeList posY = element.getElementsByTagName("pos_Y");
                                  // Seleccionamos la cabecera con la etiqueta "pos Y" dentro del vehiculo
                                  Element datoPosY = (Element) posY.item(0);
                                  // Obtenemos el valor que está dentro de la etiqueta "pos Y" como un "String"
                                  String posYString = datoPosY.getFirstChild().getTextContent();
                                  // Convertimos el dato que obtuvimos en un entero
                                  int pos_Y = Integer.parseInt(posYString.trim());
                                  // Añadimos el dato a nuestra lista de infomación del vehiculo
                                  datosVehiculo.insertarAlFinal(pos_Y);
                                  System.out.println("posicion Y --> insertado"); 

                                  // Añadimos la lista con la información del vehiculo a la matriz que contiene todos los vehiculos
                                  infoVehiculos.insertarAlFinal(datosVehiculo);
                                  System.out.println("vehiculo " + i + " --> insertado");
                                  System.out.println();
                        }                


              }catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
              }
    }
     /**
      * Método "get" para así obtener toda la información de la calles
      * @return una lista (matriz) con sublistas de que contiene la información de una calle
      */
	public GenericList<ListaDatos> getInfoVehiculos() {
		return infoVehiculos;
	}
	public GenericList<ListaDatos> getInfoCalles() {
		return infoCalles;
	}
    
    /**
     * Método "get" para así obtener toda la información de los vehiculos
     * @return una lista (matriz) con sublistas que contiene la información de un vehiculo
     */


} // Fin de la clase

