package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.UsuarioDAO;
import model.bean.UsuarioBean;

public final class atu_005fv_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

 UsuarioBean usuariobean = new UsuarioBean();
 UsuarioDAO usuariodao = new UsuarioDAO();
 
 usuariobean.setId(request.getParameter("id"));

 usuariobean = usuariodao.buscar(usuariobean);
 
 
      out.write("\n");
      out.write("    <!-- page content -->\n");
      out.write("        <div class=\"right_col\" role=\"main\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"page-title\">\n");
      out.write("              <div class=\"title_left\">\n");
      out.write("                <h3>Usuarios </h3>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                    <div class=\"x_title\">\n");
      out.write("                        <h2>Atualizar Usuarios</h2>\n");
      out.write("                        <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                            <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"#\">Settings 1</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">Settings 2</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"x_content\">\n");
      out.write("                        \n");
      out.write("                        <form action=\"./Usuario\" method=\"post\" class=\"form-horizontal form-label-left\" novalidate>\n");
      out.write("                            <input type=\"hidden\" name=\"funcao\" id=\"funcao\" value=\"cadastrar\" />\n");
      out.write("\n");
      out.write("                      <!--<p>For alternative validation library <code>parsleyJS</code> check out in the <a href=\"form.html\">form page</a>-->\n");
      out.write("                      </p>\n");
      out.write("                      <span class=\"section\">Informações dos Usuarios</span>\n");
      out.write("\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"name\">Nome de Usuario<span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <input id=\"nome\" class=\"form-control col-md-7 col-xs-12\" data-validate-length-range=\"6\" data-validate-words=\"2\" name=\"nome\" required=\"required\" type=\"text\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                         <div class=\"item form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"cargo\">Cargo <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" id=\"cargo\" name=\"cargo\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"setor\">Setor <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" id=\"setor\" name=\"setor\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"email\">Email <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" id=\"email\" name=\"email\" value=\"");
      out.print(usuariobean.getEmail());
      out.write("\"data-validate-linked=\"email\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"senha\">Senha <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"password\" id=\"senha\" name=\"senha\" value=\"");
      out.print(usuariobean.getPwd());
      out.write("\"required=\"required\"  class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      <div class=\"ln_solid\"></div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-primary\">Cancelar</button>\n");
      out.write("                          <button id=\"send\" type=\"submit\" class=\"btn btn-success\" onclick=\"alert('Alterado Com Sucesso!')\">Enviar</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        <!-- /page content -->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
