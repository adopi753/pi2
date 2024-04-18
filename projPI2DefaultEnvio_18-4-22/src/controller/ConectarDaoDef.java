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

public class ConectarDaoDef {

    public Connection mycon = null;
    public String sql = null;
    public PreparedStatement ps;
    public ResultSet rs;

    public ConectarDaoDef() {
        String strcon = "jdbc:mysql://localhost:3306/projdefault";//cria a string de conexão ao servidor xaamp 
        try {
            mycon = DriverManager.getConnection(strcon, "root", "");          
            System.out.println("Conexão com DB projdefault realizada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }
}
