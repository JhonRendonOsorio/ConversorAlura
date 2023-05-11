package conversor;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Convertir extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convertir frame = new Convertir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Convertir() {
		setTitle("Divisa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("elige la divisa");
		lblNewLabel.setBounds(32, 47, 211, 24);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBoxConversor = new JComboBox();
		comboBoxConversor.setModel(new DefaultComboBoxModel(new String[] {"De dolar a peso", "De peso a dolar",
																			"De peso a euro", "De euro a peso",
																			"De peso a libra esterlina", "De libra esterlina a peso",
																			"De peso a yen Japones", "De yen Japones a peso",
																			"De peso a won coreano", "De won coreano a peso"}));
		comboBoxConversor.setBounds(121, 119, 175, 21);
		
		contentPane.add(comboBoxConversor);
		
		
		JButton btnSiguiente = new JButton("Siguiente");
		
		btnSiguiente.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	String opcionSeleccionada = (String) comboBoxConversor.getSelectedItem();
		    	if (opcionSeleccionada.equals("De dolar a peso")) {
		        	DedolarApeso item1Frame = new DedolarApeso();
		            item1Frame.setVisible(true);
		            dispose();
		        } else if (opcionSeleccionada.equals("De peso a dolar")) {
		        	DepesoAdolar item2Frame = new DepesoAdolar();
		            item2Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De peso a euro")) {
		        	DepesoAeuro item3Frame = new DepesoAeuro();
		            item3Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De euro a peso")) {
		        	DeEuroApeso item4Frame = new DeEuroApeso();
		            item4Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De peso a libra esterlina")) {
		        	DePesoAlibraEsterlina item5Frame = new DePesoAlibraEsterlina();
		            item5Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De libra esterlina a peso")) {
		        	DeLibraEsterlinaAPeso item6Frame = new DeLibraEsterlinaAPeso();
		            item6Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De peso a yen Japones")) {
		        	DePesoAYenJapones item7Frame = new DePesoAYenJapones();
		            item7Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De yen Japones a peso")) {
		        	DeYenJaponesAPeso item8Frame = new DeYenJaponesAPeso();
		            item8Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De peso a won coreano")) {
		        	DePesoAWonCoreano item9Frame = new DePesoAWonCoreano();
		            item9Frame.setVisible(true);
		            dispose();
		        }else if (opcionSeleccionada.equals("De won coreano a peso")) {
		        	DeWonCoreanoAPeso item10Frame = new DeWonCoreanoAPeso();
		            item10Frame.setVisible(true);
		            dispose();
		        }
		    }
		});
		btnSiguiente.setBounds(32, 196, 85, 21);
		contentPane.add(btnSiguiente);
		
		JButton btn2Cancelar = new JButton("Cancelar");
		btn2Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menuFrame = new Menu();
				menuFrame.setVisible(true);
				dispose();
			}
		});
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Convertir convertirFrame = new Convertir();
		    	convertirFrame.setVisible(true);
		    }
		});
		btn2Cancelar.setBounds(265, 196, 85, 21);
		contentPane.add(btn2Cancelar);
	}
}
