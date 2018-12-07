package dao;

import java.sql.SQLException;
import java.util.LinkedList;

import conexao.BaseDadosException;
import conexao.ConnectionFactory;
import dto.Especialidade;
import dto.Paciente;

public class MedicoDaoJDBC extends ConnectionFactory {

	
	public LinkedList<String>  listarNomesPorEspecialidade(Especialidade especialidade) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL("SELECT NOME FROM MEDICO WHERE CRM IN (SELECT CRMMEDICO FROM MEDICOESPECIALIDADE WHERE CODIGOESPECIALIDADE "
				+ "= (SELECT CODIGO FROM ESPECIALIDADE WHERE NOME = '" + especialidade.getNome() +"'));;");
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
