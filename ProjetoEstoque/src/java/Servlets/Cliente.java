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
import model.bean.ClienteBean;
import model.dao.ClienteDAO;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "Cliente", urlPatterns = {"/Cliente"})
public class Cliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String funcao = request.getParameter("funcao");
            
            if (funcao.equals("cadastrar")){
                ClienteDAO cliente = new ClienteDAO();
                
                String nome = request.getParameter("nome");
                String endereco = request.getParameter("endereco");
                String cpf_cnpj = request.getParameter("cpf_cnpj");
                String cidade = request.getParameter("cidade");
                String uf = request.getParameter("uf");
                String bairro = request.getParameter("bairro");
                String telefone = request.getParameter("telefone");
                String email = request.getParameter("email");
                
                ClienteBean clientebean = new ClienteBean();
                
                clientebean.setNome(nome);
                clientebean.setEndereco(endereco);
                clientebean.setCpf_cnpj(cpf_cnpj);
                clientebean.setCidade(cidade);
                clientebean.setUf(uf);
                clientebean.setBairro(bairro);
                clientebean.setTelefone(telefone);
                clientebean.setEmail(email);
                
                cliente.cadastrar(clientebean);
                response.sendRedirect("cliente.jsp");
                
            }
            
            if (funcao.equals("alterar")){
            
                ClienteBean clientebean = new ClienteBean();
                
                clientebean.setId(Integer.parseInt(request.getParameter("id")));
                clientebean.setNome(request.getParameter("nome"));
                clientebean.setCpf_cnpj(request.getParameter("cpf_cnpj"));
                clientebean.setEndereco(request.getParameter("endereco"));
                clientebean.setCidade(request.getParameter("cidade"));
                clientebean.setUf(request.getParameter("uf"));
                clientebean.setBairro(request.getParameter("bairro"));
                clientebean.setTelefone(request.getParameter("telefone"));
                clientebean.setEmail(request.getParameter("email"));
                
                ClienteDAO clientedao = new ClienteDAO();
                
                clientedao.alterar(clientebean);
                response.sendRedirect("rel_cliente.jsp");
            
            
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
