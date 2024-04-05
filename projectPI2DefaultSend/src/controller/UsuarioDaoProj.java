package controller;

/**
 * Classe respons√°vel por fazer a conex√£o com o banco de dados
 *
 *DAO (Data Access Object) - Objeto de Acesso a Dados 
 */

import model.UsuarioProj;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDaoProj extends ConectarDaoProj {

    private String sql;

    public UsuarioDaoProj() {
        super(); //chama a classe m√£e ConectarDaoProj, que recebe a heran√ßa atrav√©s do "extends"
    }

    public ResultSet validarLogin(String login, String senha) {
        sql = "Select * from users where login='" + login + "'"
                + " and senha = '" + senha + "'";
        try {
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }

    public void incluir(UsuarioProj obj) {
        sql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);            
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getEmail());
            ps.setString(3, obj.getCpf());                       
            ps.setString(4, obj.getCelular());
            ps.setInt(5, obj.getIdNivel());
            ps.setString(6, obj.getLogin());
            ps.setString(7, obj.getSenha());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro IncluÌ≠do com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usu·rio!" + err.getMessage());
        }
    }    
    
}
