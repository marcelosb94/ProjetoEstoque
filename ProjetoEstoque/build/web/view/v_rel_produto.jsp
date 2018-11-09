<%@page import="model.bean.ProdutoBean"%>
<%@page import="model.dao.ProdutoDAO"%>
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
                <h3>Relatorio de Produtos Cadastrados</h3>
            </div>
        </div>
        <div class="clearfix"></div>
 <%
        ProdutoDAO produto = new ProdutoDAO();      
        List<ProdutoBean> lista;
        lista = produto.buscarTodos();
 %>
<!--table table-striped table-bordered--> 
<table id="table_id" class="table table-striped table-bordered">
    <thead>
        <tr>
                <th>Nome Produto</th>
                <th>Categoria Produto </th>
                <th>Preço Produto</th>
                <th>Quantidade do Produto</th>
                <th>Ponto Critico</th>
                <th colspan="1" >Ação</th>
                <th colspan="1" >Ação</th>
        </tr>
    </thead>
    <tbody>    
        <tr>
<%
for(ProdutoBean produtobean: lista){    
%>           
            <td><%=produtobean.getNome_produto() %></td>
            <td><%=produtobean.getCategoria_produto() %></td>
            <td><%=produtobean.getPreco_produto() %></td>
            <td><%=produtobean.getQtd_produto() %></td>
            <td><%=produtobean.getPonto_critico() %></td>
            <td><a href="atu_produto.jsp?id=<%=produtobean.getId()%>" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Alterar</a></td><td><a href="ExcluirProduto.jsp?id=<%=produtobean.getId()%> "class="btn btn-danger btn-xs" ><i class="fa fa-trash-o"></i> Excluir</a></td>
         
        </tr>
               <%
	}
      %>
    </tbody>
</table>
</div>
</div>
<!-- /page content -->