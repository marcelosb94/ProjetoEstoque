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
import model.bean.ProdutoBean;
import model.factory.ConnectionFactory;

/**
 *
 * @author Marcelo
 */
public class ProdutoDAO {
    private Connection con;
    
    public ProdutoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public List<ProdutoBean> buscarTodos() {
        
        String sql = "SELECT * FROM produto";
        
        List<ProdutoBean> listProduto = new ArrayList<ProdutoBean>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                ProdutoBean produtoBean = new ProdutoBean();
                
                produtoBean.setId(rs.getInt("id"));
                produtoBean.setNome_produto(rs.getString("nome_produto"));
                produtoBean.setCategoria_produto(rs.getString("categoria_produto"));
                produtoBean.setPreco_produto(rs.getString("preco_produto"));
                produtoBean.setQtd_produto(rs.getString("qtd_produto"));
                produtoBean.setPonto_critico(rs.getString("ponto_critico"));
                                            
                
                listProduto.add(produtoBean);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProduto;
    }
    
    public void cadastrar(ProdutoBean produto) {
        String sql = "insert into produto(nome_produto,categoria_produto,preco_produto,qtd_produto,ponto_critico) values(?,?,?,?,?)";
        try {                                                       
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome_produto());
            ps.setString(2, produto.getCategoria_produto());
            ps.setString(3, produto.getPreco_produto());
            ps.setString(4, produto.getQtd_produto());
            ps.setString(5, produto.getPonto_critico());
           
            
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Atualizar cadastro
        public void alterar(ProdutoBean produto) {
        String sql = "UPDATE produto SET nome_produto=?,categoria_produto=?,preco_produto=?,qtd_produto=?,ponto_critico=? WHERE id=?";
        try {                                                       
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome_produto());
            ps.setString(2, produto.getCategoria_produto());
            ps.setString(3, produto.getPreco_produto());
            ps.setString(4, produto.getQtd_produto());
            ps.setString(5, produto.getPonto_critico());
            ps.setInt(6, produto.getId());
            
            
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //Deletar Produto
        public boolean deletar(ProdutoBean produto){
        String sql = "DELETE FROM produto WHERE id=?";
        try {                                                       
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, produto.getId());
            
            ps.execute();
            ps.close();
            con.close();
            System.out.println("Produto excluido");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return true;
        }
        
        
        public ProdutoBean buscar(ProdutoBean produto) {        
        String sql = "SELECT * FROM produto WHERE id=?";        
        ProdutoBean produtop = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, produto.getId());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                produtop = new ProdutoBean();                
                produtop.setId(rs.getInt("id"));
                produtop.setNome_produto(rs.getString("nome_produto"));
                produtop.setCategoria_produto(rs.getString("categoria_produto"));
                produtop.setPreco_produto(rs.getString("preco_produto"));
                produtop.setQtd_produto(rs.getString("qtd_produto"));
                produtop.setPonto_critico(rs.getString("ponto_critico"));
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtop;
       
    }

        
}
