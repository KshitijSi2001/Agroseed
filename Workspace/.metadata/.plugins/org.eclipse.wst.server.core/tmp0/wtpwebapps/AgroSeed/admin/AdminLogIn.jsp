<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
<title>Admin LogIn Panel</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
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
<style>
#logo{
      text-shadow: 3px 2px brown;
      }
</style> 


 </head>
<body>

<%@include file="../Connection.jsp" %>




<!-- header Start -->
	
	<div class="banner">
		<div class="head">
			<div class="container">
					<div class="navbar-top">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header">
							 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							  </button>
							
								 <div class="navbar-brand logo " >
									<h1 class="animated wow pulse" data-wow-delay=".5s">
									<a href="index.html" id="logo">Agro<span>Seed</span></a></h1>
								</div>
                       </div>
                       
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							 <ul class="nav navbar-nav link-effect-4">
							    <li class="active"><a href="AdminLogIn.jsp" data-hover="Home">Home</a> </li>
								
							<!--	<li><a href="about.html" data-hover="About">About </a> </li> -->
								
							  </ul>
							</div><!-- /.navbar-collapse -->
						</div>
					  <div class="clearfix"></div>	
			</div>
		</div>
		
			<script src="../js/jarallax.js"></script>
	<script src="../js/SmoothScroll.min.js"></script>
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>
	<script type="text/javascript" src="../js/move-top.js"></script>
	<script type="text/javascript" src="../js/easing.js"></script>

	

<!-- header end -->






<div class="container">
  <div class="jarallax about-banner" style="padding: .5em 0">
			<div class="container">
				<div class="agileits-heading about-heading">
					<h1>Admin Login Form</h1>
				</div>
			</div>
		</div>	
		
   <form action="" class="needs-validation" novalidate>
    
   <div class="form-group">
      <label for="uname">Email Id</label>
      <input type="tel" class="form-control" id="adhaar" name="adhaar"  required>
    </div>
    <div class="form-group">
      <label for="uname">Password:</label>
      <input type="password" class="form-control" name="pass" required>
    </div>
   
	 
    <button type="submit" class="btn btn-primary" name="Login">Login</button>
    
    <%
       
        
    
    	try{
    		
    		if(request.getParameter("Login")!= null){
    			Statement st1 =cn.createStatement();
		    	ResultSet rs =st1.executeQuery("select * from admin where  EmailId='"+request.getParameter("adhaar")+"' and Password='"+request.getParameter("pass")+"'");
		    	if(rs.next()){
		    		response.sendRedirect("viewcontact.jsp");
		    	}
		    	/**if(rs.next())
		    	{
		    		out.println("You are login Successfully ! ");
		    	}*/
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