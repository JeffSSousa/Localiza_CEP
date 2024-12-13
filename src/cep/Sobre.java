package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

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

		JLabel lblWebServ = new JLabel("republicavirtual.com.br");
		lblWebServ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebServ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebServ.setForeground(SystemColor.textHighlight);
		lblWebServ.setBounds(158, 130, 171, 14);
		getContentPane().add(lblWebServ);

		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/JeffSSousa");
			}
		});
		btnGitHub.setBackground(SystemColor.control);
		btnGitHub.setToolTipText("Projeto");
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitHub.setBorder(null);
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setBounds(50, 179, 48, 48);
		getContentPane().add(btnGitHub);

		JButton btnLinkedIn = new JButton("");
		btnLinkedIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/jefferson-sousa-8b93a81a2/");
			}
		});
		btnLinkedIn.setBackground(SystemColor.control);
		btnLinkedIn.setToolTipText("LinkeIn");
		btnLinkedIn.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLinkedIn.setBorder(null);
		btnLinkedIn.setBounds(120, 179, 48, 48);
		getContentPane().add(btnLinkedIn);

	}

	private void link(String site) { // Metodo de Link de paginas web
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
