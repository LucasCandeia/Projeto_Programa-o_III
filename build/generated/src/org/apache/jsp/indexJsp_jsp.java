package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\" />\n");
      out.write("        <title>Cadastro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"conteiner\">\n");
      out.write("            <a href=\"indexJsp.jsp\" > <img src=\"imagens/.jpg\" height=\"100\" width=\"755\"></a>\n");
      out.write("        <h1>Cadastro</h1>\n");
      out.write("        <form action=\"ServM\" method=\"POST\">\n");
      out.write("\n");
      out.write("            Nome: \n");
      out.write("            <input type=\"text\" name=\"nome\"/><br>\n");
      out.write("\n");
      out.write("            Idade:\n");
      out.write("            <input type=\"number\" name=\"idade\" max=\"120\" min=\"1\"/><br>\n");
      out.write("\n");
      out.write("            Tipo de ciclo:\n");
      out.write("            <select name=\"tipo\">\n");
      out.write("                <option value=\"Normal\">Normal</option>\n");
      out.write("                <option value=\"Irregular\">Irregular</option>\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("            Data da ultima mestruaccao:\n");
      out.write("            <input type=\"date\" name=\"data\"/><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Gravar\"/>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"result.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Resultados\" />\n");
      out.write("        </form>\n");
      out.write("        <footer><br><br>Desenvolveldores: José Hilton, Lucas Candeia, Julio Cesar, Luis Antônio e Dioclecio Amoroso.</footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
