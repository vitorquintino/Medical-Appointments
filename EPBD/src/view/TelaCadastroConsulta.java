package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import conexao.BaseDadosException;
import dao.EspecialidadeDaoJDBC; 
import dao.MedicoDaoJDBC;
import view.TelaProcuraCadastro;

public class TelaCadastroConsulta extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JButton btnEscolherEspecialidade, btnAgendar, btnEscolherMedico;
	private JLabel lblEspecialidade, lblMedico, lblHorario, lblDia;
	private JComboBox<String> cmbEspecialidade, cmbMedico, cmbHorarios, cmbDia;
	private final JFrame t;
	private JPanel pnlPrincipal;
	
	//preciso dos horarios dispon�veis do m�dico
	public TelaCadastroConsulta(JFrame t) {
		this.setSize(new Dimension(500, 320));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.t = t;
		t.dispose();
		try {
			inicializaTela();
		} catch(Exception e) {}
		
		defineEventos();
	}
	
	private void inicializaTela() throws BaseDadosException {
		Font fonte = new Font("Futura", Font.BOLD, 24);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(480, 300);
		pnlPrincipal.setLayout(null);
		
		lblEspecialidade = new JLabel("Especialidades");
		lblEspecialidade.setLocation(10, 10);
		lblEspecialidade.setFont(fonte);
		lblEspecialidade.setSize(180, 40);
		
		EspecialidadeDaoJDBC especialidadeDao = new EspecialidadeDaoJDBC();
		Vector<String> especialidades = especialidadeDao.nomesDeTodasEspecialidades();
		
		cmbEspecialidade = new JComboBox<String>(especialidades);
		cmbEspecialidade.setLocation(200, 10);
		cmbEspecialidade.setSize(220, 40);
		
		btnEscolherEspecialidade = new JButton("...");
		btnEscolherEspecialidade.setSize(40, 40);
		btnEscolherEspecialidade.setLocation(430, 10);
		
		lblMedico = new JLabel("M�dico");
		lblMedico.setLocation(10, 60);
		lblMedico.setSize(150, 40);
		lblMedico.setFont(fonte);
		lblMedico.setVisible(false);
		
		cmbMedico = new JComboBox<String>();
		cmbMedico.setSize(300, 40);
		cmbMedico.setLocation(120, 60);
		cmbMedico.setVisible(false);
		
		btnEscolherMedico = new JButton("...");
		btnEscolherMedico.setSize(40, 40);
		btnEscolherMedico.setLocation(430, 60);
		btnEscolherMedico.setVisible(false);
		
		lblDia = new JLabel("Dia");
		lblDia.setLocation(10, 110);
		lblDia.setSize(150, 40);
		lblDia.setFont(fonte);
		lblDia.setVisible(false);
		
		cmbDia = new JComboBox<String>();
		cmbDia.setSize(350, 40);
		cmbDia.setLocation(120, 110);
		cmbDia.setVisible(false);
		
		lblHorario = new JLabel("Hor�rio");
		lblHorario.setLocation(10, 160);
		lblHorario.setSize(150, 40);
		lblHorario.setFont(fonte);
		lblHorario.setVisible(false);
		
		cmbHorarios = new JComboBox<String>();
		cmbHorarios.setSize(350, 40);
		cmbHorarios.setLocation(120, 160);
		cmbHorarios.setVisible(false);
		
		btnAgendar = new JButton("Marcar consulta");
		btnAgendar.setSize(250, 40);
		btnAgendar.setLocation(220, 210);
		btnAgendar.setFont(fonte);
		btnAgendar.setVisible(false);
		
		pnlPrincipal.add(lblMedico);
		pnlPrincipal.add(cmbMedico);
		pnlPrincipal.add(btnEscolherMedico);
		pnlPrincipal.add(lblEspecialidade);
		pnlPrincipal.add(cmbEspecialidade);
		pnlPrincipal.add(btnEscolherEspecialidade);
		pnlPrincipal.add(lblHorario);
		pnlPrincipal.add(cmbHorarios);
		pnlPrincipal.add(lblDia);
		pnlPrincipal.add(cmbDia);
		pnlPrincipal.add(btnAgendar);
		
		this.add(pnlPrincipal);
	}
	
	private void defineEventos() {
		btnEscolherEspecialidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				LinkedList<String> medicos = null;
				try {
					medicos = new MedicoDaoJDBC().listarNomesPorEspecialidade(cmbEspecialidade.getSelectedItem().toString());	
				} catch (Exception e) {}
				
				for (int i = 0; i < medicos.size(); i++) {
				    cmbMedico.addItem(medicos.get(i));
				}
				
				lblMedico.setVisible(true);
				cmbMedico.setVisible(true);
				
				btnEscolherMedico.setVisible(true);
			}
		});
		
		btnEscolherMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				lblHorario.setVisible(true);
				cmbHorarios.setVisible(true);
				btnAgendar.setVisible(true);
				lblDia.setVisible(true);
				cmbDia.setVisible(true);
			}
		});
		
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				//verificar se o hor�rio ja ta preenchido na agenda. se tiver n�o deixa marcar a consulta
			}
		});
	}
}
