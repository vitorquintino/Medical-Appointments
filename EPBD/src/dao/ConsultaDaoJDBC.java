package dao;

import java.sql.SQLException;

import conexao.BaseDadosException;
import conexao.ConnectionFactory;
import dto.Consulta;
import dto.Paciente;

public class ConsultaDaoJDBC extends ConnectionFactory {

	public void insere(Consulta consulta) throws BaseDadosException {

		abreConexao();
		preparaComandoSQL("insert into consulta (data, inicio, fim, pagou, valorPago,"
				+ " formaPagamento, codigoEspecialidade, crmMedico, idPaciente) values(?,?,?,?,?,?,?,?,?);");

		try {
			
			
			
			pstmt.setDate(1, consulta.getData());
			pstmt.setTime(2, consulta.getInicio());
			pstmt.setTime(3, consulta.getFim());
			pstmt.setInt(4, consulta.getPagou());
			pstmt.setLong(5, consulta.getValorPago());
			pstmt.setString(6, consulta.getFormaPagamento());
			pstmt.setInt(7, consulta.getCodigoEspecialidade());
			pstmt.setInt(8, consulta.getCrmMedico());
			pstmt.setInt(9, consulta.getIdPaciente());
			pstmt.execute();

			

		} catch (SQLException e) {

			throw new BaseDadosException("Erro ao cadastrar aluno.");
		}

		fechaConexao();
	}
	
	
}
