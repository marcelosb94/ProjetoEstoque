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
import model.bean.ProdutoBean;
import model.dao.ProdutoDAO;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "Produto", urlPatterns = {"/Produto"})
public class Produto extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            try (PrintWriter out = response.getWriter()) {
            String funcao = request.getParameter("funcao");          

            if (funcao.equals("cadastrar")) {
                ProdutoDAO produto = new ProdutoDAO();
                
                String nome_produto = request.getParameter("nome_produto");
                String categoria_produto = request.getParameter("categoria_produto");
                String preco_produto = request.getParameter("preco_produto");
                String qtd_produto = request.getParameter("qtd_produto");
                String ponto_critico = request.getParameter("ponto_critico");
                
                ProdutoBean produtoBean = new ProdutoBean();
                
                produtoBean.setNome_produto(nome_produto);
                produtoBean.setCategoria_produto(categoria_produto);
                produtoBean.setPreco_produto(preco_produto);
                produtoBean.setQtd_produto(qtd_produto);
                produtoBean.setPonto_critico(ponto_critico);
                
                produto.cadastrar(produtoBean);                
                response.sendRedirect("produto.jsp");
            }
            
            if (funcao.equals("alterar")) {
                
                ProdutoBean produtoBean = new ProdutoBean();
                
                produtoBean.setId(Integer.parseInt(request.getParameter("id")));
                produtoBean.setNome_produto(request.getParameter("nome_produto"));
                produtoBean.setCategoria_produto(request.getParameter("categoria_produto"));
                produtoBean.setPreco_produto(request.getParameter("preco_produto"));
                produtoBean.setQtd_produto(request.getParameter("qtd_produto"));
                produtoBean.setPonto_critico(request.getParameter("ponto_critico"));
                
                ProdutoDAO produtodao = new ProdutoDAO();
                
                produtodao.alterar(produtoBean);                
                response.sendRedirect("rel_produto.jsp");
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
