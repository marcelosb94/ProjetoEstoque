<%@page import="model.bean.UsuarioBean"%>
<%@page import="model.dao.UsuarioDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- page content -->
<link rel="stylesheet" type="text/css" href="css/datatables.min.css"/>
    
    <link rel="stylesheet" type="text/css" href="css/datatables.css"/>
       

     <script src="js/datatables.min.js"></script>
     <script src="js/datatables.js"></script>
     <script type="text/javascript">
            $(document).ready(function() {
            $('#table_id').DataTable();
                                           } );
            
     </script>



<div class="right_col" role="main">
    <div class="">
        <div class="page-title">
            <div class="title_left">
                <h3>Relatorio de Usuarios Cadastrados</h3>
            </div>
        </div>

        <div class="clearfix"></div>
    <%
        UsuarioDAO usuario = new UsuarioDAO();      
        List<UsuarioBean> listausuario;
        listausuario = usuario.buscarTodosUsuarios();
            
            %>
 
<table id ="table_id" class="table table-striped table-bordered">
    <thead>
        <tr>
		
                <th>Nome Usuario</th>
                <th>Cargo </th>
                <th>Setor</th>
                <th>Email</th>
                <th>Senha</th>
                <th colspan="2" >A��o</th>
        </tr>        
           
    </thead>

    <tbody>
    
        <tr>
 <%
for(UsuarioBean usuariobean: listausuario){    
%>           
            <td><%=usuariobean.getNome() %></td>
            <td><%=usuariobean.getCargo() %></td>
            <td><%=usuariobean.getSetor() %></td>
            <td><%=usuariobean.getEmail() %></td>
            <td><%=usuariobean.getPwd() %></td>
            <td><a href="Usuario?cod=<%=usuariobean.getId()%>">Alterar</a></td><td><a href="Usuario.java?cod=<%=usuariobean.getId()%>">Excluir</a></td>

        </tr>
               <%
	}
      %>
    </tbody>

     
</table>
               
                        
                    </div>
                </div>

<!-- /page content -->