package controller;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.UsuarioModFinal;

public class UsuarioDaoFinal extends ConectarDaoFinal {    

    public UsuarioDaoFinal() {
        super();
    }

    public void incluir(UsuarioModFinal obj) {        
        sql = "INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {                        
            ps = con.prepareStatement(sql);

            ps.setString(1, obj.getCpf());
            ps.setString(2, obj.getPerfil());
            ps.setString(3, obj.getNome());
            ps.setString(4, obj.getCelular());
            ps.setString(5, obj.getEmail());
            ps.setString(6, obj.getSenha());
            ps.setString(7, obj.getRua());
            ps.setString(8, obj.getNumero());
            ps.setString(9, obj.getComplemento());
            ps.setString(10, obj.getBairro());
            ps.setString(11, obj.getCidade());
            ps.setString(12, obj.getEstado());

            int adicionado = ps.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso!");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo Incluir/Dao\nErro ao incluir usuário!\n" + err.getMessage());
        }
    }
   
    public ResultSet validarLogin(String login, String senha) {
        sql = "SELECT * FROM users WHERE ucase(email) = ucase('" + login + "') "
                + "and senha = ucase('" + senha + "')";

        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();           

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Modulo validarLogin/Dao\nErro ao fazer login!\n" + erro.getMessage());
            return null;
        }
    }
    
    public ResultSet validarCadastro(String cpf) {
        sql = "SELECT * FROM users WHERE ucase(cpf) = ucase('" + cpf + "')";

        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();          

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Modulo validarCadastro/Dao\nErro ao fazer login!\n" + erro.getMessage());
            return null;
        }
    }

    public ResultSet buscartodos() {        
        sql = "SELECT * FROM users ORDER BY nome ";

        try {
            ps = con.prepareStatement(sql);
            
            return ps.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo buscartodos/Dao\nErro ao Buscar usuário!\n" + err.getMessage());
            
            return null;
        }
    }

    public ResultSet buscar(UsuarioModFinal obj) {
        sql = "SELECT * FROM users WHERE CPF = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getCpf());

            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo buscarPorCPF/Dao\nErro ao Buscar usuário!\n" + err.getMessage());
            return null;
        }
    }

    public void excluir(String cpf) {
        sql = "DELETE FROM users WHERE CPF = '" + cpf + "'";

        try {         
            ps = con.prepareStatement(sql);
            int encontrou = ps.executeUpdate();
            if (encontrou > 0) {
                JOptionPane.showMessageDialog(null, "Registro de Usuário Excluido com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo excluir/Dao\nErro ao Excluir usuário!\n" + err.getMessage());
        }
    }

    public void alterar(UsuarioModFinal obj) {
        sql = "UPDATE users SET"
                + " perfil = ?,"
                + " nome = ?,"
                + " celular = ?,"
                + " email = ?,"
                + " senha = ?,"
                + " rua = ?,"
                + " numero = ?, "
                + " complemento =  ?,"
                + " bairro =  ?, "
                + " cidade =  ?,"
                + " estado =  ?"
                + " WHERE cpf = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getPerfil());
            ps.setString(2, obj.getNome());
            ps.setString(3, obj.getCelular());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getSenha());
            ps.setString(6, obj.getRua());
            ps.setString(7, obj.getNumero());
            ps.setString(8, obj.getComplemento());
            ps.setString(9, obj.getBairro());
            ps.setString(10, obj.getCidade());
            ps.setString(11, obj.getEstado());
            ps.setString(12, obj.getCpf());

            int adicionado = ps.executeUpdate();              
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso!");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Modulo alterar/Dao\nErro ao Alterar usuário!\n" + err.getMessage());
        }
    }
}
