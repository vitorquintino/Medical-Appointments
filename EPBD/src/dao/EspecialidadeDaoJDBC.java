package dao;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

import conexao.BaseDadosException;
import conexao.ConnectionFactory;
import dto.Paciente;

public class EspecialidadeDaoJDBC extends ConnectionFactory {

	
	public Vector<String> nomesDeTodasEspecialidades(String cpf) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL("SELECT NOME FROM ESPECIALIDADE;");
		Vector<String> lista = new Vector<>();

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
