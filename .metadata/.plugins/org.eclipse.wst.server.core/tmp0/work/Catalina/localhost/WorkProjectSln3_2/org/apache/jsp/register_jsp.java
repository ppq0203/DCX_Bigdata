/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-02-06 08:11:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./register.css\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"con\">\r\n");
      out.write("    <div id=\"login\">\r\n");
      out.write("    <div id=\"login_form\"><!--로그인 폼-->\r\n");
      out.write("    <form method=\"get\" action=\"postRegister.jsp\">\r\n");
      out.write("        <h3 class=\"login\" style=\"letter-spacing:-1px;\">Sign up to Web</h3>\r\n");
      out.write("\r\n");
      out.write("        <!-- <p>\r\n");
      out.write("            <input type=\"submit\" value=\"Sign in with Google\" class=\"btn\" style=\"background-color:#217Af0\">\r\n");
      out.write("        </p> 구글로 로그인-->\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <!-- <span>ID</span> -->\r\n");
      out.write("        <p style=\"text-align: left; font-size:12px; color:#666\">Id</p>\r\n");
      out.write("        <input type=\"text\" name=\"ID\" placeholder=\"아이디\" class=\"size\">\r\n");
      out.write("        <p></p>\r\n");
      out.write("        </label><!--아이디-->\r\n");
      out.write("\r\n");
      out.write("        <label>\r\n");
      out.write("        <!-- <span>PW</span> -->\r\n");
      out.write("        <p style=\"text-align: left; font-size:12px; color:#666\">Password </p>\r\n");
      out.write("        <input type=\"password\" name=\"PWD\" placeholder=\"비밀번호\" class=\"size\">\r\n");
      out.write("        </label><!--비밀번호-->\r\n");
      out.write("\r\n");
      out.write("<!--         <label>\r\n");
      out.write("            <span>PW</span>\r\n");
      out.write("            <p style=\"text-align: left; font-size:12px; color:#666\"> </p>\r\n");
      out.write("            <input type=\"password\" placeholder=\"비밀번호 확인\" class=\"size\">\r\n");
      out.write("        </label>비밀번호 확인 -->\r\n");
      out.write("         <label>\r\n");
      out.write("                <!-- <span>PW</span> -->\r\n");
      out.write("            <p style=\"text-align: left; font-size:12px; color:#666\">Name</p>\r\n");
      out.write("                <input type=\"text\" name=\"NAME\" placeholder=\"이름\" class=\"size\">\r\n");
      out.write("        </label> <!--이름-->\r\n");
      out.write("        <br />  \r\n");
      out.write("          직위 \r\n");
      out.write("        <select name=\"LEVEL\">\r\n");
      out.write("        \t<option value=\"Manager\">Manager</option>\r\n");
      out.write("\t\t    <option value=\"Engineer\">Engineer</option>\r\n");
      out.write("\t\t    <option value=\"Sales\">Sales</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("        <p>\r\n");
      out.write("            <input type=\"submit\" value=\"Create Acoout\" class=\"btn\">\r\n");
      out.write("            \r\n");
      out.write("        </p>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("    <p class=\"find\">\r\n");
      out.write("        <span><a href=\"login.jsp\" >로그인 페이지로 이동</a></span>\r\n");
      out.write("    </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("    </div><!--con-->\r\n");
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
