package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaProcuraCadastro extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JButton btnPesquisar;
	private JTextField txtPesquisar;
	private JLabel lblPesquisar;
	private JPanel pnlPrincipal;
	private TelaProcuraCadastro t;
	
	public TelaProcuraCadastro() {
		this.setSize(new Dimension(400, 100));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.t = this;
		inicializaTela();
		defineEventos();
	}
	
	private void inicializaTela() {
		Font fonte = new Font("Futura", Font.BOLD, 20);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(380, 80);
		pnlPrincipal.setLayout(null);
		
		lblPesquisar = new JLabel("CPF");
		lblPesquisar.setLocation(20, 10);
		lblPesquisar.setFont(fonte);
		lblPesquisar.setSize(40, 20);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setLocation(90, 0);
		txtPesquisar.setSize(200, 40);
		txtPesquisar.setFont(fonte);
		
		btnPesquisar = new JButton("...");
		btnPesquisar.setLocation(310, 0);
		btnPesquisar.setSize(40, 40);
		
		pnlPrincipal.add(lblPesquisar);
		pnlPrincipal.add(txtPesquisar);
		pnlPrincipal.add(btnPesquisar);
		
		this.add(pnlPrincipal);
	}
	
	private void defineEventos() {
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				//pesquisa se tem um cadastro com esse cpf
				new TelaCadastroPaciente(t).setVisible(true);
			}
		});
	}
}
