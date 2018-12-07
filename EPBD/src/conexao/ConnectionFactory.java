package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



//devemos nos atentar ao "string url", root e a senha
public class ConnectionFactory {

    protected static Connection con;
    protected static PreparedStatement pstmt;
    protected static ResultSet rs;
    protected static final String DB = "titanweb1";

    protected static Connection getConnection() throws BaseDadosException {
        String url = "jdbc:mysql://localhost/" + DB + "?serverTimezone=UTC&useSSL=false";
        try {


            return DriverManager.getConnection(url, "root", "1234");


        } catch (SQLException ex) {
            System.out.println("Deu erro no connection factory");
            ex.printStackTrace();
            return null;
        }

    }

    protected static Connection getConnection1() throws BaseDadosException {
        String url = "jdbc:mysql://localhost/?serverTimezone=UTC&useSSL=false";
        try {


            return DriverManager.getConnection(url, "root", "tiocon");



        } catch (SQLException ex) {
            System.out.println("Deu erro no connection factory 1");
            ex.printStackTrace();
            return null;
        }

    }

    /**
     * *******************************************************************************
     * CONEXAO COM BANDO DE DADOS 
   ********************************************************************************
     */

    //conecta com banco de dados
    protected static void abreConexao() throws BaseDadosException {
        con = new ConnectionFactory().getConnection();

    }

    protected static void abreConexao1() throws BaseDadosException {
        con = new ConnectionFactory().getConnection1();

    }

    //fecha conexao com bando de dados 
    protected static void fechaConexao() throws BaseDadosException {

        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }

            if (pstmt != null) {
                pstmt.close();
                pstmt = null;
            }

            if (con != null) {
                con.close();
                con = null;
            }
        } catch (SQLException e) {
            System.out.println("Nao foi possivel fechar conexao");
        }
    }

    protected static void preparaComandoSQL(String sql) throws BaseDadosException {
        try {
            pstmt = con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Problemas no acesso ao banco de dados.");
        }
    }
}