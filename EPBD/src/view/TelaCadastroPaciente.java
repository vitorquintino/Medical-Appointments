package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroPaciente extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JButton btnCadastrar;
	private JTextField txtNome, txtIdade, txtCpf, txtTelefone, txtEndereco;
	private JLabel lblNome, lblIdade, lblCpf, lblTelefone, lblEndereco;
	private JPanel pnlPrincipal;
	private final TelaProcuraCadastro t;
	private final TelaCadastroPaciente t2;
	
	public TelaCadastroPaciente(TelaProcuraCadastro t) {
		this.setSize(new Dimension(600, 260));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.t = t;
		this.t2 = this;
		t.dispose();
		inicializaTela();
		defineEventos();
	}
	
	private void inicializaTela() {
		Font fonte = new Font("Futura", Font.BOLD, 24);
		Font fonte2 = new Font("Arial", 0, 22);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(680, 240);
		pnlPrincipal.setLayout(null);
		
		lblNome = new JLabel("Nome");
		lblNome.setLocation(10, 10);
		lblNome.setFont(fonte);
		lblNome.setSize(70, 40);
		
		txtNome = new JTextField();
		txtNome.setLocation(100, 10);
		txtNome.setSize(250, 40);
		txtNome.setFont(fonte2);
		
		lblIdade = new JLabel("Idade");
		lblIdade.setLocation(390, 10);
		lblIdade.setFont(fonte);
		lblIdade.setSize(100, 40);
		
		txtIdade = new JTextField();
		txtIdade.setLocation(460, 10);
		txtIdade.setSize(100, 40);
		txtIdade.setFont(fonte2);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setLocation(10, 60);
		lblCpf.setFont(fonte);
		lblCpf.setSize(50, 40);
		
		txtCpf = new JTextField();
		txtCpf.setLocation(80, 60);
		txtCpf.setSize(160, 40);
		txtCpf.setFont(fonte2);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setLocation(260, 60);
		lblTelefone.setFont(fonte);
		lblTelefone.setSize(120, 40);
		
		txtTelefone = new JTextField();
		txtTelefone.setLocation(380, 60);
		txtTelefone.setSize(180, 40);
		txtTelefone.setFont(fonte2);
		
		lblEndereco = new JLabel("Endereço");
		lblEndereco.setLocation(10, 110);
		lblEndereco.setFont(fonte);
		lblEndereco.setSize(120, 40);
		
		txtEndereco = new JTextField();
		txtEndereco.setLocation(140, 110);
		txtEndereco.setSize(420, 40);
		txtEndereco.setFont(fonte2);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setLocation(400, 160);
		btnCadastrar.setSize(160, 40);
		btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
		btnCadastrar.setFont(fonte);
		
		pnlPrincipal.add(lblNome);
		pnlPrincipal.add(txtNome);
		pnlPrincipal.add(lblIdade);
		pnlPrincipal.add(txtIdade);
		pnlPrincipal.add(lblCpf);
		pnlPrincipal.add(txtCpf);
		pnlPrincipal.add(lblTelefone);
		pnlPrincipal.add(txtTelefone);
		pnlPrincipal.add(lblEndereco);
		pnlPrincipal.add(txtEndereco);
		pnlPrincipal.add(btnCadastrar);
		
		this.add(pnlPrincipal);
	}
	
	private void defineEventos() {
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				//pesquisa se tem um cadastro com esse cpf
				new TelaCadastroConsulta(t2).setVisible(true);
			}
		});
	}
}
