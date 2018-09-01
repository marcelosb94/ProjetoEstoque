/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class ConnectionFactory {
   /** private final String url_conexao = "jdbc:mysql://localhost/system_jsp";*/
    private final String url_conexao = "jdbc:mysql://localhost/projeto_estoque";

    private final String usuario = "root";
    private final String senha = "";
    private Connection conexao = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url_conexao, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falha ao se conectar ao banco (ConnectionFactory): " + ex.getMessage());
            throw new RuntimeException("Erro em ConnectionFactory!", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Classe não encontrada (ConnectionFactory): " + ex.getMessage());
            throw new RuntimeException("Erro em ConnectionFactory!", ex);
        }
        return conexao;
    }
    
    
}
