package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - ver 1.0");
		lblNewLabel.setBounds(50, 39, 311, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblautorJeffersonS = new JLabel("@Autor Jefferson S. Sousa");
		lblautorJeffersonS.setBounds(50, 76, 311, 14);
		getContentPane().add(lblautorJeffersonS);
		
		JLabel lblWebService = new JLabel("WEB Service:");
		lblWebService.setBounds(50, 130, 83, 14);
		getContentPane().add(lblWebService);
		
		JLabel lblNewLabel_1 = new JLabel("republicavirtual.com.br");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setBounds(158, 130, 171, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setToolTipText("Projeto");
		btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(50, 179, 48, 48);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setToolTipText("LinkeIn");
		btnNewButton_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(158, 179, 48, 48);
		getContentPane().add(btnNewButton_1);

	}

}
