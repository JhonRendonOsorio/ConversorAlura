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

public class DepesoAdolar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepesoAdolar frame = new DepesoAdolar();
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
	public DepesoAdolar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de pesos Colombianos");
		lblNewLabel.setBounds(26, 71, 297, 13);
		contentPane.add(lblNewLabel);
		
		textFieldPesos = new JTextField();
		textFieldPesos.setBounds(26, 128, 339, 19);
		contentPane.add(textFieldPesos);
		textFieldPesos.setColumns(10);
		
		JButton btnConvertir2 = new JButton("Convertir");
		btnConvertir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorIngresado = textFieldPesos.getText();
				double valorEnPesos= Double.parseDouble(valorIngresado);
				double valorEnDolares = valorEnPesos / 4500; 
				
				String resultado = valorIngresado+" pesos Colombianos son : " +Math.round (valorEnDolares)+"$ Dolares";
				
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		btnConvertir2.setBounds(29, 208, 132, 21);
		contentPane.add(btnConvertir2);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Convertir convertirFrame = new Convertir();
				convertirFrame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(242, 208, 135, 21);
		contentPane.add(btnNewButton);
	}

}
