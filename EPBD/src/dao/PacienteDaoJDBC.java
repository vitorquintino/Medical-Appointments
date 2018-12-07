package dao;

import java.sql.SQLException;

import conexao.BaseDadosException;
import conexao.ConnectionFactory;
import dto.Paciente;

public class PacienteDaoJDBC extends ConnectionFactory {

	public Paciente buscaCPF(String cpf) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL("select * from paciente where cpf = \"" + cpf + "\";");
		Paciente paciente1 = null;

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
			
				int idPaciente = rs.getInt(1);
				String cpf1 = rs.getString(2);
				String nome = rs.getString(3);
				String telefone = rs.getString(4);
				String endereco = rs.getString(5);
				int idade = rs.getInt(6);
				String sexo = rs.getString(7);

				paciente1 = new Paciente(idPaciente, cpf1, idade, telefone,endereco,sexo,nome);
			}
		} catch (SQLException e) {

			throw new BaseDadosException("Falha ao buscar atividade no banco.");

		}
		fechaConexao();
		return paciente1;
	}
	
	public void insere(Paciente paciente) throws BaseDadosException {

		abreConexao();
		preparaComandoSQL("insert into paciente (cpf, nome, telefone, endereco, idade,"
				+ " sexo) values(?,?,?,?,?,?);");

		try {
			
			pstmt.setString(1, paciente.getCpf());
			pstmt.setString(2, paciente.getNome());
			pstmt.setString(3, paciente.getTelefone());
			pstmt.setString(4, paciente.getEndereco());
			pstmt.setInt(5, paciente.getIdade());
			pstmt.setString(6, paciente.getSexo());
			pstmt.execute();

			

		} catch (SQLException e) {

			throw new BaseDadosException("Erro ao cadastrar aluno.");
		}

		fechaConexao();
	}
	
	
	
	
}
