package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Services.GetAccountDetails;

public final class MoreDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About you Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"MoreDetails.css\">\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String[] DeveloperArry = new String[10];
            DeveloperArry[0] = "Masson";
            DeveloperArry[1] = "Tile";
            DeveloperArry[2] = "Carpentor";
            DeveloperArry[3] = "Plumber";
            DeveloperArry[4] = "Electrician";
            DeveloperArry[5] = "Painter";
            DeveloperArry[6] = "ConcreteSlab";
            DeveloperArry[7] = "Ceiling";
            DeveloperArry[8] = "Welding";
            DeveloperArry[9] = "Aluminium";
            
            String[] HardwareOwnerArry = new String[2];
            HardwareOwnerArry[0] = "Hardware Name";
            HardwareOwnerArry[1] = "Hardware Address";
            
            String[] TransporterArry = new String[3];
            TransporterArry[0] = "Vehicle Number";
            TransporterArry[1] = "Model";
            TransporterArry[2] = "Charge per 1Km";
            
            String UserName = (String) session.getAttribute("UserName");
            String Type = (String) session.getAttribute("Type");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"topicS\"></div>\n");
      out.write("        <div id=\"topicD\">\n");
      out.write("            <center><p><b>Please fill this form</b></p></center>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"topicS\"></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <form action=\"SetMoreDetails\" method=\"POST\">\n");
      out.write("            \n");
      out.write("        ");

            if(Type.equals("Developer")){
                for(int i = 0; i < DeveloperArry.length; i++){
                    String temp1 = DeveloperArry[i] + " Work";
                    String temp2 = "Poto\\Developer\\" + DeveloperArry[i] + ".jpg";
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        <div id=\"Div1\">\n");
      out.write("            <table align=\"center\" border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>");
      out.print(temp1);
      out.write("</b></td>\n");
      out.write("                            <td><img src=\"");
      out.print(temp2);
      out.write("\" width=\"75\" height=\"50\"/></td>\n");
      out.write("                            <td><input type=\"checkbox\" name=\"");
      out.print(DeveloperArry[i]);
      out.write("\" value=\"true\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        \n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            if(Type.equals("HardwareOwner")){
                for(int i = 0; i < HardwareOwnerArry.length; i++){
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        <div id=\"Div1\">\n");
      out.write("            <table align=\"center\" border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>");
      out.print(HardwareOwnerArry[i]);
      out.write("</b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"Text\" type=\"text\" \n");
      out.write("                                       name=\"");
      out.print(HardwareOwnerArry[i]);
      out.write("\" value=\"\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        \n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            if(Type.equals("Transpoter")){
                for(int i = 0; i < TransporterArry.length; i++){
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        <div id=\"Div1\">\n");
      out.write("            <table align=\"center\" border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>");
      out.print(TransporterArry[i]);
      out.write("</b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"Text\" type=\"text\" \n");
      out.write("                                       name=\"");
      out.print(TransporterArry[i]);
      out.write("\" value=\"\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        \n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("        <div id=\"Div1\">\n");
      out.write("            <center>\n");
      out.write("                <td>\n");
      out.write("                    <input class=\"Button\" type=\"submit\" value=\"Submit\" />\n");
      out.write("                </td>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Side1\"></div>\n");
      out.write("            </form>\n");
      out.write("        \n");
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
