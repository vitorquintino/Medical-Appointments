package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.LinkedList;

import conexao.BaseDadosException;
import conexao.ConnectionFactory;
import dto.Consulta;
import dto.ListaConsultas;

public class ListaConsultasJDBC extends ConnectionFactory {
	
	public LinkedList<ListaConsultas> listaConsultas() throws BaseDadosException {
		abreConexao();
		preparaComandoSQL("SELECT P.NOME ,C.CONSDATA, C.INICIO, MED.NOME FROM CONSULTA C INNER JOIN MEDICOESPECIALIDADE MESP ON C.CRMMEDICO"
				+ " = MESP.CRMMEDICO INNER JOIN MEDICO MED ON MESP.CRMMEDICO = MED.CRM INNER JOIN PACIENTE P ON C.IDPACIENTE = P.IDPACIENTE ORDER BY MED.NOME, C.CONSDATA, C.INICIO;");
		LinkedList<ListaConsultas> lista = new LinkedList<>();

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
				
				String nomePaciente = rs.getString(1);
				Date dataDaConsulta = rs.getDate(2);
				Time hora = rs.getTime(3);
				String nomeDoMedico = rs.getString(4);

				
				ListaConsultas nova = new ListaConsultas(nomePaciente, dataDaConsulta, hora, nomeDoMedico);
				
				lista.add(nova);
			}
		} catch (SQLException e) {

			throw new BaseDadosException("Falha ao buscar atividade no banco.");

		}
		fechaConexao();
		return lista;
	}
}
