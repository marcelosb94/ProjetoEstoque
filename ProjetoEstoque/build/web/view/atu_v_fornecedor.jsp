<%@page import="model.bean.FornecedorBean"%>
<%@page import="model.dao.FornecedorDAO"%>
<%
 FornecedorDAO fornecedordao = new FornecedorDAO();
 FornecedorBean fornecedorbean = new FornecedorBean();
 fornecedorbean.setId(Integer.parseInt(request.getParameter("id")));

 fornecedorbean = fornecedordao.buscar(fornecedorbean);
 %>
    <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Fornecedor </h3>
              </div>


            </div>

            <div class="clearfix"></div>

            <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>Atualizar Fornecedor</h2>
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
                        
                        <form action="./Fornecedor" method="post" class="form-horizontal form-label-left" novalidate>
                            <input type="hidden" name="funcao" id="funcao" value="alterar" />

                      <!--<p>For alternative validation library <code>parsleyJS</code> check out in the <a href="form.html">form page</a>-->
                      </p>
                      <span class="section">Informações dos Fornecedores</span>

                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="id">ID <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input value="<%=fornecedorbean.getId()%>" id="id" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="id" required="required" type="text" readonly="readonly">
                        </div>
                      </div>
                        
                        
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Nome Fornecedor<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input value="<%=fornecedorbean.getNome()%>" id="nome" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="nome" required="required" type="text" >
                        </div>
                      </div>
                      
                         <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="endereco">Endereço <span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=fornecedorbean.getEndereco()%>"type="text" id="endereco" name="endereco" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cnpj">CNPJ <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=fornecedorbean.getCnpj()%>"type="text" id="setor" name="cnpj" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Inscricao Estadual<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=fornecedorbean.getInscricao()%>"type="text" id="Inscricao" name="inscricao" data-validate-linked="Inscricao" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telefone">Telefone <span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=fornecedorbean.getTelefone()%>"type="text" id="telefone" name="telefone"  required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                        <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Email <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=fornecedorbean.getEmail()%>"type="text" id="email" name="email"  required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                        <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome_fanta">Nome Fantasia <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input value="<%=fornecedorbean.getNome_fanta()%>"type="text" id="nome_fanta" name="nome_fanta"  required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                      
                      
                      
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                          <button type="submit" class="btn btn-primary">Cancelar</button>
                          <button id="send" type="submit" class="btn btn-success" onclick="alert('Alterado Com Sucesso!')">Enviar</button>
                        </div>
                      </div>
                    </form>
                        
                    </div>
                </div>
        <!-- /page content -->