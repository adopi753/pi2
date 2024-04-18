package controller;

/**
 * Classe responsável por fazer a conexão com o banco de dados
 *
 * DAO (Data Access Object) - Objeto de Acesso a Dados
 */
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.ProdutoDef;

public class ProdutoDaoDef extends ConectarDaoDef {

    
    
    public ProdutoDaoDef() {
        super(); //chama a classe m�e ConectarDaoDef, que recebe a heran�a atrav�s do "extends"
    }

    public void incluir(ProdutoDef obj) {
        //Cria o comando SQL com 8 par�metros ?, ?......
        sql = "INSERT INTO PRODUTO VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Envia o SQL para dentro da conex�o
            ps = mycon.prepareStatement(sql);

            // Configura a posi��o de cada par�metro come�ando pelo primeiro
            //OBS.: LEMBRAR DE INSERIR A QUANTIDADE DE "?" REFERENTES AS LINHAS ABAIXO
            ps.setInt(1, obj.getIdProduto());            
            ps.setInt(2, obj.getFk_idCategoria());
            ps.setString(3, obj.getProduto());
            ps.setString(4, obj.getTipo());
            ps.setInt(5, obj.getQuantidade());
            ps.setFloat(6, obj.getVlCompra());
            ps.setFloat(7, obj.getIcms());
            ps.setFloat(8, obj.getVlVenda());
            ps.execute(); // Finalmente executa o comando sql dentro de ps
            ps.close();// finaliza o comando de execu��o do sql

            JOptionPane.showMessageDialog(null, "Registro Inclu�do com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usu�rio!\n" + err.getMessage());
        }
    }

    public ResultSet buscartodos() {
        sql = "SELECT * FROM PRODUTO ORDER BY produto ";

        try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usu�rio!" + err.getMessage());          
            return null;
        }
    }

    public ResultSet buscar(ProdutoDef obj) {
        sql = "SELECT * FROM PRODUTO WHERE idProduto = ?";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getIdProduto());

            // retorna o registro selecionado
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto!" + err.getMessage());
            return null;
        }
    }

    public void excluir(String idProduto) {
        // configura o comando sql de exclus�o delete por cpf
        sql = "DELETE FROM PRODUTO WHERE IDPRODUTO = '" + idProduto + "'";

        try { 
            ps = mycon.prepareStatement(sql);           
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir usu�rio!" + err.getMessage());
        }
    }

    public void alterar(ProdutoDef obj) {
        sql = "UPDATE PRODUTO SET fk_idCategoria = ?, produto = ?, tipo = ?, quantidade = ?,"
                + " vlCompra = ?, icms = ?, vlVenda = ? WHERE idProduto = ?";
        try {
            //OBS.: o DB deve seguir essa mesma seguencia
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getFk_idCategoria());
            ps.setString(2, obj.getProduto());
            ps.setString(3, obj.getTipo());
            ps.setInt(4, obj.getQuantidade());
            ps.setFloat(5, obj.getVlCompra());
            ps.setFloat(6, obj.getIcms());
            ps.setFloat(7, obj.getVlVenda());
            ps.setInt(8, obj.getIdProduto());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao Alterar usu�rio!\n" + err.getMessage());
        }
    }
}