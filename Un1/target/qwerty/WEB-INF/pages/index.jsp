
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
      <link href="<s:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
     <!-- Custom styles for this template -->
     <link href="<s:url value='/resources/css/signin.css'/>" rel="stylesheet">

 </head>

 <body>
<h1>Message ${message}</h1>
 <div class="container">

     <form class="form-signin">
         <h2 class="form-signin-heading">Please sign in</h2>
         <label for="inputEmail" class="sr-only">Email address</label>
         <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
         <label for="inputPassword" class="sr-only">Password</label>
         <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
         <div class="checkbox">
             <label>
                 <input type="checkbox" value="remember-me"> Remember me
             </label>
         </div>
         <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
     </form>

 </div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
