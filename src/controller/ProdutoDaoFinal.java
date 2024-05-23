package controller;

/**
 * Classe responsável por fazer a conexão com o banco de dados
 *
 * DAO (Data Access Object) - Objeto de Acesso a Dados
 */
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.ProdutoModFinal;

public class ProdutoDaoFinal extends ConectarDaoFinal {    

    public ProdutoDaoFinal() {
        super();
    }

    public void incluir(ProdutoModFinal obj) {
        sql = "INSERT INTO produto VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, obj.getIdProduto());
            ps.setString(2, obj.getCategoria());
            ps.setString(3, obj.getProduto());
            ps.setString(4, obj.getTipo());
            ps.setInt(5, obj.getQuantidade());
            ps.setFloat(6, obj.getVlCompra());
            ps.setFloat(7, obj.getIcms());
            ps.setFloat(8, obj.getVlVenda());

            int adicionado = ps.executeUpdate();          
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Produto Incluído com Sucesso!");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo - Incluir\nErro ao incluir produto!\n" + err.getMessage());
        }
    }
    
    public void alterar(ProdutoModFinal obj) {
        sql = "UPDATE produto SET"
                + " categoria = ?,"
                + " produto = ?,"
                + " tipo = ?,"
                + " quantidade = ?,"
                + " vlCompra = ?,"
                + " icms = ?,"
                + " vlVenda = ? "
                + " WHERE idProduto = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getCategoria());
            ps.setString(2, obj.getProduto());
            ps.setString(3, obj.getTipo());
            ps.setInt(4, obj.getQuantidade());
            ps.setFloat(5, obj.getVlCompra());
            ps.setFloat(6, obj.getIcms());
            ps.setFloat(7, obj.getVlVenda());
            ps.setString(8, obj.getIdProduto());

            int adicionado = ps.executeUpdate();              
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Modulo alterar/Dao\nErro ao Alterar produto!\n" + err.getMessage());
        }
    }

    public ResultSet buscartodos() {
        sql = "SELECT * FROM produto ORDER BY produto ";

        try {
            ps = con.prepareStatement(sql);

            return ps.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo - buscartodos/Dao\nErro ao Buscar produto!\n" + err.getMessage());
           
            return null;
        }
    }

    public ResultSet buscar(ProdutoModFinal obj) {
        sql = "SELECT * FROM produto WHERE idProduto = ?";

        try {   // liga o sql com a conexão através do objeto ps
            ps = con.prepareStatement(sql);
            // configura o único parametro existente
            ps.setString(1, obj.getIdProduto());

            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo buscarPorId/Dao\nErro ao Buscar produto!\n" + err.getMessage());
            return null;
        }
    }

    public void excluir(String idProduto) {
        sql = "DELETE FROM produto WHERE idProduto = '" + idProduto + "'";

        try {          
            ps = con.prepareStatement(sql);
            
            int encontrou = ps.executeUpdate();
            if (encontrou > 0) {
                JOptionPane.showMessageDialog(null, "Produto Excluído com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo excluir/Dao\nErro ao Excluir Produto!\n" + err.getMessage());
        }
    }    
}