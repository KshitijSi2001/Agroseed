<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agro Seed an Agriculture Category Bootstrap responsive Website Template | Contact :: w3layouts</title>
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
<style>
.a{
font-weight: 700;
    letter-spacing: 6px;
    font-size: 2.5em;
    margin: 0;
    text-transform: capitalize;
    }
</style> 
</head>
<body>
<%@include file="Header2.jsp" %>
<div class="jarallax about-banner" style="padding: 1em 0">
			<div class="container">
				<div class="agileits-heading about-heading" >
					<p class="a">Add new Crop Type(according to monsoon)</p>
					
				</div>
			</div>
		</div>	
		
 <div class="contact" style="padding-bottom:2em">
		<div class="container">
	
             <div class="contact-form">
				<div class="contact-form-grid">
					<form action="" method="post">
			       
	                   <div class="styled-input textarea-grid">
							<textarea name="name" required></textarea>
							<label>Crop Type</label>
							<span></span>
						</div>
						<div class="clearfix"> </div>
						
						
						<div class="styled-input textarea-grid">
							<textarea name="description" required></textarea>
							<label>Description</label>
							<span></span>
						</div>
						<div class="clearfix"> </div>
						<div class="styled-input textarea-grid">
							<textarea name="sown" required></textarea>
							<label>Sown Time </label>
							<span></span>
						</div>	 
							 
						<div class="clearfix"> </div>
						<div class="styled-input textarea-grid">
							<textarea name="harvest" required></textarea>
							<label>Harvest Time</label>
							<span></span>
						</div>	 
						
						<div class="clearfix"> </div>
						<div class="styled-input textarea-grid">
							<textarea name="crops" required></textarea>
							<label>Crops Name</label>
							<span></span>
						</div>	 
						<input type="submit" value="ADD" name="add">
						
					<%@ include file = "../Connection.jsp" %>
		<%
		
		try{
			
	   // String password = request.getParameter("pass"); -->
					
		if(request.getParameter("add")!= null)
		{
			Statement st =cn.createStatement();
		st.executeUpdate("insert into monsoon(Type,Description,Sown,Harvest,Crops,TransDate,Status,TransUser) values('"+request.getParameter("name")+"','"+request.getParameter("description")+"','"+request.getParameter("sown")+"','"+request.getParameter("harvest")+"','"+request.getParameter("crops")+"',CURDATE(),1,'Admin')");
		{
			out.println("success");
		}
		
		}
		

		}
		catch(Exception ex)
		{
			out.println(ex);
		}
		%>
						
					
						
					</form>
				</div>
			</div>
		</div>
	</div>				

<%@ include file="../user/footer.jsp" %>					
	<script src="js/jarallax.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling icon -->
	
						
</body>
</html>