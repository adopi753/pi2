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

public class ConectarDaoDef {

    public Connection mycon = null;
    public String sql = null;
    public PreparedStatement ps;
    public ResultSet rs;

    public ConectarDaoDef() {
        String strcon = "jdbc:mysql://localhost:3306/projdefault";//cria a string de conex�o ao servidor xaamp 
        try {
            mycon = DriverManager.getConnection(strcon, "root", "");          
            System.out.println("Conex�o com DB projdefault realizada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conex�o com Mysql n�o realizada!\n" + ex);
        }
    }
}
