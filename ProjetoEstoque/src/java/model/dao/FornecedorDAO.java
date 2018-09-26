/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.FornecedorBean;
import model.factory.ConnectionFactory;

/**
 *
 * @author Marcelo
 */
public class FornecedorDAO {
    private Connection con;

    public FornecedorDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public List<FornecedorBean> buscarTodos() {
        List<FornecedorBean> listFornecedor = new ArrayList<>();
        String sql = "select * from fornecedor";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FornecedorBean fornecedorBean = new FornecedorBean(rs.getString("nome"), rs.getString("endereco"), rs.getString("cnpj"), rs.getString("inscricao"),rs.getString("telefone"), rs.getString("email"),rs.getString("nome_fanta"));
                listFornecedor.add(fornecedorBean);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listFornecedor;
    }

    public void cadastrar(FornecedorBean fornecedor) {
        String sql = "insert into fornecedor(nome, endereco, cnpj, inscricao, telefone, email, nome_fanta) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getEndereco());
            ps.setString(3, fornecedor.getCnpj());
            ps.setString(4, fornecedor.getInscricao());
            ps.setString(5, fornecedor.getTelefone());
            ps.setString(6, fornecedor.getEmail());
            ps.setString(7, fornecedor.getNome_fanta());
            
 
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
