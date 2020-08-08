package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Services.SetDashboarddata;
import Services.GetAccountDetails;

public final class UpdateDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Details Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String UserName = (String) session.getAttribute("UserName");
            GetAccountDetails gad = new GetAccountDetails();
            SetDashboarddata sd = new SetDashboarddata();
            String url = "Poto\\" + sd.getData(UserName).toString();
            gad.SetDetails(UserName);
            
            String Name = gad.getName();
            String FName = gad.getFName();
            String LName = gad.getLName();
            String BirthDay = gad.getBirthday();
            String Address = gad.getAddress();
            String City = gad.getCity();
            String Email = gad.getEmail();
            String Mobile = gad.getMobile();
            String Password = gad.getPassword();
            String type = gad.getType();
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <center><img src=\"");
      out.print(url);
      out.write("\" width=\"200\" height=\"300\"/></center>\n");
      out.write("            <center><p>\n");
      out.write("                <h3>");
      out.print(Name);
      out.write("</h3>\n");
      out.write("            </p></center>\n");
      out.write("            <center><a href=\"UpdateDetails.jsp\">Update Details</a></center>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <center><p>Only fill details which you want to update</p></center>\n");
      out.write("            <table align=\"center\" border=\"1\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name :</td>\n");
      out.write("                        <td>");
      out.print(FName);
      out.write("</td>\n");
      out.write("                        <td><input type=\"text\" name=\"FName\" value=\"");
      out.print(FName);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>BirthDay :</td>\n");
      out.write("                        <td>");
      out.print(BirthDay);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address :</td>\n");
      out.write("                        <td>");
      out.print(Address);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>City :</td>\n");
      out.write("                        <td>");
      out.print(City);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email :</td>\n");
      out.write("                        <td>");
      out.print(Email);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mobile</td>\n");
      out.write("                        <td>");
      out.print(Mobile);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
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
