<%@page import="model.bean.FornecedorBean"%>
<%@page import="model.dao.FornecedorDAO"%>
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
                <h3>Relatorio de Fornecedores Cadastrados</h3>
            </div>
        </div>
        <div class="clearfix"></div>
 <%
        FornecedorDAO fornecedor = new FornecedorDAO();      
        List<FornecedorBean> lista;
        lista = fornecedor.buscarTodos();
 %>
<!--table table-striped table-bordered--> 
<table id="table_id" class="table table-striped table-bordered">
    <thead>
        <tr>
                <th>Nome Fornecedor</th>
                <th>Endereço </th>
                <th>CNPJ</th>
                <th>Inscrição Estadual</th>
                <th>Telefone</th>
                <th>Email</th>
                <th>Nome Fantasia</th>
                <th colspan="1" >Ação</th>
                <th colspan="1" >Ação</th>
        </tr>
    </thead>
    <tbody>    
        <tr>
<%
for(FornecedorBean fornecedorbean: lista){    
%>           
            <td><%=fornecedorbean.getNome() %></td>
            <td><%=fornecedorbean.getEndereco() %></td>
            <td><%=fornecedorbean.getCnpj() %></td>
            <td><%=fornecedorbean.getInscricao() %></td>
            <td><%=fornecedorbean.getTelefone() %></td>
            <td><%=fornecedorbean.getEmail() %></td>
            <td><%=fornecedorbean.getNome_fanta() %></td>
            <td><a href="atu_fornecedor.jsp?id=<%=fornecedorbean.getId()%>" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Alterar</a></td><td><a href="ExcluirFornecedor.jsp?id=<%=fornecedorbean.getId()%> "class="btn btn-danger btn-xs" onclick="alert('Excluido Com Sucesso!')" ><i class="fa fa-trash-o"></i> Excluir</a></td>
         <!--   <td><a href="atu_usuario.jsp?id=<%=fornecedorbean.getId()%>">Alterar</a></td><td><a href="ExcluirUsuario.jsp?id=<%=fornecedorbean.getId()%>">Excluir</a></td>-->
        </tr>
               <%
	}
      %>
    </tbody>
</table>
</div>
</div>
<!-- /page content -->