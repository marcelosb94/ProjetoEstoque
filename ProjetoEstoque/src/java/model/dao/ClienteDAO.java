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
import model.bean.ClienteBean;
import model.factory.ConnectionFactory;

/**
 *
 * @author Marcelo
 */
public class ClienteDAO {
    private Connection con;

    public ClienteDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public List<ClienteBean> buscarTodos(){
    
        String sql = "SELECT * FROM cliente";
        
        List<ClienteBean> listcli = new ArrayList<ClienteBean>();
        
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                ClienteBean clientebean = new ClienteBean();
                
                clientebean.setId(rs.getInt("id"));
                clientebean.setNome(rs.getString("nome"));
                clientebean.setEndereco(rs.getString("endereco"));
                clientebean.setCpf_cnpj(rs.getString("cpf_cnpj"));
                clientebean.setCidade(rs.getString("cidade"));
                clientebean.setUf(rs.getString("uf"));
                clientebean.setBairro(rs.getString("bairro"));
                clientebean.setTelefone(rs.getString("telefone"));
                clientebean.setEmail(rs.getString("email"));
                
                listcli.add(clientebean);
            }          
            rs.close();
            ps.close();
            con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listcli;
    }
    
    
    public void cadastrar (ClienteBean cliente){
    
        String sql = "insert into cliente(nome, endereco, cpf_cnpj, cidade, uf, bairro, telefone, email) values(?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCpf_cnpj());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getBairro());
            ps.setString(7, cliente.getTelefone());
            ps.setString(8, cliente.getEmail());
            
            ps.executeUpdate();
            ps.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void alterar (ClienteBean cliente){
        
        String sql = "UPDATE cliente SET nome=?,endereco=?,cpf_cnpj=?,cidade=?,uf=?,bairro=?,telefone=?,email=? WHERE id=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCpf_cnpj());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getBairro());
            ps.setString(7, cliente.getTelefone());
            ps.setString(8, cliente.getEmail());
            ps.setInt(9, cliente.getId());
            
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean deletar(ClienteBean cliente){
        String sql = "DELETE FROM cliente WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, cliente.getId());
            
            ps.execute();
            ps.close();
            con.close();            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return true;
    } 
    
    
    public ClienteBean buscar (ClienteBean cliente){
        String sql = "SELECT * FROM cliente WHERE id=?";
        
        ClienteBean clienteb = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                clienteb = new ClienteBean();
                clienteb.setId(rs.getInt("id"));
                clienteb.setNome(rs.getString("nome"));
                clienteb.setEndereco(rs.getString("endereco"));
                clienteb.setCpf_cnpj(rs.getString("cpf_cnpj"));
                clienteb.setCidade(rs.getString("cidade"));
                clienteb.setUf(rs.getString("uf"));
                clienteb.setBairro(rs.getString("bairro"));
                clienteb.setTelefone(rs.getString("telefone"));
                clienteb.setEmail(rs.getString("email"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return clienteb;
    
    }
    
    
    
}
