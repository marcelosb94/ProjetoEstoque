<%@page import="model.bean.ClienteBean"%>
<%@page import="model.dao.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <h1>teste<h1>
    <%
    ClienteDAO clientedao = new ClienteDAO();
    ClienteBean clientebean = new ClienteBean();
    clientebean.setId(Integer.parseInt(request.getParameter("id")));
    Boolean ret = clientedao.deletar(clientebean);
    %>
    
    
    
   <%
        response.sendRedirect("rel_cliente.jsp");
    %>
</html>
