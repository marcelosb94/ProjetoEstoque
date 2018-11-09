<%
    try {

        String user = (String) session.getAttribute("usuario");
        if (user.equals("")) {
            response.sendRedirect("login.jsp");
        }
    } catch (NullPointerException e) {
        response.sendRedirect("login.jsp");
    }

%>

        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
           
            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/procedence123.png" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>PROCEDENCE BY SOUND</span>

              </div>
              <div class="clearfix"></div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>GERAL</h3>
                <ul class="nav side-menu">
                  <li><a href="principal.jsp"><i class="fa fa-home"></i> PRINCIPAL</a>
                   
                  </li>
                  
                  <li><a><i class="fa fa-edit"></i> CADASTRO <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">

                      <li><a href="usuario.jsp">Usuários</a></li>
                      <li><a href="fornecedor.jsp">Fornecedores</a></li>
                      <li><a href="produto.jsp">Produtos</a></li>
                      <li><a href="cliente.jsp">Clientes</a></li>
                    </ul>
                  </li>
                  
                  <li><a><i class="fa fa-table"></i> RELATORIOS <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">

                      <li><a href="rel_usuario.jsp">Relatorios Usuário</a></li>
                      <li><a href="rel_fornecedor.jsp">Relatorios de Fornecedores</a></li>
                      <li><a href="rel_produto.jsp">Relatorios de Produtos</a></li>
                      <li><a href="rel_cliente.jsp">Relatorios de Clientes</a></li>
                      
                    </ul>
                  </li>
                  
                  <li><a href="./Sair"><i class="fa fa-power-off"></i> SAIR </a>
                    
                  </li>
                </ul>
              </div>
              

            </div>
            <!-- /sidebar menu -->
           
          </div>
        </div>