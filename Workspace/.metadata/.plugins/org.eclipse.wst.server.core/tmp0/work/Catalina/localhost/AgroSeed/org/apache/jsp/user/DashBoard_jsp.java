/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2025-03-11 04:36:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>AgroSeed</title>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE-Edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../CSS/00_Index.css\" />\r\n");
      out.write("    <style>\r\n");
      out.write("      * {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("      article:hover {\r\n");
      out.write("        box-shadow: 0 0px 50px rgb(95, 93, 93);\r\n");
      out.write("      }\r\n");
      out.write("      /* Header */\r\n");
      out.write("      .header {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: space-between;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        padding: 15px 50px;\r\n");
      out.write("        background: white;\r\n");
      out.write("        box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Logo */\r\n");
      out.write("      .logo {\r\n");
      out.write("        font-size: 26px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        color: orange;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .logo span {\r\n");
      out.write("        color: black;\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Navigation Menu */\r\n");
      out.write("      .nav-menu {\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        gap: 25px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-menu a {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        padding: 8px 12px;\r\n");
      out.write("        transition: color 0.3s ease;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-menu a:hover {\r\n");
      out.write("        color: orange;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      img {\r\n");
      out.write("        display: block;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: auto;\r\n");
      out.write("      }\r\n");
      out.write("      html {\r\n");
      out.write("        scroll-behavior: smooth;\r\n");
      out.write("      }\r\n");
      out.write("      /* UTILITY CLASSES */\r\n");
      out.write("      .nowrap {\r\n");
      out.write("        white-space: nowrap;\r\n");
      out.write("      }\r\n");
      out.write("      /* GENERAL STYLE */\r\n");
      out.write("      body {\r\n");
      out.write("        min-height: 100vh;\r\n");
      out.write("        background-color: rebeccapurple;\r\n");
      out.write("        background-image: radial-gradient(whitesmoke, rebeccapurple);\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("      }\r\n");
      out.write("      header,\r\n");
      out.write("      footer {\r\n");
      out.write("        position: sticky;\r\n");
      out.write("        background-color: #1e293b;\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("      header {\r\n");
      out.write("        top: 1;\r\n");
      out.write("      }\r\n");
      out.write("      main {\r\n");
      out.write("        flex-grow: 1;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: row;\r\n");
      out.write("        place-content: center;\r\n");
      out.write("        gap: 5rem;\r\n");
      out.write("        padding: 5rem;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      /* || PROFILE CARD */\r\n");
      out.write("      .card {\r\n");
      out.write("        /* scroll-margin-top: 8rem; */\r\n");
      out.write("        width: min(100%, 350px);\r\n");
      out.write("        background-color: #cbd5e1;\r\n");
      out.write("        border: 2px solid black;\r\n");
      out.write("        border-radius: 15px;\r\n");
      out.write("        padding: 1rem;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("      .card figure {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-flow: column nowrap;\r\n");
      out.write("      }\r\n");
      out.write("      .card img {\r\n");
      out.write("        margin-top: 10px;\r\n");
      out.write("        border: 5px double #333;\r\n");
      out.write("        border-radius: 5%;\r\n");
      out.write("        width: 350px;\r\n");
      out.write("        height: auto;\r\n");
      out.write("      }\r\n");
      out.write("      .card figcaption {\r\n");
      out.write("        font-weight: bolder;\r\n");
      out.write("        font-size: 2rem;\r\n");
      out.write("        margin: 1rem;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("      article p {\r\n");
      out.write("        padding: 50px 10px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("      /* Footer Styles */\r\n");
      out.write("      .footer {\r\n");
      out.write("        background: #111;\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding: 40px 80px;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: space-between;\r\n");
      out.write("        flex-wrap: wrap;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .footer-column {\r\n");
      out.write("        width: 22%;\r\n");
      out.write("        min-width: 200px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .footer h3 {\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        margin-bottom: 15px;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .footer p,\r\n");
      out.write("      .footer a {\r\n");
      out.write("        color: #aaa;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        display: block;\r\n");
      out.write("        margin-bottom: 8px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .footer a:hover {\r\n");
      out.write("        color: orange;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .logo {\r\n");
      out.write("        font-size: 24px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        color: orange;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      footer .logo span {\r\n");
      out.write("        color: white;\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("      <div class=\"logo\">AGRO <span>SEED</span></div>\r\n");
      out.write("      <ul class=\"nav-menu\">\r\n");
      out.write("        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("        <li><a href=\"#\">Farmer Login</a></li>\r\n");
      out.write("        <li><a href=\"#\">Services</a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("      <article id=\"profile1\" class=\"card\">\r\n");
      out.write("        <figure>\r\n");
      out.write("          <figcaption>Land Details</figcaption>\r\n");
      out.write("          <img\r\n");
      out.write("            src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6f3_uF0OpYHcIrEXTA0hJT4T1ltpXE5kpLw&s\"\r\n");
      out.write("            alt=\"Joe Coder\"\r\n");
      out.write("          />\r\n");
      out.write("        </figure>\r\n");
      out.write("        <p>\r\n");
      out.write("          <q\r\n");
      out.write("            >Get details like land size, location, soil type, fertility and so\r\n");
      out.write("            on.</q\r\n");
      out.write("          >\r\n");
      out.write("        </p>\r\n");
      out.write("      </article>\r\n");
      out.write("\r\n");
      out.write("      <article id=\"profile2\" class=\"card\">\r\n");
      out.write("        <figure>\r\n");
      out.write("          <figcaption>Crop Details</figcaption>\r\n");
      out.write("          <img\r\n");
      out.write("            src=\"https://www.shutterstock.com/image-photo/lush-rice-paddy-field-neat-600nw-2499404003.jpg\"\r\n");
      out.write("            alt=\"Matt Designer\"\r\n");
      out.write("          />\r\n");
      out.write("        </figure>\r\n");
      out.write("        <p><q>Growth duration, best-suited season, and ideal soil type.</q></p>\r\n");
      out.write("      </article>\r\n");
      out.write("\r\n");
      out.write("      <article id=\"profile3\" class=\"card\">\r\n");
      out.write("        <figure>\r\n");
      out.write("          <figcaption>Monsoon Detail</figcaption>\r\n");
      out.write("          <img\r\n");
      out.write("            src=\"https://www.indiaincredible.co.in/public/cache/monsoon-travel-tips-for-every-traveler_1140_x_335.webp\"\r\n");
      out.write("            alt=\"Jane Dev Rel\"\r\n");
      out.write("          />\r\n");
      out.write("        </figure>\r\n");
      out.write("        <p><q>Displays upcoming monsoon predictions using weather APIs.</q></p>\r\n");
      out.write("      </article>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"footer-column\">\r\n");
      out.write("            <div class=\"logo\">AGRO <span>SEED</span></div>\r\n");
      out.write("            <p>Farmer Portal which ensures them to make the best utilization and productivity of their land.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-column\">\r\n");
      out.write("            <h3>Navigation</h3>\r\n");
      out.write("            <a href=\"#\">Home</a>\r\n");
      out.write("            <a href=\"#\">About</a>\r\n");
      out.write("            <a href=\"#\">Gallery</a>\r\n");
      out.write("            <a href=\"#\">Farmer Login</a>\r\n");
      out.write("            <a href=\"#\">Services</a>\r\n");
      out.write("            <a href=\"#\">Contact</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-column\">\r\n");
      out.write("            <h3>Address</h3>\r\n");
      out.write("            <p>Eiursmod Tempor Inc</p>\r\n");
      out.write("            <p>St Dolore Place,</p>\r\n");
      out.write("            <p>San Francisco 56777</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-column\">\r\n");
      out.write("            <h3>Phone Number</h3>\r\n");
      out.write("            <p>+2 123 456 789</p>\r\n");
      out.write("            <p>+2 123 456 789</p>\r\n");
      out.write("            <h3>Email ID</h3>\r\n");
      out.write("            <a href=\"mailto:mail@example.com\">mail@example.com</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
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
