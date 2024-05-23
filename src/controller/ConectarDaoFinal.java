package controller;

/**
 * Classe responsável por fazer a conexão com o banco de dados
 *
 * DAO (Data Access Object) - Objeto de Acesso a Dados
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectarDaoFinal {

    public PreparedStatement ps;
    public ResultSet rs;
    public String sql = null;
    public Connection con;
    private String url = "jdbc:mysql://localhost:3306/projfinal";;
    private String user = "root";
    private String password = "";
        

    public ConectarDaoFinal() {        
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Banco de dados conectado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com DB não realizada!\n" + ex);
        }
    }   
}
