package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame{ 
	private static final long serialVersionUID = 1L;
	
	private JButton btnNovaConsulta, btnListarConsultas;
	private ImageIcon imgNovaConsulta;
	private JLabel lblNovaConsulta;
	private JPanel pnlPrincipal;
	
	public TelaPrincipal() {
		this.setSize(new Dimension(290, 200));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		inicializaTela();
		defineEventos();
	}
	
	private void inicializaTela() {
		Font fonte = new Font("Futura", Font.BOLD, 20);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(270, 180);
		pnlPrincipal.setLayout(null);
		
		//imgNovaConsulta = new ImageIcon(new ImageIcon(getClass().getResource("/imagens/add-user.png")).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		btnNovaConsulta = new JButton("Nova Consulta");
		btnNovaConsulta.setLocation(20, 20);
		btnNovaConsulta.setSize(220, 50);
		btnNovaConsulta.setBorder(BorderFactory.createEmptyBorder());
		btnNovaConsulta.setFont(fonte);
		
		btnListarConsultas = new JButton("Listar Consultas");
		btnListarConsultas.setLocation(20, 70);
		btnListarConsultas.setSize(220, 50);
		btnListarConsultas.setFont(fonte);
		
		lblNovaConsulta = new JLabel("Nova consulta");
		lblNovaConsulta.setLocation(30, 180);
		lblNovaConsulta.setFont(fonte);
		lblNovaConsulta.setSize(200, 20);
		
		pnlPrincipal.add(btnNovaConsulta);
		pnlPrincipal.add(btnListarConsultas);
		//pnlPrincipal.add(lblNovaConsulta);
		
		this.add(pnlPrincipal);
	}
	
	private void defineEventos() {
		btnNovaConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				new TelaProcuraCadastro().setVisible(true);
			}
		});
		
		btnListarConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				new TelaListarConsultas().setVisible(true);
			}
		});
	}
}
