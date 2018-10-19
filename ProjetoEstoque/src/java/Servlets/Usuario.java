/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.UsuarioBean;
import model.dao.UsuarioDAO;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "Usuario", urlPatterns = {"/Usuario"})
public class Usuario extends HttpServlet{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String funcao = request.getParameter("funcao");
           

            if (funcao.equals("cadastrar")) {
                UsuarioDAO usuario = new UsuarioDAO();
                
                String nome = request.getParameter("nome");
                String pwd = request.getParameter("senha");
                String cargo = request.getParameter("cargo");
                String setor = request.getParameter("setor");
                String email = request.getParameter("email");
                
                UsuarioBean usuarioBean = new UsuarioBean();
                
                usuarioBean.setNome(nome);
                usuarioBean.setPwd(pwd);
                usuarioBean.setCargo(cargo);
                usuarioBean.setSetor(setor);
                usuarioBean.setEmail(email);
                
                usuario.cadastrar(usuarioBean);                
                response.sendRedirect("usuario.jsp");
            }
            
            if (funcao.equals("alterar")) {
                
                UsuarioBean usuarioBean = new UsuarioBean();
                
                usuarioBean.setId(Integer.parseInt(request.getParameter("id")));
                usuarioBean.setNome(request.getParameter("nome"));
                usuarioBean.setPwd(request.getParameter("senha"));
                usuarioBean.setCargo(request.getParameter("cargo"));
                usuarioBean.setSetor(request.getParameter("setor"));
                usuarioBean.setEmail(request.getParameter("email"));
                
                UsuarioDAO usuariodao = new UsuarioDAO();
                
                usuariodao.alterar(usuarioBean);                
                response.sendRedirect("rel_usuario.jsp");
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}