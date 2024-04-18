package controller;

/**
 * Classe responsável por fazer a conexão com o banco de dados
 *
 * DAO (Data Access Object) - Objeto de Acesso a Dados
 */
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.UsuarioDef;

public class UsuarioDaoDef extends ConectarDaoDef {

    
    
    public UsuarioDaoDef() {
        super(); //chama a classe m�e ConectarDaoDef, que recebe a heran�a atrav�s do "extends"
    }

    public void incluir(UsuarioDef obj) {
        //Cria o comando SQL com 12 par�metros ?, ?......
        sql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Envia o SQL para dentro da conex�o
            ps = mycon.prepareStatement(sql);

            // Configura a posi��o de cada par�metro come�ando pelo primeiro
            //OBS.: LEMBRAR DE INSERIR A QUANTIDADE DE "?" REFERENTES AS LINHAS ABAIXO
            ps.setString(1, obj.getCpf());
            ps.setInt(2, obj.getFk_IdNivel());
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
            ps.execute(); // Finalmente executa o comando sql dentro de ps
            ps.close();// finaliza o comando de execu��o do sql

            JOptionPane.showMessageDialog(null, "Registro Inclu�do com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usu�rio!\n" + err.getMessage());
        }
    }

// Resultset armazena um array de registros   
    public ResultSet validarLogin(String login, String senha) {
        // cria o comando sql para executar dentro do MySQL
        sql = "SELECT * , if(fk_IdNivel = 1, 'Administrador', 'Usu�rio') as nivel "
                + "FROM USERS WHERE ucase(email) = ucase('" + login + "') "
                + "and senha = ucase('" + senha + "')";

        try {   // prepara a execu��o do comando sql dentro da conex�o mycon
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery(); // retorna a execu��o do comando sql 

            // toda consulta em banco de dados deve ter um tratamento de erros
            // A classe SQLException faz o tratamento de erros
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usu�rio!" + err.getMessage());
            return null;
            // se haver erro armazena null na ResultSet
        }
    }

    public ResultSet buscartodos() {
        // o comando select traz um conjunto de registros
        // e armazena dentro de um ResultSet
        sql = "SELECT * FROM USERS ORDER BY nome ";

        try {   // armazena o comando sql dentro da conex�o mycon
            ps = mycon.prepareStatement(sql);

            // retorna um ResultSet com os registros selecionados
            return ps.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usu�rio!" + err.getMessage());
            // Se haver erros exibe a mensagem e returno nulo dentro 
            // do ResultSet
            return null;
        }
    }

    public ResultSet buscar(UsuarioDef obj) {

// para buscar um registro especifico cria-se um sql com um par�metro chave
        // no caso a busca est� sendo feita pelo cpf do usuario
        sql = "SELECT * FROM USERS WHERE CPF = ?";

        try {   // liga o sql com a conex�o atrave? do objeto ps
            ps = mycon.prepareStatement(sql);

            // configura o �nico parametro existente
            ps.setString(1, obj.getCpf());

            // retorna o registro selecionado
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usu�rio!" + err.getMessage());
            return null;
        }
    }

    public void excluir(String cpf) {
        // configura o comando sql de exclus�o delete por cpf
        sql = "DELETE FROM USERS WHERE CPF = '" + cpf + "'";

        try { // envia o comando sql para dentro da conex�o atrav�s de ps
            ps = mycon.prepareStatement(sql);
            // executa o comando delete dentro do mysql
            ps.execute();
            ps.close(); // fecha o objeto usado para executar o comando sql

            JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir usu�rio!" + err.getMessage());
        }
    }

    public void alterar(UsuarioDef obj) {
        sql = "UPDATE USERS SET fk_IdNivel = ?, nome = ?, celular = ?, email = ?,"
                + " senha = ?, rua = ?, numero = ?, complemento =  ?, bairro =  ?, "
                + "cidade =  ?, estado =  ? WHERE cpf = ?";
        try {
            //OBS.: o DB deve seguir essa mesma seguencia
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getFk_IdNivel());
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
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao Alterar usu�rio!\n" + err.getMessage());
        }
    }
}
