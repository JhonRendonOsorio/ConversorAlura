package conversor;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DeLibraEsterlinaAPeso extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDolares;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeLibraEsterlinaAPeso frame = new DeLibraEsterlinaAPeso();
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
	public DeLibraEsterlinaAPeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de Libras Esterlinas");
		lblNewLabel.setBounds(31, 44, 247, 26);
		contentPane.add(lblNewLabel);
		
		textFieldDolares = new JTextField();
		
		
		
		textFieldDolares.setBounds(31, 100, 247, 19);
		contentPane.add(textFieldDolares);
		textFieldDolares.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorIngresado = textFieldDolares.getText();
				double valorEnLibrasEsterlinas = Double.parseDouble(valorIngresado);
				double valorEnPesos = valorEnLibrasEsterlinas * 5754;
				
				String resultado = valorIngresado+" Libras Esterlinas son : " + Math.round(valorEnPesos)+"$ pesos Colombianos";
				
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		
		
		
		btnConvertir.setBounds(31, 181, 112, 21);
		contentPane.add(btnConvertir);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convertir convertirFrame = new Convertir();
				convertirFrame.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(232, 181, 112, 21);
		contentPane.add(btnAtras);
	}

}
