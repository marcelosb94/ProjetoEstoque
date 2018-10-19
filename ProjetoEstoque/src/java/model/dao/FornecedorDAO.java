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
    
    public List<FornecedorBean> buscarTodos(){
        
        String sql = "SELECT * FROM fornecedor";
        
        List<FornecedorBean> listforn = new ArrayList<FornecedorBean>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                FornecedorBean fornecedorbean = new FornecedorBean();
                
                fornecedorbean.setId(rs.getInt("id"));
                fornecedorbean.setNome(rs.getString("nome"));
                fornecedorbean.setEndereco(rs.getString("endereco"));
                fornecedorbean.setCnpj(rs.getString("cnpj"));
                fornecedorbean.setInscricao(rs.getString("inscricao"));
                fornecedorbean.setTelefone(rs.getString("telefone"));
                fornecedorbean.setEmail(rs.getString("email"));
                fornecedorbean.setNome_fanta(rs.getString("nome_fanta"));
                
                listforn.add(fornecedorbean);
            }
            
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listforn;
    
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
    
        public void alterar(FornecedorBean fornecedor) {
        String sql = "UPDATE fornecedor SET nome=?,endereco=?,cnpj=?,inscricao=?,telefone=?,email=?,nome_fanta=? WHERE id=?";
        try {                                                       
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getEndereco());
            ps.setString(3, fornecedor.getCnpj());
            ps.setString(4, fornecedor.getInscricao());
            ps.setString(5, fornecedor.getTelefone());
            ps.setString(6, fornecedor.getEmail());
            ps.setString(7, fornecedor.getNome_fanta());
            ps.setInt(8, fornecedor.getId());
            
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //Deletar 
        public boolean deletar(FornecedorBean fornecedor){
        String sql = "DELETE FROM fornecedor WHERE id=?";
        try {                                                       
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, fornecedor.getId());
            
            ps.execute();
            ps.close();
            con.close();
            System.out.println("fornecedor excluido");
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return true;
        }
        
        
        public FornecedorBean buscar(FornecedorBean fornecedor) {        
        String sql = "SELECT * FROM fornecedor WHERE id=?";        
        //UsuarioBean usuariob = new UsuarioBean();
        FornecedorBean fornecedorb = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, fornecedor.getId());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                fornecedorb = new FornecedorBean();                
                fornecedorb.setId(rs.getInt("id"));
                fornecedorb.setNome(rs.getString("nome"));
                fornecedorb.setEndereco(rs.getString("endereco"));
                fornecedorb.setCnpj(rs.getString("cnpj"));
                fornecedorb.setInscricao(rs.getString("inscricao"));
                fornecedorb.setTelefone(rs.getString("telefone"));
                fornecedorb.setEmail(rs.getString("email"));
                fornecedorb.setNome_fanta(rs.getString("nome_fanta"));              
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fornecedorb;
       // return usuariob.find(UsuarioBean.class, usuario);
    }

    
    
    
}
