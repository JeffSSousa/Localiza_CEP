package cep;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Cep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
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
	public Cep() {
		setTitle("Buscar CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(23, 25, 52, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(54, 25, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setBounds(23, 83, 63, 21);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 83, 326, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(23, 131, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(96, 128, 326, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(23, 171, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(96, 168, 200, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setBounds(354, 171, 23, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(377, 167, 46, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setBounds(23, 213, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(234, 24, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnInfo = new JButton("");
		btnInfo.setToolTipText("Sobre");
		btnInfo.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnInfo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInfo.setBorder(null);
		btnInfo.setBackground(SystemColor.control);
		btnInfo.setBounds(370, 11, 52, 48);
		contentPane.add(btnInfo);
	}
}
