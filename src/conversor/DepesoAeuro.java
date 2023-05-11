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

public class DepesoAeuro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepesoAeuro frame = new DepesoAeuro();
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
	public DepesoAeuro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de pesos Colombianos");
		lblNewLabel.setBounds(31, 44, 247, 26);
		contentPane.add(lblNewLabel);
		
		textFieldEuros = new JTextField();
		
		
		
		textFieldEuros.setBounds(31, 100, 247, 19);
		contentPane.add(textFieldEuros);
		textFieldEuros.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorIngresado = textFieldEuros.getText();
				double valorEnPesos = Double.parseDouble(valorIngresado);
				double valorEnEuros = valorEnPesos / 4900;
				
				String resultado = valorIngresado+" pesos Colombianos son : " +Math.round(valorEnEuros)+" euros";
				
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		
		
		
		btnConvertir.setBounds(31, 181, 119, 21);
		contentPane.add(btnConvertir);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convertir convertirFrame = new Convertir();
				convertirFrame.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(228, 181, 119, 21);
		contentPane.add(btnAtras);
	}

}
