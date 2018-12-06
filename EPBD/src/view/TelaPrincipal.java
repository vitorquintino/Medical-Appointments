package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame{ 
	private static final long serialVersionUID = 1L;
	
	private JButton btnNovaConsulta;
	private ImageIcon imgNovaConsulta;
	private JLabel lblNovaConsulta;
	private JPanel pnlPrincipal;
	
	public TelaPrincipal() {
		this.setSize(new Dimension(800, 600));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		inicializaTela();
	}
	
	private void inicializaTela() {
		Font fonte = new Font("Futura", Font.BOLD, 20);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(780, 580);
		pnlPrincipal.setLayout(null);
		
		imgNovaConsulta = new ImageIcon(new ImageIcon(getClass().getResource("/add-user.png")).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		btnNovaConsulta = new JButton(imgNovaConsulta);
		btnNovaConsulta.setLocation(20, 20);
		btnNovaConsulta.setSize(150, 150);
		btnNovaConsulta.setBorder(BorderFactory.createEmptyBorder());
		//btnNovaConsulta.setContentAreaFilled(false);
		
		lblNovaConsulta = new JLabel("Nova consulta");
		lblNovaConsulta.setLocation(30, 180);
		lblNovaConsulta.setFont(fonte);
		lblNovaConsulta.setSize(200, 20);
		
		pnlPrincipal.add(btnNovaConsulta);
		pnlPrincipal.add(lblNovaConsulta);
		
		this.add(pnlPrincipal);
	}
}
