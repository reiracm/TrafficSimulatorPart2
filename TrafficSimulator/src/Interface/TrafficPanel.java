package Interface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficPanel extends JPanel {

	private JFrame frame;

	/**
	 * Create the panel.
	 */
		public TrafficPanel(JFrame frame) {
			this.frame = frame;
			setBackground(Color.BLACK);
			setLayout(null);
			setSize(600, 420);

	}

}
