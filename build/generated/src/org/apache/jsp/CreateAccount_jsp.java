package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Account</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CreateAccount.css\">\n");
      out.write("    <body>\n");
      out.write("        <div class=\"Top\"></div>\n");
      out.write("        <div id=\"Side\"></div>\n");
      out.write("        <div class=\"Div\">\n");
      out.write("            <form action=\"NewUser\" method=\"POST\">\n");
      out.write("                <table class=\"table\" align=\"center\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Create Account as a</b></td>\n");
      out.write("                            <td>\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"Customer\" /> \n");
      out.write("                            <b>Customer</b><br>\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"Developer\" /> \n");
      out.write("                            <b>Developer</b><br>\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"HardwareOwner\" /> \n");
      out.write("                            <b>Hardware Owner</b><br>\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"Transpoter\" /> \n");
      out.write("                            <b>Transporter</b>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>First Name</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"FName\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Last Name</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"LName\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>User Name</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"UserName\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>BirthDay</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"BirthDay\" value=\"YYYY/MM/DD\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Address</b></td>\n");
      out.write("                            <td>\n");
      out.write("                            <input class=\"Text\" type=\"text\" name=\"Address\" value=\"\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>City</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"City\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Email Address</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"Email\" value=\"\" required title=\"-------@gmail.com\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Mobile</b></td>\n");
      out.write("                            <td><input class=\"Text\" type=\"text\" name=\"Mobile\" value=\"\" required title=\"07--------\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Enter Password</b></td>\n");
      out.write("                            <td>\n");
      out.write("                            <input class=\"Text\" type=\"password\" name=\"EPassword\" pattern=\".{8,12}\" \n");
      out.write("                                   required title=\"8 to 12 characters\">\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Conform Password</b></td>\n");
      out.write("                            <td>\n");
      out.write("                            <input class=\"Text\" type=\"password\" name=\"CPassword\" pattern=\".{8,12}\" \n");
      out.write("                                   required title=\"8 to 12 characters\">\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"Button\" type=\"reset\" value=\"Cancel\" /></td>\n");
      out.write("                            <td><input class=\"Button\" type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Side\"></div>\n");
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
