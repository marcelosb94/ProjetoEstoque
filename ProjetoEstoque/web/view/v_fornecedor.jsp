        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Fornecedor</h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div>
                </div>
              </div>
            </div>

            <div class="clearfix"></div>

       <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>Cadastro de Fornecedores</h2>
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
                            <input type="hidden" name="funcao" id="funcao" value="cadastrar" />

                      <!--<p>For alternative validation library <code>parsleyJS</code> check out in the <a href="form.html">form page</a>-->
                      </p>
                      <span class="section">Informações do Fornecedor</span>

                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">Nome Fornecedor<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="nome" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="nome" required="required" type="text">
                        </div>
                      </div>
                      
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="endereco">Endereço <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="endereco" id="endereco" name="endereco" required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                     <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="cnpj">CNPJ <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="cnpj" id="cnpj" name="cnpj" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                     <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="inscricao">Inscrição Instadual<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="inscricao" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="inscricao" required="required" type="text">
                        </div>
                      </div>
                      
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telefone">Telefone <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="telefone" id="telefone" name="telefone" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Email <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="email" id="email" name="email" data-validate-linked="email" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                               <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome_fanta">Nome Fantasia<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="nome_fanta" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="nome_fanta" required="required" type="text">
                        </div>
                      </div>
                      
                      
                      
                      
                      
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                          <button type="submit" class="btn btn-primary">Cancelar</button>
                          <button id="send" type="submit" class="btn btn-success" onclick="alert('Cadastrado Com Sucesso!')">Enviar</button>
                        </div>
                      </div>
                    </form>
                        
                    </div>
                </div>
        <!-- /page content -->