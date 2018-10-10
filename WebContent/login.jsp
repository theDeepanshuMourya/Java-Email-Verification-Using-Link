<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<title>Sign-In Page</title>
</head>

<body>
	<!-- NAVBAR -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark text-white">
        <div class="container">
        	<h1 class="text-center">Sign-In</h1>
        </div>
	</nav>
	
	<!-- JUMBOTRON -->
    <div class="jumbotron text-center">
      <div class="container">
        <h1>Congratulations!</h1>
        <p class="lead text-center">Your Account has been verified.</p>
      </div>
    </div>
	
	<!-- CONTAINER -->
	<div class="container">
		<div class="card card-body">
			<form action="" method="post">
				<div class="form-group">
					<input type="email" name="email" id="n1" class="form-control" placeholder="Email">
				</div>
				
				<div class="form-group">
					<input type="password" name="password" id="n2" class="form-control" placeholder="Password">
				</div>
			
				<input type="submit" class="btn btn-primary btn-block" value="Submit"/>			
			</form>
		</div>		
	</div>
	
	<!-- FOOTER -->
	<footer class="footer mt-5 text-muted text-md-center text-small">
      <p class="text-center">Email Verification &copy; 2018, All Rights Reserved.</p>
    </footer>	
</body>
</html>