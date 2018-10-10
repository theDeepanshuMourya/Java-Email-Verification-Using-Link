<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<title>Registration Page</title>
</head>

<body>
	<!-- NAVBAR -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark text-white">
        <div class="container">
        	<h1 class="text-center">Sign-Up</h1>
        </div>
	</nav>
	
	<!-- JUMBOTRON -->
    <div class="jumbotron text-center">
      <div class="container">
        <h1>Welcome to Java Email Verification Project</h1>
        <p>It is a Java application created to generate verification links. It will send users an email requiring them to click a link to verify their email before their email is added to whatever you want to add it to.</p>
        <a href="https://github.com/theDeepanshuMourya/Java-Email-Verification-Using-Link" target="_blank" class="btn btn-primary">Read more</a>
      </div>
    </div>
	
	<!-- CONTAINER -->
	<div class="container">
		<form action="RegisterUser" method="post">			
			<div class="form-row">				
				<div class="form-group col-md-6">
				  <input type="text" name="first_name" id="n1" class="form-control" placeholder="First name">
				</div>
				
				<div class="form-group col-md-6">
				  <input type="text" name="last_name" id="n2" class="form-control" placeholder="Last name">
				</div>
			</div>
			
			<div class="form-group">
				<input type="email" name="email" id="n3" class="form-control" placeholder="Email">
			</div>
			
			<div class="form-group">
				<input type="password" name="password" id="n4" class="form-control" placeholder="Password">
			</div>
			
			<input type="submit" class="btn btn-primary btn-default btn-block" value="Submit"/>		
		</form>
	</div>
	
	<!-- FOOTER -->
	<footer class="footer mt-4 text-muted text-center text-small">
      <p class="text-center">Email Verification &copy; 2018, All Rights Reserved.</p>
    </footer>
</body>
</html>
