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

public class DePesoAlibraEsterlina extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPesos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DePesoAlibraEsterlina frame = new DePesoAlibraEsterlina();
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
	public DePesoAlibraEsterlina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de pesos Colombianos");
		lblNewLabel.setBounds(26, 71, 300, 13);
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
				double valorEnLibraEsterlina = valorEnPesos / 5754; 
				
				String resultado = valorIngresado+" pesos Colombianos son : " +Math.round (valorEnLibraEsterlina)+" Libras esterlina";
				
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		btnConvertir2.setBounds(26, 172, 121, 25);
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
		btnNewButton.setBounds(219, 173, 121, 23);
		contentPane.add(btnNewButton);
	}

}
