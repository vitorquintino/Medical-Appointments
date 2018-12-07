package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaListarConsultas extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTable tblConsultas;
	private JPanel pnlPrincipal;
	
	public TelaListarConsultas() {
		this.setSize(new Dimension(900, 700));
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		inicializaTela();
	}
	
	public void inicializaTela() {
		Font fonte = new Font("Futura", Font.BOLD, 24);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLocation(10, 10);
		pnlPrincipal.setSize(880, 680);
		pnlPrincipal.setLayout(null);
		
		String[] colunas = {"Paciente", "Data", "Hora", "Médico"};
		tblConsultas = new JTable(new Object[][] {}, colunas);
		tblConsultas.getTableHeader().setFont(fonte);
		
		JScrollPane tabela = new JScrollPane(tblConsultas);
		tabela.setSize(800, 600);
		tabela.setLocation(0, 0);
		tabela.setFont(fonte);
		tabela.setFont(fonte);
		
		//adicionar todos os registros aqui
		
		pnlPrincipal.add(tabela);
		
		this.add(pnlPrincipal);
	}
}
