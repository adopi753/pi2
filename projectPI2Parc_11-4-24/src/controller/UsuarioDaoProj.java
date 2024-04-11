package controller;

/**
 * Classe responsável por fazer a conexão com o banco de dados
 *
 * DAO (Data Access Object) - Objeto de Acesso a Dados
 */
import model.UsuarioProj;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDaoProj extends ConectarDaoProj {

    public UsuarioDaoProj() {
        super(); //chama a classe m�e ConectarDaoProj, que recebe a heran�a atrav�s do "extends"
    }

    public ResultSet validarLogin(String login, String senha) {
        sql = "Select * from users where login='" + login + "'"
                + " and senha = '" + senha + "'";
        try {

            ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;//armazena o retorno do DB

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }

    public void incluir(UsuarioProj obj) {

        sql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
                ps = mycon.prepareStatement(sql);
                ps.setString(1, obj.getNome());
                ps.setString(2, obj.getEmail());
                ps.setString(3, obj.getCpf());
                ps.setString(4, obj.getCelular());
                ps.setInt(5, obj.getIdNivel());
                ps.setString(6, obj.getLogin());
                ps.setString(7, obj.getSenha());
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(null, "Registro inclu�do com Sucesso!");
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir"
                    + "usu�rio!" + err.getMessage());
        }

    }

    public void alterar(UsuarioProj obj) {
        sql = "UPDATE USERS SET nome=?, email=?, cpf=?, celular=? idNivel=? login=? senha=? WHERE cpf=?";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getEmail());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getCelular());
            ps.setInt(5, obj.getIdNivel());
            ps.setString(6, obj.getLogin());
            ps.setString(7, obj.getSenha());
            //ps.setString(8, obj.getCpf());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usu�rio!\n" + err.getMessage());
        }
    }

    public ResultSet buscartodos() {
        sql = "SELECT * FROM USERS ORDER BY nome ";
        try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usu�rio!"
                    + err.getMessage());
            return null;
        }
    }

    public ResultSet buscar(UsuarioProj obj) {
        // para buscar um registro especifico cria-se um sql com um par�metro chave
        // no caso a busca est� sendo feita pelo cpf do usuario
        sql = "SELECT * FROM USERS WHERE CPF = ?";

        try { // liga o sql com a conex�o atrave? do objeto ps
            ps = mycon.prepareStatement(sql);
            // configura o �nico parametro existente
            ps.setString(1, obj.getCpf());
            // retorna o registro selecionado
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usu�rio!"
                    + err.getMessage());
            return null;
        }
    }

    public void excluir(String cpf) {
        // configura o comando sql de exclus�o delete por cpf
        sql = "DELETE FROM USERS WHERE CPF = '" + cpf + "'";

        try { // envia o comando sql para dentro da conex�o atrav�s de
            ps = mycon.prepareStatement(sql);

            Object[] options = {"Sim", "N�o"};
            int i = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            if (i == 0) {
                // executa o comando delete dentro do mysql
                ps.execute();
                ps.close(); // fecha o objeto usado para executar o comando sql
                JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso !");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir usu�rio!"
                    + err.getMessage());
        }
    }

}
