/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2025-03-11 04:41:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/user/Header1.jsp", Long.valueOf(1741588636441L));
    _jspx_dependants.put("/user/../Connection.jsp", Long.valueOf(1741588636223L));
    _jspx_dependants.put("/user/footer.jsp", Long.valueOf(1741588636299L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".form-group{\r\n");
      out.write("background-color: white;}\r\n");
      out.write(".navbar-nav{\r\n");
      out.write("    flex-direction: unset;\r\n");
      out.write("}\r\n");
      out.write(".about-banner {\r\n");
      out.write("    padding: 0em 0;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body style=\"color: darkorange;\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   ");

	
   Connection cn =null;
   Class.forName("com.mysql.jdbc.Driver");
   cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agroseed","root","root");
	
 
   

  
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// bootstrap-css -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// css -->\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"../css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<!-- font -->\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Laila:300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //font -->\r\n");
      out.write("<script src=\"../js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("#logo{\r\n");
      out.write("      text-shadow: 3px 2px brown;\r\n");
      out.write("      }\r\n");
      out.write("</style> \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"head\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-top\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t  </button>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t <div class=\"navbar-brand logo \" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 class=\"animated wow pulse\" data-wow-delay=\".5s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"index.html\" id=\"logo\">Agro<span>Seed</span></a></h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                       \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t <ul class=\"nav navbar-nav link-effect-4\">\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"active\"><a href=\"../index.jsp\" data-hover=\"Home\">Home</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t<li><a href=\"about.html\" data-hover=\"About\">About </a> </li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\" data-hover=\"Farmer Login\">Farmer Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <a href=\"codes.html\" class=\"dropdown-toggle\" data-hover=\"services\" data-toggle=\"dropdown\">Services<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t       <li><a href=\"land details.jsp\">Land details</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t       <li><a href=\"crop details.jsp\">Crop details</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t       <li><a href=\"monsoon details.jsp\">Monsoon details</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact1.jsp\" data-hover=\"Contact\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"clearfix\"></div>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<script src=\"../js/jarallax.js\"></script>\r\n");
      out.write("\t<script src=\"../js/SmoothScroll.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t/* init Jarallax */\r\n");
      out.write("\t\t$('.jarallax').jarallax({\r\n");
      out.write("\t\t\tspeed: 0.5,\r\n");
      out.write("\t\t\timgWidth: 1366,\r\n");
      out.write("\t\t\timgHeight: 768\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../js/move-top.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../js/easing.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"padding-bottom: 25px;\">\r\n");
      out.write("  <div class=\"jarallax about-banner\" style=\"padding: .5em 0\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"agileits-heading about-heading\" >\r\n");
      out.write("\t\t\t\t\t<h1>Registration  Form</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("   <form action=\"\" class=\"needs-validation\" novalidate>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Name:</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Enter name\" name=\"name\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"gender\" >Gender:</label><br/></div>\r\n");
      out.write("      <div style=\"color: black;\">\r\n");
      out.write("      <input type=\"radio\" id=\"gender\" name=\"gender\" value=\"Male\" required>Male\r\n");
      out.write("      <input type=\"radio\" id=\"gender\" name=\"gender\" value=\"Female\" required>Female\r\n");
      out.write("     <input type=\"radio\" id=\"gender\" name=\"gender\" value=\"Others\" required>Others\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Mobile Number:</label>\r\n");
      out.write("      <input type=\"tel\" class=\"form-control\" id=\"mobno\" placeholder=\"10 digits\" name=\"mobno\" pattern=\"[0-9]{10}\" maxlength=\"10\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Aadhaar Number</label>\r\n");
      out.write("      <input type=\"tel\" class=\"form-control\" id=\"adhaar\" placeholder=\"XXXXXXXXXXXX\" name=\"adhaar\" minlength=\"12\" maxlength=\"12\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Farming State:</label>\r\n");
      out.write("      <select name=\"stateslist\" id=\"stateslist\" class=\"form-control\" required>\r\n");
      out.write("\t\t<option value=\"null\">---Select---- </option>\r\n");
      out.write("\t\t<option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\r\n");
      out.write("\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("\t\t<option value=\"Assam\">Assam</option>\r\n");
      out.write("\t\t<option value=\"Bihar\">Bihar</option>\r\n");
      out.write("\t\t<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("\t\t<option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("\t\t<option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option>\r\n");
      out.write("\t\t<option value=\"Daman and Diu\">Daman and Diu</option>\r\n");
      out.write("\t\t<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("\t\t<option value=\"Goa\">Goa</option>\r\n");
      out.write("\t\t<option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("\t\t<option value=\"Haryana\">Haryana</option>\r\n");
      out.write("\t\t<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("\t\t<option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\r\n");
      out.write("\t\t<option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("\t\t<option value=\"Karnataka\">Karnataka</option>\r\n");
      out.write("\t\t<option value=\"Kerala\">Kerala</option>\r\n");
      out.write("\t\t<option value=\"Lakshadweep\">Lakshadweep</option>\r\n");
      out.write("\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("\t\t<option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("\t\t<option value=\"Manipur\">Manipur</option>\r\n");
      out.write("\t\t<option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("\t\t<option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("\t\t<option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("\t\t<option value=\"Orissa\">Orissa</option>\r\n");
      out.write("\t\t<option value=\"Pondicherry\">Pondicherry</option>\r\n");
      out.write("\t\t<option value=\"Punjab\">Punjab</option>\r\n");
      out.write("\t\t<option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("\t\t<option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("\t\t<option value=\"Tripura\">Tripura</option>\r\n");
      out.write("\t\t<option value=\"Uttaranchal\">Uttaranchal</option>\r\n");
      out.write("\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("\t\t<option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("      </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Farming Location:</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"location\" placeholder=\"Enter main location\" name=\"location\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Pin Code:</label>\r\n");
      out.write("      <input type=\"tel\" class=\"form-control\" id=\"pin\" placeholder=\"Enter 6 digits pin\" name=\"pin\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Email ID:</label>\r\n");
      out.write("      <input type=\"email\" class=\"form-control\"  placeholder=\"Enter valid mail ID\" name=\"email\" >\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Username:</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\"  placeholder=\"Enter username\" name=\"username\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"uname\">Password:</label>\r\n");
      out.write("      <input type=\"password\" class=\"form-control\" name=\"pass\" required>\r\n");
      out.write("      <div class=\"valid-feedback\">Valid.</div>\r\n");
      out.write("      <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("\t \r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\" name=\"Register\">Register</button>\r\n");
      out.write("\t");

	

	try{
	
		//String password = request.getParameter("pass");
				
		if(request.getParameter("Register")!= null)
		{
			Statement st =cn.createStatement();
			
			st.executeUpdate("insert into registration(Aadhaar,Name,Gender,ContactNo,State,EmailId,UserName,Password,FarmingLocation,Pin,RegisterDate) values('"+request.getParameter("adhaar")+"','"+request.getParameter("name")+"','"+request.getParameter("gender")+"','"+request.getParameter("mobno")+"','"+request.getParameter("stateslist")+"','"+request.getParameter("email")+"','"+request.getParameter("username")+"','"+request.getParameter("pass")+"','"+request.getParameter("location")+"','"+request.getParameter("pin")+"',CURDATE())");
			
			out.println("success");
		}
		else
		{
			out.println("success");
		}
	}catch(Exception ex)
	{
		out.println(ex);
	}

	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// bootstrap-css -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// css -->\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"../css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<!-- font -->\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Laila:300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //font -->\r\n");
      out.write("<script src=\"../js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"footer\" style=\"width:100%\">\r\n");
      out.write("\t\t<div class=\"footer-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-grids\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4><a href=\"index.html\">Agro<span>Seed</span></a></h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Farmer Portal which insures them to make the best utilizaton and productivity of their land</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Navigation</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t    <li> <a href=\"../index.jsp\">Home</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"about.html\">About</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"gallery.html\">Gallery</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"login.jsp\">Farmer Login</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <a href=\"codes.html\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Services<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t       <li><a href=\"icons.html\">Land details</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t       <li><a href=\"\">Crop details</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"contact1.jsp\">Contact</a> </li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 footer-list\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Address</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t   <li>Eiusmod Tempor inc </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>St Dolore Place,</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>San Francisco 56777 </li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 footer-list\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Phone Number</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul >\r\n");
      out.write("\t\t\t\t\t\t\t<li>+2 123 456 789</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>+2 123 456 789</li>\r\n");
      out.write("\t\t     \t\t\t</ul><br/>\r\n");
      out.write("\t\t     \t\t\t<h3>Email ID</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"w3agile_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mailto:example@email.com\">mail@example.com</a></li>\r\n");
      out.write("\t\t     \t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"../js/jarallax.js\"></script>\r\n");
      out.write("\t<script src=\"../js/SmoothScroll.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t/* init Jarallax */\r\n");
      out.write("\t\t$('.jarallax').jarallax({\r\n");
      out.write("\t\t\tspeed: 0.5,\r\n");
      out.write("\t\t\timgWidth: 1366,\r\n");
      out.write("\t\t\timgHeight: 768\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../js/move-top.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../js/easing.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// Disable form submissions if there are invalid fields\r\n");
      out.write("(function() {\r\n");
      out.write("  'use strict';\r\n");
      out.write("  window.addEventListener('load', function() {\r\n");
      out.write("    // Get the forms we want to add validation styles to\r\n");
      out.write("    var forms = document.getElementsByClassName('needs-validation');\r\n");
      out.write("    // Loop over them and prevent submission\r\n");
      out.write("    var validation = Array.prototype.filter.call(forms, function(form) {\r\n");
      out.write("      form.addEventListener('submit', function(event) {\r\n");
      out.write("        if (form.checkValidity() === false) {\r\n");
      out.write("          event.preventDefault();\r\n");
      out.write("          event.stopPropagation();\r\n");
      out.write("        }\r\n");
      out.write("        form.classList.add('was-validated');\r\n");
      out.write("      }, false);\r\n");
      out.write("    });\r\n");
      out.write("  }, false);\r\n");
      out.write("})();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
