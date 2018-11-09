<%@page import="model.bean.ProdutoBean"%>
<%@page import="model.dao.ProdutoDAO"%>
<%
 ProdutoDAO produtodao = new ProdutoDAO();
 ProdutoBean produtobean = new ProdutoBean();
 produtobean.setId(Integer.parseInt(request.getParameter("id")));

 produtobean = produtodao.buscar(produtobean);
 %>
    <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Produto </h3>
              </div>


            </div>

            <div class="clearfix"></div>

            <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>Atualizar Produto</h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Settings 1</a>
                                    </li>
                                    <li><a href="#">Settings 2</a>
                                    </li>
                                </ul>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        
                        <form action="./Produto" method="post" class="form-horizontal form-label-left" novalidate>
                            <input type="hidden" name="funcao" id="funcao" value="alterar" />

                      <!--<p>For alternative validation library <code>parsleyJS</code> check out in the <a href="form.html">form page</a>-->
                      </p>
                      <span class="section">Informações dos Produtos</span>

                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="id">ID <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input value="<%=produtobean.getId()%>" id="id" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="id" required="required" type="text" readonly="readonly">
                        </div>
                      </div>
                        
                        
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Nome Produto<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input value="<%=produtobean.getNome_produto()%>" id="nome_produto" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="nome_produto" required="required" type="text" >
                        </div>
                      </div>
                      
                         <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="categoria_produto">Categoria Produto <span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=produtobean.getCategoria_produto()%>"type="text" id="endereco" name="categoria_produto" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="preco_produto">Preço Produto <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=produtobean.getPreco_produto()%>"type="text" id="preco_produto" name="preco_produto" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="qtd_produto">Quantidade Produto<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=produtobean.getQtd_produto()%>"type="text" id="qtd_produto" name="qtd_produto" data-validate-linked="Inscricao" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                         <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="ponto_critico">Ponto Critico<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=produtobean.getPonto_critico()%>"type="text" id="ponto_critico" name="ponto_critico" data-validate-linked="Inscricao" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                          <button type="submit" class="btn btn-primary">Cancelar</button>
                          <button id="send" type="submit" class="btn btn-success" >Enviar</button>
                        </div>
                      </div>
                    </form>
                        
                    </div>
                </div>
        <!-- /page content -->