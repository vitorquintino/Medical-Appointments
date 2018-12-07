package dao;

import java.sql.SQLException;
import java.util.LinkedList;

import conexao.BaseDadosException;
import conexao.ConnectionFactory;
import dto.Especialidade;
import dto.Paciente;

public class MedicoDaoJDBC extends ConnectionFactory {

	
	public LinkedList<String>  listarNomesPorEspecialidade(String especialidade) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL("SELECT NOME FROM medico WHERE CRM IN (SELECT CRMMEDICO FROM medicoEspecialidade WHERE CODIGOESPECIALIDADE "
				+ "= (SELECT CODIGO FROM especialidade WHERE NOME = '" + especialidade +"'));");
		
		LinkedList<String> lista = new LinkedList<>();

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
			
				String nome = rs.getString(1);


				lista.add(nome);
			}
		} catch (SQLException e) {

			throw new BaseDadosException("Falha ao buscar atividade no banco.");

		}
		fechaConexao();
		return lista;
	}
	
}
