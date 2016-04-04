package Logic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Interface.PanelInicial;
import XML.LeerXml;

public class Main extends JFrame {

		private JPanel contentPane;

		/**
		 * Inicia la aplicación
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					try {
						Main frame = new Main();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Crea el frame
		 */
		public Main() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 500, 420);
			contentPane = new PanelInicial(this);
			setContentPane(contentPane);
			setVisible(true);
		}
		/**
		 * Método para el cambio de ventana
		 * @param panel
		 */
		public void changeContentPane(JPanel panel){
			contentPane = panel;
			setContentPane(contentPane);
			setVisible(true);
		}

	}

