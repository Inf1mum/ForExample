
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">

    <title>Signin Template for Bootstrap</title>

    <link href="<s:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<s:url value='/resources/css/general.css'/>" rel="stylesheet">

</head>
<body>
<div class="container pt">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="well well-sn">
                <form class="form-horizontal" action="/j_spring_security_check" method="post">
                    <fieldset>
                        <legend class="text-center">Sign in</legend>
                        <div class="form-group">
                            <label class="col-md-3 control-label">Login</label>
                            <div class="col-md-9">
                                <input type="text"  class="form-control" placeholder="Login" name="j_username" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-3 control-label">Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" placeholder="Password" name="j_password" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-3 control-label">Remember me</label>
                            <div class="col-md-9 cbox ">
                                <input type="checkbox"  name="_spring_security_remember_me">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12 text-right">
                                <button class="btn btn-lg btn-primary" type="submit">Sign in</button>
                            </div>
                        </div>
                        </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>





</body>
</html>
