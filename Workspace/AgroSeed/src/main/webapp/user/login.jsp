<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Agro Seed Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->
<!-- css -->
<link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
<!--// css -->
<!-- font-awesome icons -->
<link href="../css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- font -->
<link href="http://fonts.googleapis.com/css?family=Laila:300,400,500,600,700" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
<!-- //font -->
<script src="../js/jquery-1.11.1.min.js"></script>
<script src="../js/bootstrap.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 
 </head>
<body>
       

<%@page import="java.io.*" %>
	<%@page import="java.sql.*" %>
	<%@page import="javax.sql.*" %>
	<%@page import="java.sql.Connection" %>
<%@include file="../Connection.jsp" %>
<%@include file="Header1.jsp" %>
<div class="container" style="padding-bottom:35px">
  <div class="jarallax about-banner" style="padding: .5em 0">
			<div class="container">
				<div class="agileits-heading about-heading">
					<h1>Login Form</h1>
				</div>
			</div>
		</div>	
		
  
   
    <form action="" class="needs-validation" novalidate>
    
   <div class="form-group">
      <label for="uname">User Name</label>
      <input type="tel" class="form-control" id="userName" name="userName"  required>
    </div>
    <div class="form-group">
      <label for="uname">Password:</label>
      <input type="password" class="form-control" id="passWord" name="passWord" required>
    </div>
   
	 
    <button type="submit" class="btn btn-primary" name="Login">Login</button>
    
    <%
       
        
    
    	try{
    		
    		if(request.getParameter("Login")!= null){
    			Statement st1 =cn.createStatement();
		    	ResultSet rs =st1.executeQuery("select * from registration where  Username='"+request.getParameter("userName")+"' and Password='"+request.getParameter("passWord")+"'");
		    	if(rs.next()){
		    		
		    		
		    		response.sendRedirect("DashBoard.jsp");
		    	}
		    	else
		    	{
		    		out.println("! Please Enter Valid details. ");
		    	}
		   }
    	}catch(Exception ex)
    	{
    		out.println(ex);
    	}
   
    %>
    
    
    
    </form>
   
    <form action="register.jsp">
   		<h4> <p style="margin:16px 0 10px ;font-weight:600">If you did not register yet, you can <a href="register.jsp">register here</a></p></h4>
    </form>
   </div>
    
    <%@ include file="footer.jsp" %>
    
   <script>
// Disable form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Get the forms we want to add validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>
	

</body>
</html>