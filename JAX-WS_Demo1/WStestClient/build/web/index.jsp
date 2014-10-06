<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JAX-WS Example</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/cover.css" rel="stylesheet">

    </head>
    <body>
        <div class="site-wrapper">

            <div class="site-wrapper-inner">

                <div class="cover-container">

                    <div class="masthead clearfix">
                        <div class="inner">
                            <h3 class="masthead-brand">JAX-WS Client Login</h3>
                            <ul class="nav masthead-nav">
                                <li class="active"><a href="index.jsp">Home</a></li>
                                <li><a href="about.jsp">About</a></li>
                            </ul>
                        </div>
                    </div>

                    <div id="login" class="inner cover">
                        <h3 class="cover-heading pull-left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User Login:</h3>
                        <div class="row">
                            <div class="col-lg-offset-1 col-lg-10">
                                <form id="form1" class="form-inline" action="UserServlet" method=post>
                                    <label class="sr-only" for="Username">Username</label> 
                                    <div class="input-group">
                                        <input name="username" type="text" class="form-control" placeholder="Enter Username">
                                    </div>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <div class="input-group">
                                        <label class="sr-only" for="Password">Password</label>
                                        <input name="password" type="password" class="form-control" placeholder="Enter Password"> 
                                    </div>
                                    <div class="input-group pull-right">     
                                        <button class="btn btn-primary" type="submit">Login</button>
                                    </div>
                                </form>
                                <%String error = (String)request.getAttribute("error");
                                if(error!=null){%>
                                <h4 style="color: #FF6633"><%=error%></h4><%}%>
                            </div>
                        </div>

                    </div>

                    <div class="mastfoot">
                        <div class="inner">
                            <p>Copyright @ Rui Bi</p>
                        </div>
                    </div>

                </div>

            </div>

        </div>



        <script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
