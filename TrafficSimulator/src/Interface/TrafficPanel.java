package Interface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Logic.Calle;
import Logic.GenericList;
import Logic.Vehiculo;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.util.Random;

public class TrafficPanel extends JPanel {

	private JFrame frame;
	private Object listaCalles;

	/**
	 * Create the panel.
	 */
		public TrafficPanel(JFrame frame) {
			this.frame = frame;
			setBackground(Color.BLACK);
			setLayout(null);
			setSize(1000, 800);
			
			GenericList<Calle> listaCalles = new GenericList <Calle>();			
			
			int largo = 0;
			
			while(largo < 5){
				
				Random posicionX = new Random();
				int posX = (int) (posicionX.nextDouble()*100+1);

				Random posicionY = new Random();
				int posY= (int) (posicionY.nextDouble()*800+1);
				
				System.out.println(largo);
				Calle calle = new Calle(posX,posY, 1000,10);
				listaCalles.insertarAlFinal(calle);
				
				JLabel calle1 = new JLabel("calle 1");
				calle1.setBackground(Color.PINK);
				calle1.setBounds(posX, posY, 1000, 10);
				calle1.setOpaque(true);
				add(calle1);
				largo = largo+1;
			}

	}
}
