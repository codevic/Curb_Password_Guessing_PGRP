package org.apache.jsp.res.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.nitin.utility.*;
import com.nitin.dao.*;
import java.sql.*;

public final class deletei_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/jquery-1.6.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/login.js\"></script>\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t");

		ResultSet rs=UserDAO.getInstance().Inbox(request.getParameter("user"));
	
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\t<h3>Selete to Delete Inbox Items</h3>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<form method=\"post\" id=\"frm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/DeleteI\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.print(request.getParameter("user") );
      out.write("\" name=\"user\">\r\n");
      out.write("\t<table id=\"my\" title=\"Inbox Items\" width=\"600\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>No</th>\r\n");
      out.write("\t\t<th>Subject</th>\r\n");
      out.write("\t\t<th>Message</th>\r\n");
      out.write("\t\t<th>From</th>\r\n");
      out.write("\t\t<th>Date & Time</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr><td><hr></td><td><hr></td><td><hr></td><td><hr></td><td><hr></td></tr>\r\n");
      out.write("\t");

		int count=1;
		if(rs!=null)
		while(rs.next())
		{
      out.write("\r\n");
      out.write("\t\t<tr>\t\r\n");
      out.write("\t\t\t<td>");
      out.print(count++ );
      out.write("<input type=\"checkbox\" name=\"select\" value=\"");
      out.print(rs.getInt(1) );
      out.write("\"></td>\t\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(5) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getDate(6) );
      out.write(' ');
      out.write('&');
      out.write(' ');
      out.print(rs.getTime(6) );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
}
	
      out.write("\r\n");
      out.write("\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td><input type=\"submit\" value=\"Delete\"></input></td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div id=\"process_msg\"></div>\r\n");
      out.write("\t</form>\r\n");

int no=Utility.parse(request.getParameter("no"));
if(no==1)
{
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tdocument.getElementById(\"process_msg\").innerHTML=\"<div style='color:red;text-align:center;border:1px solid red;'>Opp's Select Atleast One....! </div>\";\r\n");
      out.write("\t</script>\r\n");
}
if(no==2)
{
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tdocument.getElementById(\"process_msg\").innerHTML=\"<div style='color:green;text-align:center;border:1px solid green;'>Message Deleted Successfully....! </div>\";\r\n");
      out.write("\t</script>\r\n");
}
if(no==3)
{
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tdocument.getElementById(\"process_msg\").innerHTML=\"<div style='color:red;text-align:center;border:1px solid red;'>Opp's Somthing Went Wrong....! </div>\";\r\n");
      out.write("\t</script>\r\n");
}

      out.write("\t\r\n");
      out.write("<hr>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
