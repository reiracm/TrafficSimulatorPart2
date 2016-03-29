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

	}
}
