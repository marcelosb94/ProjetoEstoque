<%@page import="model.bean.ProdutoBean"%>
<%@page import="model.dao.ProdutoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <h1>teste<h1>
    <%
    ProdutoDAO produtodao = new ProdutoDAO();
    ProdutoBean produtobean = new ProdutoBean();
    produtobean.setId(Integer.parseInt(request.getParameter("id")));
    Boolean ret = produtodao.deletar(produtobean);
    %>
    
    
    
   <%
        response.sendRedirect("rel_produto.jsp");
    %>
</html>
