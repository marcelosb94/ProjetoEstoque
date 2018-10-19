<%@page import="model.bean.UsuarioBean"%>
<%@page import="model.dao.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <h1>teste<h1>
    <%
    UsuarioDAO usuariodao = new UsuarioDAO();
    UsuarioBean usuariobean = new UsuarioBean();
    //usuariobean.setId(request.getParameter("id"));
    usuariobean.setId(Integer.parseInt(request.getParameter("id")));
    Boolean ret = usuariodao.deletar(usuariobean);
    %>
    
    
    
   <%
        response.sendRedirect("rel_usuario.jsp");
    %>
</html>
