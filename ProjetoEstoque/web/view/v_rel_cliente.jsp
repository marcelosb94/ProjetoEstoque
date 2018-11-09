<%@page import="model.bean.ClienteBean"%>
<%@page import="model.dao.ClienteDAO"%>
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
                <h3>Relatorio de Clientes Cadastrados</h3>
            </div>
        </div>
        <div class="clearfix"></div>
 <%
        ClienteDAO cliente = new ClienteDAO();      
        List<ClienteBean> lista;
        lista = cliente.buscarTodos();
 %>
<!--table table-striped table-bordered--> 
<table id="table_id" class="table table-striped table-bordered">
    <thead>
        <tr>
                <th>Nome Cliente</th>
                <th>Endereço </th>
                <th>CPF/CNPJ</th>
                <th>Cidade</th>
                <th>UF</th>
                <th>Bairro</th>
                <th>Telefone</th>
                <th>Email</th>
                <th colspan="1" >Ação</th>
                <th colspan="1" >Ação</th>
        </tr>
    </thead>
    <tbody>    
        <tr>
<%
for(ClienteBean clientebean: lista){    
%>           
            <td><%=clientebean.getNome() %></td>
            <td><%=clientebean.getEndereco() %></td>
            <td><%=clientebean.getCpf_cnpj() %></td>
            <td><%=clientebean.getCidade() %></td>
            <td><%=clientebean.getUf() %></td>
            <td><%=clientebean.getBairro() %></td>
            <td><%=clientebean.getTelefone() %></td>
            <td><%=clientebean.getEmail() %></td>
            <td><a href="atu_cliente.jsp?id=<%=clientebean.getId()%>" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Alterar</a></td><td><a href="ExcluirCliente.jsp?id=<%=clientebean.getId()%> "class="btn btn-danger btn-xs" ><i class="fa fa-trash-o"></i> Excluir</a></td>
         
        </tr>
               <%
	}
      %>
    </tbody>
</table>
</div>
</div>
<!-- /page content -->