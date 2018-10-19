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
import model.bean.FornecedorBean;
import model.dao.FornecedorDAO;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "Fornecedor", urlPatterns = {"/Fornecedor"})
public class Fornecedor extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            String funcao = request.getParameter("funcao");
           

            if (funcao.equals("cadastrar")) {
                FornecedorDAO fornecedor = new FornecedorDAO();
                
                String nome = request.getParameter("nome");
                String endereco = request.getParameter("endereco");
                String cnpj = request.getParameter("cnpj");
                String inscricao = request.getParameter("inscricao");
                String telefone = request.getParameter("telefone");
                String email = request.getParameter("email");
                String nome_fanta = request.getParameter("nome_fanta");
                
                FornecedorBean fornecedorBean = new FornecedorBean();
                
                fornecedorBean.setNome(nome);
                fornecedorBean.setEndereco(endereco);
                fornecedorBean.setCnpj(cnpj);
                fornecedorBean.setInscricao(inscricao);
                fornecedorBean.setTelefone(telefone);
                fornecedorBean.setEmail(email);
                fornecedorBean.setNome_fanta(nome_fanta);
                
                fornecedor.cadastrar(fornecedorBean);                
                response.sendRedirect("fornecedor.jsp");
            }
            
            if (funcao.equals("alterar")) {
                
                FornecedorBean fornecedorBean = new FornecedorBean();
                
                fornecedorBean.setId(Integer.parseInt(request.getParameter("id")));
                fornecedorBean.setNome(request.getParameter("nome"));
                fornecedorBean.setEndereco(request.getParameter("endereco"));
                fornecedorBean.setCnpj(request.getParameter("cnpj"));
                fornecedorBean.setInscricao(request.getParameter("inscricao"));
                fornecedorBean.setTelefone(request.getParameter("telefone"));
                fornecedorBean.setEmail(request.getParameter("email"));
                fornecedorBean.setNome_fanta(request.getParameter("nome_fanta"));
                
                FornecedorDAO fornecedordao = new FornecedorDAO();
                
                fornecedordao.alterar(fornecedorBean);               
                response.sendRedirect("rel_fornecedor.jsp");
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
