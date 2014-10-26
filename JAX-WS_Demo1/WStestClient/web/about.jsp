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
        <title>Twitter Search</title>

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
                            <h3 class="masthead-brand">Twitter Search</h3>
                            <ul class="nav masthead-nav">
                                <li><a href="index.jsp">Home</a></li>
                                <li class="active"><a href="about.jsp">About</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="inner">
                        <div class="row"><br/></div>
                        <div class="row">
                            <div class="col-lg-12">
                                <h3>My Procedure:</h3>
                                <h4>oAuth 1.1 authentication</h4>
                                <h4>RESTful Get Action</h4>
                                <h4>Response value as JSON format</h4>
                                <h4>Transfer JSON to Java Class by GSON</h4>
                            </div>
                        </div>
                    </div>

                  

                </div>

            </div>

        </div>






        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
