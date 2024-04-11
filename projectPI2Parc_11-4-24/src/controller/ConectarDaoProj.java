package controller;

/**
 * Classe responsável por fazer a conexão com o banco de dados
 *
 *DAO (Data Access Object) - Objeto de Acesso a Dados 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDaoProj {

    public Connection mycon = null;
    public String sql = null;
    public PreparedStatement ps;

    public ConectarDaoProj() {
        String strcon = "jdbc:mysql://localhost:3306/projcadteste";//cria a string de conexão ao servidor xaamp 
        try {

            mycon = DriverManager.getConnection(strcon, "root", "");
            //this.criarTables();
            System.out.println("Conexão com DB projcadteste realizada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }

    public void criarTables() {
        sql = " CREATE TABLE IF NOT EXISTS LEVELS ("
                + "idNivel int (10) UNSIGNED not null AUTO_INCREMENT PRIMARY KEY, "
                + "descricao varchar(30) not null, ";

        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar table niveis!\n" + err.getMessage());
        }

        sql = " CREATE TABLE IF NOT EXISTS USERS ("                
                + "nome varchar(50) not null, "
                + "email varchar(50) not null, "
                + "cpf varchar (15) not null PRIMARY KEY, "
                + "celular varchar(20) not null,"
                + "idNivel int (10) UNSIGNED not null, "
                + "login varchar(20) not null, "
                + "senha varchar(20) not null, "
                + "FOREIGN KEY (idNivel) REFERENCES niveis (idNivel),";
        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela users \n" + err.getMessage());
        }
    }

    public void testCriarTables(){
        criarTables();
    }
}
