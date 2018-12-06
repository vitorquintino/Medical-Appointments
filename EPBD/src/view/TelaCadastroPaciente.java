package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroPaciente extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JButton btnCadastrar;
	private JTextField txtNome, txtIdade, txtCpf, txtTelefone, txtEndereço;
	private JLabel lblNome, lblIdade, lblCpf, lblTelefone, lblEndereço;
	private JPanel pnlPrincipal;
	private TelaProcuraCadastro t;
	
	public TelaCadastroPaciente(TelaProcuraCadastro t) {
		this.setSize(new Dimension(600, 500));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.t = t;
		t.dispose();
		inicializaTela();
		defineEventos();
	}
	
	private void inicializaTela() {
		Font fonte = new Font("Futura", Font.BOLD, 24);
		Font fonte2 = new Font("Arial", 0, 22);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(680, 480);
		pnlPrincipal.setLayout(null);
		
		lblNome = new JLabel("Nome");
		lblNome.setLocation(10, 10);
		lblNome.setFont(fonte);
		lblNome.setSize(70, 40);
		
		txtNome = new JTextField();
		txtNome.setLocation(100, 10);
		txtNome.setSize(200, 40);
		txtNome.setFont(fonte2);
		
		lblIdade = new JLabel("Idade");
		lblIdade.setLocation(370, 10);
		lblIdade.setFont(fonte);
		lblIdade.setSize(100, 40);
		
		txtIdade = new JTextField();
		txtIdade.setLocation(440, 10);
		txtIdade.setSize(100, 40);
		txtIdade.setFont(fonte2);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setLocation(10, 60);
		lblCpf.setFont(fonte);
		lblCpf.setSize(50, 40);
		
		txtCpf = new JTextField();
		txtCpf.setLocation(80, 60);
		txtCpf.setSize(200, 40);
		txtCpf.setFont(fonte2);
		
		pnlPrincipal.add(lblNome);
		pnlPrincipal.add(txtNome);
		pnlPrincipal.add(lblIdade);
		pnlPrincipal.add(txtIdade);
		pnlPrincipal.add(lblCpf);
		pnlPrincipal.add(txtCpf);
		
		this.add(pnlPrincipal);
	}
	
	private void defineEventos() {
		
	}
}
