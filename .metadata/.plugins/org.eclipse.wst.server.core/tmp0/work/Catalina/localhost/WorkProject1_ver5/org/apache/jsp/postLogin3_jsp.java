/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-02-06 07:39:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postLogin3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");

Cookie[] cookies = request.getCookies();
if( cookies != null )
{
	Cookie cookie = cookies[0];
	int length= cookies.length;
	for(int j =0; j < length; j++)
	{
		System.out.println( "login cookie " + j + " : " + cookies[j].getName() + " :: " + cookies[j].getValue() );
	}	
}
	
String id = null;
if(request.getParameter("ID") == null)
	id = (String)session.getAttribute("ID");
else
	id = request.getParameter("ID");

Integer count = (Integer)session.getAttribute("CONTENT");
String pwd = request.getParameter("PWD");

Cookie idCookie = new Cookie("ID", id);
request.getCookies();
response.addCookie(idCookie);


      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>v5 ");
      out.print(id );
      out.write("님의 Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

if(count == null) 
	count = 0;
count++;
session.setAttribute("ID", id);
session.setAttribute("COUNT", count);


      out.write("<p>\r\n");
      out.write("환영합니다.<br>\r\n");
      out.print(session.getAttribute("ID") );
      out.write("님<br>\r\n");
      out.print(count );
      out.write("번째 방문하셨습니다.<br>\r\n");
      out.write("<a href=\"listBbs.jsp\">게시판가기</a>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("<a href=\"hello.html\">홈으로</a><br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}