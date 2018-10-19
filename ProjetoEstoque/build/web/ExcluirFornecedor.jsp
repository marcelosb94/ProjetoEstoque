<%@page import="model.bean.FornecedorBean"%>
<%@page import="model.dao.FornecedorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <h1>teste<h1>
    <%
    FornecedorDAO fornecedordao = new FornecedorDAO();
    FornecedorBean fornecedorbean = new FornecedorBean();
    fornecedorbean.setId(Integer.parseInt(request.getParameter("id")));
    Boolean ret = fornecedordao.deletar(fornecedorbean);
    %>
    
    
    
   <%
        response.sendRedirect("rel_fornecedor.jsp");
    %>
</html>
