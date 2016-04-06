package Interface;

import javax.swing.JPanel;

import Logic.Main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Yenira Chacón
 *
 */
public class PanelInicial extends JPanel {

	JFrame frame;
	
	/**
	 * Crea el panel inicial
	 */
	public PanelInicial(Main main) {
		super();
		this.frame = main;
		
		setLayout(null);
		
		//Crea el botón para empezar a jugar
		JButton btnNewButton = new JButton("Empezar");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				main.changeContentPane(new TrafficPanel(main));
				
			}
		});
		btnNewButton.setBounds(204, 255, 117, 25);
		add(btnNewButton);
		
		//Crea label inicial
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 800, 800);
		add(lblNewLabel);
	}
}
