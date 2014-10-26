<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">
<!DOCTYPE html>
<%@ page import="wstest.UserInfo"%>
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

            <div class="site-wrapper-inner-dash">

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


                    <div class="row result" style="margin-top:25%">
                        <div class="col-lg-offset-2 col-lg-8">
                            <h2 style="color: #9999FF">Your Information:</h2>
                            <table class="table table-hover">
                                <thead><tr><th><a >Attributes</a></th><th><a>Content</a></th></tr></thead>
                                <tbody >
                                    <%
                                        List<UserInfo> infoList = new ArrayList<UserInfo>();
                                        infoList = (List<UserInfo>) request.getAttribute("infoList");
                                        int resultSize = infoList.size();
                                        if (infoList != null) {
                                        for (int i = 0; i < resultSize; i++) {%>

                                    <tr><td>Email:</td><td><%=infoList.get(i).getEmail()%></td></tr>
                                    <tr><td>First Name:</td><td><%=infoList.get(i).getFName()%></td></tr>
                                    <tr><td>Last Name:</td><td><%=infoList.get(i).getLName()%></td></tr>
                                    <%}
                                    }%>
                                </tbody>
                            </table>
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
