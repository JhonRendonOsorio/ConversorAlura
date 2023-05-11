package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DedolarApeso extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDolares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DedolarApeso frame = new DedolarApeso();
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
	public DedolarApeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de dolares");
		lblNewLabel.setBounds(31, 44, 192, 26);
		contentPane.add(lblNewLabel);
		
		textFieldDolares = new JTextField();
		
		
		
		textFieldDolares.setBounds(31, 100, 247, 19);
		contentPane.add(textFieldDolares);
		textFieldDolares.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorIngresado = textFieldDolares.getText();
				double valorEnDolares = Double.parseDouble(valorIngresado);
				double valorEnPesos = valorEnDolares * 4500;
				
				String resultado = valorIngresado+" dolares son : " + Math.round(valorEnPesos)+"$ pesos Colombianos";
				
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		
		
		
		btnConvertir.setBounds(31, 181, 123, 21);
		contentPane.add(btnConvertir);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convertir convertirFrame = new Convertir();
				convertirFrame.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(240, 181, 123, 21);
		contentPane.add(btnAtras);
	}
}
