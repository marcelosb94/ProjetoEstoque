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
import model.bean.UsuarioBean;
import model.factory.ConnectionFactory;

/**
 *
 * @author Marcelo
 */
public class UsuarioDAO {
    
    private Connection con;

    public UsuarioDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public List<UsuarioBean> buscarTodosUsuarios() {
        
        String sql = "SELECT * FROM usuario";
        
        List<UsuarioBean> listUser = new ArrayList<UsuarioBean>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                UsuarioBean userBean = new UsuarioBean();
                
                userBean.setNome(rs.getString("nome"));/**Nome,Cargo,Setor,Email,Senha**/
                userBean.setCargo(rs.getString("cargo"));
                userBean.setSetor(rs.getString("email"));
                userBean.setEmail(rs.getString("email"));
                userBean.setPwd(rs.getString("senha"));              
                
                listUser.add(userBean);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }

    public void cadastrar(UsuarioBean aluno) {
        String sql = "insert into usuario(nome,senha,cargo,setor,email) values(?,?,?,?,?)";
        try {                                                       /**Nome,Cargo,Setor,Email,Senha**/
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getPwd());
            ps.setString(3, aluno.getCargo());
            ps.setString(4, aluno.getSetor());
            ps.setString(5, aluno.getEmail());
            
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // VALIDAR LOGIN DO USUARIO
    public boolean autenticar(String nome, String senha) {
        String sql = "select * from usuario where nome=? and senha=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
}
