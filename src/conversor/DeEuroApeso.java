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

public class DeEuroApeso extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeEuroApeso frame = new DeEuroApeso();
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
	public DeEuroApeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad en euros");
		lblNewLabel.setBounds(31, 44, 192, 26);
		contentPane.add(lblNewLabel);
		
		textFieldEuros = new JTextField();
		
		
		
		textFieldEuros.setBounds(31, 100, 247, 19);
		contentPane.add(textFieldEuros);
		textFieldEuros.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorIngresado = textFieldEuros.getText();
				double valorEnEuros = Double.parseDouble(valorIngresado);
				double valorEnPesos = valorEnEuros * 5000;
				
				String resultado = valorIngresado+" euros son : " +Math.round (valorEnPesos)+"$ pesos Colombianos";
				
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		
		
		
		btnConvertir.setBounds(31, 181, 117, 21);
		contentPane.add(btnConvertir);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convertir convertirFrame = new Convertir();
				convertirFrame.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(213, 181, 117, 21);
		contentPane.add(btnAtras);
	}

}
