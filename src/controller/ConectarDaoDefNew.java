package controller;

/**
 * Classe respons�vel por fazer a conex�o com o banco de dados
 *
 * DAO (Data Access Object) - Objeto de Acesso a Dados
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectarDaoDefNew {

    public Connection conexao = null;
    public String sql = null;
    public PreparedStatement ps;
    public ResultSet rs;

    public ConectarDaoDefNew() {
        String strcon = "jdbc:mysql://127.0.0.1:3306/projdefaultnew";//cria a string de conex�o ao servidor xaamp 
        try {
            conexao = DriverManager.getConnection(strcon, "Admin", "4062*Amparo");
            System.out.println("Banco de dados conectado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conex�o com DB n�o realizada!\n" + ex);
        }
    }
   
}
