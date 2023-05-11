package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxMenu = new JComboBox();
		comboBoxMenu.setModel(new DefaultComboBoxModel(new String[] {"Moneda","Segundos s Minutos"}));
		comboBoxMenu.setBounds(130, 108, 171, 21);
		contentPane.add(comboBoxMenu);
	
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String opcionSeleccionada = (String) comboBoxMenu.getSelectedItem();
		    	if (opcionSeleccionada.equals("Segundos s Minutos")) {
		    		SegundosFrame item1Frame = new SegundosFrame();
		            item1Frame.setVisible(true);
		            dispose();
		        } else if (opcionSeleccionada.equals("Moneda")) {
		        	Convertir item2Frame = new Convertir();
		            item2Frame.setVisible(true);
		            dispose();
		    }
		   }
		});
		btnOk.setBounds(42, 190, 111, 42);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Salir");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String salir ="salir";
				
				JOptionPane.showMessageDialog(null, "HASTA PRONTO!");
				
				System.exit(0);
				
				
			}
		});
		btnCancelar.setBounds(288, 190, 95, 42);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Elige un conversor");
		lblNewLabel.setBounds(42, 24, 234, 55);
		contentPane.add(lblNewLabel);
		
	}
}
